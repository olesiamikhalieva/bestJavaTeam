package ht8_26_01_18.t15;

/**
 * Created by java on 30.01.2018.
 */
public class Polynom extends Array {

    public Polynom(int c0, int c1, int c2, String x1, String x2) {
        super(c0, c1, c2, x1, x2);
    }

    public String polinom(){
        return constArray[0] + " + " + constArray[1] + variableArray[0] + " + " + constArray[2] + variableArray[1];
    }
}
