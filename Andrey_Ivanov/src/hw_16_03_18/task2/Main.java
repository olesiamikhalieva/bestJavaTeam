package hw_16_03_18.task2;

import java.util.ArrayList;

/*-Написать класс, который умеет хранить в себе массив
 любых типов данных (int, long etc.). Реализовать метод,
  который возвращает любой элемент массива по индексу.
  */

public class Main {

    public static void main(String[] args) {

        Test<String>stringTest=new Test<>();
        stringTest.setMass(new String[]{"one","two","three","four","five"});
        System.out.println(stringTest.getE(2));

        Test<Integer>integerTest=new Test<>();
        integerTest.setMass(new Integer[]{1,2,3,4,5,});
        System.out.println(integerTest.getE(4));

    }

}
