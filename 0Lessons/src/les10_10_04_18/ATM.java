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

    public int getMoney(int money) {
        lock.lock();
        int sum = 0;
        try {
            if (balance - money >= 0) {
                balance -= money;
                System.out.println("Вы сняли -- " + money + ", у вас осталось -- " + balance);
                sum = money; // если условие верно, то вернем ту сумму, которую запросили
            } else if (balance - money < 0) {
                System.out.println("у вас нат такой суммы на карточке, " + "у вас есть -- " + balance + ", вы пытались снять --" + money);
            } else {
                System.out.println("Вы банкрот");
            }
        } finally {
            lock.unlock();
        }
        return sum;
    }

    public boolean setMoney(int money){
        lock.lock();
        this.balance += money;
        System.out.println("Вы добавили к своему вкладу -- " + money + ", Теперь вы имеете -- " + this.balance);
        lock.unlock();
        return true;
    }
}
