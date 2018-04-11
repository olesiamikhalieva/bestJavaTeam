package hw_11_04_18.anotherSolution;

import hw_11_04_18.Account;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadPutMoney implements Runnable {

    Money money;
    Account account;
    Lock lock = new ReentrantLock();

    public ThreadPutMoney(Account account, Money money ) {
        this.money = money;
        this.account = account;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            account.setBalance(account.getBalance() + money.getMoney());
            System.out.println("You put " + money.getMoney() + " " + account.getNameMoney() + ". Your balance is " + account.getBalance() + " " + account.getNameMoney() + ".");
        } finally {
            lock.unlock();
        }
    }

}
