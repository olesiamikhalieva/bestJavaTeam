package les9_03_04_18;

public class Portfolio extends Thread {

    public Portfolio(String threadName) {
        super(threadName);
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                sleep(700);                //	Sleep	for	700	milliseconds
                System.out.println("You	have	" + (500 + i) +
                        "	shares	of	IBM");
            }
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName()
                    + e.toString());
        }
    }
}