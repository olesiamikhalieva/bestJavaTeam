package hw_11_04_18.anotherSolution;

import hw_11_04_18.Account;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadGetMoney implements Runnable {
    Account account;
    Money money;
    Lock lock = new ReentrantLock();

    public ThreadGetMoney(Account account, Money money) {
        this.account = account;
        this.money = money;
    }

    @Override
    public void run() {
        lock.lock();
        try {
            if (account.getBalance() >= money.getMoney()) {
                account.setBalance(account.getBalance() - money.getMoney());
                System.out.println("Take your money - " + money.getMoney() + " " + account.getNameMoney() + ". Your balance is " + account.getBalance() + " " + account.getNameMoney() + ".");
            } else if (account.getBalance() < money.getMoney()) {
                System.out.println("You don't have enough money, enter another amount. Your balance is " + account.getBalance() + " " + account.getNameMoney() + ".");
            }
        } finally {
            lock.unlock();

        }
    }
}
