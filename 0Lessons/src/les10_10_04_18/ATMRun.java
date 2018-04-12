package les10_10_04_18;

import java.util.TreeMap;

/**
 * Created by java on 10.04.2018.
 */
public class ATMRun {
    public static void main(String[] args) throws InterruptedException {
        ATM myAtm = new ATM();

        Utils.newThreadFoGetMoney(1000,myAtm);
        Utils.newThreadFoGetMoney(400,myAtm);
        Utils.newThreadFoGetMoney(800,myAtm);
    }


}
