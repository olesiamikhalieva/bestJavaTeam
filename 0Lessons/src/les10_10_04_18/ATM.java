package les10_10_04_18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by java on 10.04.2018.
 */
public class ATM{

    private int balance = 1200;
    private String currency = "UAH";
    private Lock lock = new ReentrantLock();

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void getMoney(int money) {
        lock.lock();
        try {
            if (balance - money > 0) {
                balance -= money;
                System.out.println("you get " + money + "you have " + balance);
            } else if (balance - money < 0) {
                System.out.println("you can`t get this sum, check balance " + "you have " + balance + " you get " + money);
            } else {
                System.out.println("you don`t have money");
            }
        } finally {
            lock.unlock();
        }

    }

}
