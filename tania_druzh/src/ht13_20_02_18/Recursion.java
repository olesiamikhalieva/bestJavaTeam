package ht13_20_02_18;

public class Recursion {
    void countDown(int i){
        if (i < 0) return;
        System.out.println(i--);
        countDown(i);
    }
}
