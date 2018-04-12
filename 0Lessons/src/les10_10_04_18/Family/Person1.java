package les10_10_04_18.Family;

import les10_10_04_18.ATM;

public class Person1 implements MethodsFamily {

    private int money = 0;
    private boolean flag = false;

    @Override
    public int getMoney(ATM atm, int sum) throws Exception {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Person 1 пытаюсь снять " + sum);
                money = atm.getMoney(sum);
            }
        };
        thread.start();
        return money;
    }

    @Override
    public boolean setMoney(ATM atm, int sum) {
        Thread thread = new Thread() {
            @Override
            public void run() {
                System.out.println("Person 1 пытаюсь положить " + sum);
                atm.setMoney(sum);
                flag = true;
            }
        };
        thread.start();
        return flag;
    }
}
