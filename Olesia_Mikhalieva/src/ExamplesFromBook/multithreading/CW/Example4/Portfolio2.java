package ExamplesFromBook.multithreading.CW.Example4;

public class Portfolio2 implements Runnable {

@Override
    public void run() {
        System.out.println(
                "You have 500 shares of IBM");
    }
}