package hw__26_01_18.task13;

public class Main {
    public static void main(String[] args) {

        Fraction fraction = new Fraction(100, 5);

        System.out.println(fraction.toString());                  //вывод дроби в строке
        System.out.println(fraction.additionFraction(120,5));//добавление к дроби другой дроби и вывод в строке
        System.out.println(fraction.multiplication(20));        //умножение дроби на число типа double и вывод в строке
        System.out.println(fraction.division(2));               //деление дроби на число типа double и вывод в строке
    }
}