package ht15_02_03_18.Birds;

import ht15_02_03_18.Int.Fly;

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