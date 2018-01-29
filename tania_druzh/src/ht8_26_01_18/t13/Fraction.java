package ht8_26_01_18.t13;

/*13 Создайте класс с именем fraction, содержащий два поля типа int - числитель и знаменатель обыкновенной дроби.*/

public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
    }

    /*Конструктор класса должен инициализировать их заданным набором значений.*/
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

    /*Создайте метод класса, который будет выводить дробь в текстовую строку в формате x / y;*/
    @Override
    public String toString() {
        return "Fraction{" +
                numerator +
                " / " + denominator +
                '}';
    }

    /*метод, добавляющий (сложение) к текущей дроби дробь, переданную ему в параметре и возвращающий дробь - результат сложения;*/
    public Fraction addition(Fraction otherFraction){
        numerator = numerator * otherFraction.denominator + denominator * otherFraction.numerator;
        denominator = denominator * otherFraction.denominator;
        return this;
    }

    /*метод, умножающий (произведение) текущую дробь на число типа double,
    переданное ему в параметре и возвращающий дробь - результат умножения;*/
    public Fraction multiplicationDouble(double d){
        
    }
}
