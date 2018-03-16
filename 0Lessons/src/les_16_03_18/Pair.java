package les_16_03_18;

import hw_26_01_18.task2.SamsungGalaxyS2;
import les_06_03_18.Employer;

import java.util.IdentityHashMap;

/**
 * Created by java on 16.03.2018.
 */
public class Pair<T extends Employer> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public Pair() {

    }


    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

//    public void check(){
//        if (first instanceof String){
//            System.out.println("i am string -> " + first + " " +second);
//
//        }
//        else if (first instanceof Integer && second instanceof Integer ){
//            System.out.println((Integer) first + (Integer) second);
//        } else{
//            System.out.println("i don`t");
//        }
//    }
}
