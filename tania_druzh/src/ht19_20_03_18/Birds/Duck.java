package ht19_20_03_18.Birds;


public class Duck extends Bird {


    public Duck(String name) {
        super(name);
    }

    @Override
    public void sound() {
        System.out.print(" krya ");
    }


}