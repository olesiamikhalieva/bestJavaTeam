package ht8_26_01_18.t15;

/**
 *Даны 2 класса Array.java(родительский класс) и Polynom.java(наследуемый класс).
 В классе Array.java необходимо определить методы создания двух массивов:
 массив констант {с0,с1,с2} типа Integer, и массив переменных {x1,x2}.
 В классе Polynom.java определить метод, который из данных двух массивов образует полином вида: с0+с1х1+с2х2 с помощью наследования.
 Вывод полинома произвести в классе Runner.java.
 */
public class Runner {
    public static void main(String[] args) {
        Polynom polynom = new Polynom(5,4,8,"x1","x2");
        System.out.println(polynom.polinom());
    }
}
