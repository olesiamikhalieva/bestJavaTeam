package ht8_26_01_18.t12_1;

public class ComplexRunner {
    private static  Complex c1;
    private static  Complex c2;
    public static void main(String[] args) {
        testInt();
        testDouble();
    }

    private static void testDouble() {
        c1 = new ComplexDouble(5d,4d);
        System.out.println(c1.toString());
        c2 = new ComplexDouble(6d, -7d);
        c1.addition(c2);
        System.out.println(c2.toString());
        System.out.println("addition " + c1.toString());
        c1.setRealD(5d);
        c1.setRealD(4d);
        c1.subtraction(c2);
        System.out.println("subtraction " + c1.toString());
        c1.setRealD(5d);
        c1.setRealD(4d);
        c1.multiplication(c2);
        System.out.println("multiplication " + c1.toString());
        c1.setRealD(5d);
        c1.setRealD(4d);
        c1.division(c2);
        System.out.println("division " + c1.toString());
    }

    private static void testInt() {
        c1 = new ComplexInt(5,4);
        System.out.println(c1.toString());
        c2 = new ComplexInt(6, -7);
        c1.addition(c2);
        System.out.println(c2.toString());
        System.out.println("addition " + c1.toString());
        c1.setReal(5);
        c1.setImage(4);
        c1.subtraction(c2);
        System.out.println("subtraction " + c1.toString());
        c1.setReal(5);
        c1.setImage(4);
        c1.multiplication( c2);
        System.out.println("multiplication " + c1.toString());
        c1.setReal(5);
        c1.setImage(4);
        c1.division( c2);
        System.out.println("division " + c1.toString());
    }
}
