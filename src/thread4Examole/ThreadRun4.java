package thread4Examole;

public class ThreadRun4 {
    public static void main(String args[]) {

        MatketNews3 mn = new MatketNews3("Market	News");
        mn.start();
        Portfolio3 p = new Portfolio3("PorLolio	data");
        p.start();

        System.out.println("The	main	method	of	TestThreads3	is	finished");
    }
}

