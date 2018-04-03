package les9_03_04_18;

public class TestThreads {
    public static void main(String args[]) {

        MarketNews mn = new MarketNews("Market	News");
        mn.start();
        Portfolio p = new Portfolio("PorLolio	data");
        p.start();

        System.out.println("The	main	method	of	TestThreads3	is	finished");
    }
}