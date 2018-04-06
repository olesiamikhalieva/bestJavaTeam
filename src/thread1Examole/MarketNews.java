package thread1Examole;


public class MarketNews extends Thread {
    public MarketNews(String threadName) {
        super(threadName); // name your thread
    }


    @Override
    public void run() {
        System.out.println(
                "The stock market is improving!");
    }

    public  void methodOne(){
        System.out.println("simple method");
    }
}

