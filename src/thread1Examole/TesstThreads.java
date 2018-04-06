package thread1Examole;

public class TesstThreads {

    public static void main(String args[]) {
        MarketNews mn = new MarketNews("Market News");
        mn.start();
   //     mn.methodOne();
//
        Portfolio p = new Portfolio("Portfolio2 data");
       p.start();
      //  p.methodTwo();
//
        System.out.println("TestThreads is finished");
    }
}