package hw_11_04_18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    Account account;

    public ATM(Account account) {
        this.account = account;
    }

    private Lock lock = new ReentrantLock();

    public void getMoney(int money){
        lock.lock();
        try {
            if (account.getBalance()>=money){
                account.setBalance(account.getBalance()-money);
                System.out.println("Take your money - " +money+" "+account.getNameMoney()+". Your balance is "+account.getBalance()+" "+ account.getNameMoney() +".");
            }
            else if (account.getBalance()<money){
                System.out.println("You don't have enough money, enter another amount. Your balance is "+account.getBalance()+" "+account.getNameMoney()+".");
            }
        }finally {
            lock.unlock();
        }
    }

    public void putMoney(int money){
        lock.lock();
        try {
            account.setBalance(account.getBalance()+money);
            System.out.println("You put "+money+" "+account.getNameMoney()+". Your balance is "+account.getBalance()+" "+account.getNameMoney()+".");
        }finally {
            lock.unlock();
        }
    }

}
