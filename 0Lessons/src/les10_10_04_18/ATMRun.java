package les10_10_04_18;

import les10_10_04_18.Family.Person1;
import les10_10_04_18.Family.Person2;
import les10_10_04_18.Family.Person3;

import java.util.TreeMap;

/**
 * Created by java on 10.04.2018.
 */
public class ATMRun {
    public static void main(String[] args) throws Exception {
        ATM myAtm = new ATM();

//        Utils.newThreadFoGetMoney(1000,myAtm);
//        Utils.newThreadFoGetMoney(400,myAtm);
//        Utils.newThreadFoGetMoney(800,myAtm);

        Person1 person1 = new Person1();
        Person2 person2 = new Person2();
        Person3 person3 = new Person3();

        System.out.println("пытаемся снять деньги одновременно \n");
        person1.getMoney(myAtm,1000);
        System.out.println("1");
        person2.getMoney(myAtm,1000);
        System.out.println("2");
        person3.getMoney(myAtm,1000);
        System.out.println("3");
        person3.getMoney(myAtm,200);
        System.out.println("4");

        person2.getMoney(myAtm,300);
        System.out.println("5");
        person1.setMoney(myAtm,2000);
        System.out.println("6");
        person2.getMoney(myAtm,300);
        System.out.println("7");
        person1.setMoney(myAtm,2000);
        System.out.println("8");
        person2.getMoney(myAtm,1700);
    }


}
