package hw_10_04_18;

public class Runner {
    public static void main(String[] args) {

        Account account=new Account(1500);

        Thread t=new Thread(new ATM(account,500));
        t.start();
        try {
            t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t2=new Thread(new ATM(account,700));
        t2.start();
        try {
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread t3=new Thread(new ATM(account,500));
        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
