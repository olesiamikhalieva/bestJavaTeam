package ht15_02_03_18.Birds;

import ht15_02_03_18.Int.RunLikeAnAntelope;

public class Ostrich extends Bird implements RunLikeAnAntelope {

    @Override
    public void sound() {
        System.out.print(" krya ");
    }

    @Override
    public void run() {
        System.out.print(" I run very fast ");
    }
}
