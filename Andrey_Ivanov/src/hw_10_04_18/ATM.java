package hw_10_04_18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM implements Runnable {

    Account account;
    int money;
    Lock lock = new ReentrantLock();

    public ATM(Account account, int money) {
        this.account = account;
        this.money = money;
    }

    public synchronized void getMoney(int money) {
       // lock.lock();
        if (account.getBalance() >= money) {
            System.out.println("Вы сняли " + money + ",остаток=" + (account.getBalance() - money));
            account.setBalance(account.getBalance() - money);
        } else if (money > account.getBalance()) {
            System.out.println("Невозможно снять " + money + ",текущий остаток=" + account.getBalance());
        }
        //lock.unlock();
    }

    @Override
    public void run() {
        if (account.getBalance()>money) {
            getMoney(money);
        }
        else if (account.getBalance()<money){
            System.out.println("Невозможно снять " + money + ",текущий остаток=" + account.getBalance());
            putMoney(money);
        }
    }
    public void putMoney(int money){
        account.setBalance(account.getBalance()+money);
        System.out.println("Ваш остаток пополнен на "+money+". Остаток="+account.getBalance());
    }

}
