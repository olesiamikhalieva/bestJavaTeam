package les10_10_04_18;

/**
 * Created by java on 10.04.2018.
 */
public class Utils {
    public static void newThreadFoGetMoney(int sum, ATM myAtm){
        Thread thread = new Thread(){
            @Override
            public void run() {
                myAtm.getMoney(sum);
            }
        };
        thread.start();
    }
}
