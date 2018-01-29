package ht8_26_01_18.t13;

public class FractionRunner {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(7,8);
        System.out.println(fraction.toString());
        Fraction fraction1 = new Fraction(3,5);
        System.out.println(fraction1.toString());
        fraction.addition(fraction1);
        System.out.println(fraction.toString());

        fraction.setNumerator(5);
        fraction.setDenominator(6);
        double d = 4.2d;
        fraction.multiplicationDouble(d);
        System.out.println(fraction.toString());

        fraction.setNumerator(5);
        fraction.setDenominator(6);
        fraction.divisionDouble(d);
        System.out.println(fraction.toString());
    }
}
