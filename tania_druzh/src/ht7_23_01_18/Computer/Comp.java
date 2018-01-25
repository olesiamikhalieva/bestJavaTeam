package ht7_23_01_18.Computer;

import ht7_23_01_18.Computer.SystemUnit.SystemUnit;

public class Comp {
    private SystemUnit systemUnit;
    private Monitor monitor;
    private Keyboard keyboard;

    public Comp() {
    }

    public Comp(SystemUnit systemUnit, Monitor monitor, Keyboard keyboard) {
        this.systemUnit = systemUnit;
        this.monitor = monitor;
        this.keyboard = keyboard;
    }

    public SystemUnit getSystemUnit() {
        return systemUnit;
    }

    public void setSystemUnit(SystemUnit systemUnit) {
        this.systemUnit = systemUnit;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public void printCompInfo(){
        System.out.println("System unit: ");
        systemUnit.printUnitStatus();
        System.out.println("Monitor: " + monitor.getModel() + " " + monitor.getDiagonal() + "''");
        System.out.println("Keyboard: " + keyboard.getModel());
    }
}
