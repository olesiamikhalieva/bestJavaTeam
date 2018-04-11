package hw_11_04_18.anotherSolution;

import hw_11_04_18.Account;

public class Runner {
    public static void main(String[] args) {


        Account account = new Account(1300, "UAH");

        Thread thread1 = new Thread(new ThreadGetMoney(account, new Money(1200)), "thread1");
        thread1.start();

        Thread thread2 = new Thread(new ThreadPutMoney(account, new Money(90)), "thread1");
        thread2.start();

        Thread thread3 = new Thread(new ThreadGetMoney(account, new Money(300)), "thread1");
        thread3.start();

        Thread thread4 = new Thread(new ThreadGetMoney(account, new Money(12)), "thread1");
        thread4.start();

    }
}
