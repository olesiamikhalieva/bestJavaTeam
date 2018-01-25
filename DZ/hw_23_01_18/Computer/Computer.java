package Computer;

import Computer.ComputerElement.Keyboard;
import Computer.ComputerElement.Mouse;
import Computer.ComputerElement.Monitor;
import Computer.ComputerElement.SystemUnit;

// Todo - good
public class Computer {

    private Keyboard keyboard = new Keyboard();
    private Monitor monitor = new Monitor();
    private Mouse mouse = new Mouse();
    private SystemUnit systemUnit = new SystemUnit();

    public Computer() {
    }

    public Computer(Keyboard keyboard, Monitor monitor, Mouse mouse, SystemUnit systemUnit) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.monitor = monitor;
        this.systemUnit = systemUnit;
        System.out.println("Компьютер собран правильно");
    }

    public Computer(Monitor monitor, Mouse mouse, SystemUnit systemUnit) {
        this.monitor = monitor;
        this.mouse = mouse;
        this.systemUnit = systemUnit;
        System.out.println("Ага, а печатать то ты чем будешь?");
    }

    public Computer(Keyboard keyboard, Monitor monitor, SystemUnit systemUnit) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.systemUnit = systemUnit;
        System.out.println("а-а, без мышки никак");
    }

    public Computer(Keyboard keyboard, Mouse mouse, SystemUnit systemUnit) {
        this.keyboard = keyboard;
        this.mouse = mouse;
        this.systemUnit = systemUnit;
        System.out.println("А смотреть-то куда, а окно? А хотя, какая разница. Хоть глаза здоровіе остануться :)");
    }

    public Computer(Keyboard keyboard, Monitor monitor, Mouse mouse) {
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
        System.out.println("Ну без системника вообще никак, ну никак");
    }

    public Keyboard getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(Keyboard keyboard) {
        this.keyboard = keyboard;
    }

    public Mouse getMouse() {
        return mouse;
    }

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public SystemUnit getSystemUnit() {
        return systemUnit;
    }

    public void setSystemUnit(SystemUnit systemUnit) {
        this.systemUnit = systemUnit;
    }
}

