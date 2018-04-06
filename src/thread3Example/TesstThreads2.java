package thread3Example;

public class TesstThreads2 {
    public static void main(String args[]){

        MarketNews2 mn2 = new MarketNews2();
        Thread threadh = new Thread(mn2,"Market News");
        threadh.start();

        Runnable port2 = new Portfolio2();
        Thread p = new Thread(port2, "Portfolio Data");
        p.start();

        System.out.println( "TestThreads2 is finished");
    }
}