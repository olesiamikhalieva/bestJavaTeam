package ExamplesFromBook.multithreading.CW.Example1;

import ExamplesFromBook.multithreading.CW.Example1.MarketNews;
import ExamplesFromBook.multithreading.CW.Example1.Portfolio;

public class Runner {
    public static void main(String args[]) {
        MarketNews mn = new MarketNews("Market News");
        mn.start();
      //  mn.methodOne();

        Portfolio p = new Portfolio("Portfolio data");
        p.start();
       // p.methodTwo();

        System.out.println("TestThreads is finished");
    }
}

