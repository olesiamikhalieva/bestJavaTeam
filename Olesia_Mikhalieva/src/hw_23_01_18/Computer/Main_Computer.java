package hw_23_01_18.Computer;

public class Main_Computer {
    public static void main(String[] args) {


        Keyboard keyboard = new Keyboard();
        SystemUnit systemUnit = new SystemUnit(5);
        Printer printer = new Printer();
        Monitor monitor = new Monitor();
        Computer computer = new Computer(keyboard,monitor,printer,systemUnit);
        System.out.println("__________________");
        Computer computer1 = new Computer(keyboard,monitor,printer);


    }
}
