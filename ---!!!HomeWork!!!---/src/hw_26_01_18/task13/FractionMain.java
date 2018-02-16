package hw_26_01_18.task13;

public class FractionMain {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(2, 3);
        Fraction fraction2 = new Fraction(6, 2);

        System.out.println("Первая дробь: " + fraction1.printFraction());
        System.out.println("Вторая дробь: " + fraction2.printFraction());

        sumFractions(fraction1, fraction2);
        differenceFractions(fraction1, fraction2);
        multiplyFractions(fraction1, fraction2);
        divisionFractions(fraction1, fraction2);

        multiFractionOnNumber(fraction1, 5);
        divisionFractionOnNumber(fraction1,3);
    }

    public static void sumFractions(Fraction fraction1, Fraction fraction2) {
        Fraction results = new Fraction();

        results.setNumerator(fraction1.getNumerator() * fraction2.getDenominator() + fraction2.getNumerator() * fraction1.getDenominator());
        results.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());

        System.out.println("Сума: ");
        System.out.println(results.getNumerator() + " / " + results.getDenominator());
    }

    public static void differenceFractions(Fraction fraction1, Fraction fraction2) {
        Fraction results = new Fraction();

        results.setNumerator(fraction1.getNumerator() * fraction2.getDenominator() - fraction2.getNumerator() * fraction1.getDenominator());
        results.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());

        System.out.println("Разница: ");
        System.out.println(results.getNumerator() + " / " + results.getDenominator());
    }

    public static void multiplyFractions(Fraction fraction1, Fraction fraction2) {
        Fraction results = new Fraction();

        results.setNumerator(fraction1.getNumerator() * fraction2.getNumerator());
        results.setDenominator(fraction1.getDenominator() * fraction2.getDenominator());

        System.out.println("Умножение: ");
        System.out.println(results.getNumerator() + " / " + results.getDenominator());
    }

    public static void divisionFractions(Fraction fraction1, Fraction fraction2) {
        Fraction results = new Fraction();

        results.setNumerator(fraction1.getNumerator() * fraction2.getDenominator());
        results.setDenominator(fraction1.getDenominator() * fraction2.getNumerator());

        System.out.println("Деление: ");
        System.out.println(results.getNumerator() + " / " + results.getDenominator());
    }

    public static void multiFractionOnNumber(Fraction fraction1, int num) {
        Fraction results = new Fraction();

        results.setNumerator(fraction1.getNumerator() * num);
        results.setDenominator(fraction1.getDenominator());

        System.out.println("Умножение дроби на число: ");
        System.out.println(results.getNumerator() + " / " + results.getDenominator());
    }

    public static void divisionFractionOnNumber(Fraction fraction1, int num) {
        Fraction results = new Fraction();

        results.setNumerator(fraction1.getNumerator());
        results.setDenominator(fraction1.getDenominator() * num);

        System.out.println("Умножение дроби на число: ");
        System.out.println(results.getNumerator() + " / " + results.getDenominator());
    }
}
