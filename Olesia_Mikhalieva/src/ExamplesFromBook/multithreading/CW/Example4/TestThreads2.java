package ExamplesFromBook.multithreading.CW.Example4;

public class TestThreads2 {
    public static void main(String args[]) {

        MarketNews2 mn2 = new MarketNews2();
        Thread mThread = new Thread(mn2, "Market News");
        mThread.start();

        Runnable port2 = new Portfolio2();
        Thread pThread = new Thread(port2, "Portfolio Data");
        pThread.start();

        System.out.println("TestThreads2 is finished");
    }
}

