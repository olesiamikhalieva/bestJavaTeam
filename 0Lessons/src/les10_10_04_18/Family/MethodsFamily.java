package les10_10_04_18.Family;

import les10_10_04_18.ATM;

public interface MethodsFamily {
    public int getMoney(ATM atm, int sum) throws Exception;
    public boolean setMoney(ATM atm, int sum) throws Exception;
}
