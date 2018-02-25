package hw_23_01_18.Computer;

import hw_23_01_18.Computer.ComputerElement.*;

public class ComputerMain {
    public static void main(String[] args) {


        Computer computer = new Computer();
        Keyboard keyboard = new Keyboard();
        Monitor monitor = new Monitor();
        Mouse mouse = new Mouse();
        SystemUnit systemUnit = new SystemUnit();

        computer.setKeyboard(keyboard);
        computer.setMonitor(monitor);
        computer.setMouse(mouse);
        computer.setSystemUnit(systemUnit);

        computer.getKeyboard().print();
        computer.getMonitor().look();
        computer.getMouse().run();
        computer.getSystemUnit().working();

        Computer computer1 = new Computer(keyboard, monitor, mouse, systemUnit);
        Computer computer2 = new Computer(monitor,mouse,systemUnit);
        Computer computer3 = new Computer(keyboard,monitor,systemUnit);
        Computer computer4 = new Computer(keyboard,mouse,systemUnit);
        Computer computer5 = new Computer(keyboard,monitor,mouse);

    }
}
