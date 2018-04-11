package hw_11_04_18;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class UtilsMoney {

    private static Lock lockThread = new ReentrantLock();

    public static void newTreadForGetMoney(int money, ATM atm) {
        try {
            lockThread.lock();
            Thread threadGetMoney = new Thread("ThreadGetMoney") {
                @Override
                public void run() {
                    atm.getMoney(money);
                }
            };
            threadGetMoney.start();
        } finally {
            lockThread.unlock();
        }
    }

    public static void newTreadForPutMoney(int money, ATM atm) {
        try {
            lockThread.lock();
            Thread threadPutMoney = new Thread("ThreadPutMoney") {
                @Override
                public void run() {
                    atm.putMoney(money);
                }
            };
            threadPutMoney.start();
        } finally {
            lockThread.unlock();
        }
    }

}
