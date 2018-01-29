package hw__26_01_18.task13;

public class Fraction {

    private int numerator;
    private int denominator;

    public Fraction() {
    }
    public String toString() {
        return "x=" + numerator +
                "/y=" + denominator +" Результат в строке: "+Integer.toString(numerator/denominator);
    }
    public String additionFraction(int a, int k) {
        return "x=" + numerator +
                "/y=" + denominator +" + a="+a+"/k="+k+" Результат сложения дробей в строке: "+Integer.toString((numerator/denominator)+(a/k));
    }
    public String multiplication(double c){
        double mult=numerator/denominator*c;
        return "x=" + numerator +
                "/y=" + denominator +" * число "+c+" Результат умножения в строке: "+Double.toString(mult);
    }
    public String division(double c){
        double div=numerator/denominator/c;
        return "x=" + numerator +
                "/y=" + denominator +" / число "+c+" Результат деления в строке: "+Double.toString(div);
    }
    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
}
