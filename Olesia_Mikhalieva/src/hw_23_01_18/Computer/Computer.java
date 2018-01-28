package hw_23_01_18.Computer;

public class Computer {
private Keyboard keyboard;
private Monitor monitor;
private Printer printer;
private SystemUnit systemUnit;

    public Computer() {
    }

    public Computer(Keyboard keyboard, Monitor monitor, Printer printer, SystemUnit systemUnit) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.printer = printer;
        this.systemUnit = systemUnit;
        System.out.println("The copmuter is ready for working.");
        monitor.show();
        printer.print();
        systemUnit.getrAM();
        keyboard.getTyping();
    }

    public Computer(Keyboard keyboard, Monitor monitor, Printer printer) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.printer = printer;
        System.out.println("Unfortunately you can't work without system unit(");
    }

    public Computer(Keyboard keyboard, Monitor monitor, SystemUnit systemUnit) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.systemUnit = systemUnit;
        System.out.println("You can work but not print.");
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }

    public SystemUnit getSystemUnit() {
        return systemUnit;
    }

    public void setSystemUnit(SystemUnit systemUnit) {
        this.systemUnit = systemUnit;
    }
}
