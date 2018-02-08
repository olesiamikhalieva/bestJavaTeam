package ht10_06_02_18.Birds;

import ht10_06_02_18.Int.Fly;

public class Duck extends Bird implements Fly {
    @Override
    public void fly() {
        System.out.print(" I am duck, a can fly ");
    }

    @Override
    public void sound() {
        System.out.print(" krya ");
    }


}