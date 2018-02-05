package hw_26_01_18.Polynom;

import java.util.Arrays;

public class Polynom extends Array {

    @Override
    public int[] masConst() {
        return super.masConst();
    }

    @Override
    public String[] mas() {
        return super.mas();
    }

    public void maspolynom(){
            System.out.println(masConst()[0]+" + "+masConst()[1]+mas()[0]+" + "+masConst()[2]+mas()[1]);
        }
}
