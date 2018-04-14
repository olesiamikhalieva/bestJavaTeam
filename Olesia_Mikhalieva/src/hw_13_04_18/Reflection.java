package hw_13_04_18;
/*
Написать метод который принимает входящим параметром любой объект, и преобразует все стринговые поля входящего обьекта в нижний регистр.
- аналогично, но метод  преобразует все строковые поля объекта в верхний регистр.
У Объекта могут быть поля разных типов,строка, логический тип, целочисленный и т.д (
 */

import java.lang.reflect.Field;

public class Reflection {
    public static void main(String[] args) throws IllegalAccessException {
        Class MyClass = House.class;
        Field[] fields = MyClass.getFields();
        fieldsToLowCase(fields);
        fieldsToUpperCase(fields);

    }

    private static void fieldsToUpperCase(Field[] fields) throws IllegalAccessException {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].toString().contains("String")) {
                House instance = new House();
                instance.street = fields[i].get(instance).toString().toUpperCase();
                instance.name = fields[i].get(instance).toString().toUpperCase();
                System.out.println(fields[i] + "---" + fields[i].get(instance));
            }
        }
    }


    private static void fieldsToLowCase(Field[] fields) throws IllegalAccessException {
        for (int i = 0; i < fields.length; i++) {
            if (fields[i].toString().contains("String")) {
                House instance = new House();
                instance.street = fields[i].get(instance).toString().toLowerCase();
                instance.name = fields[i].get(instance).toString().toLowerCase();
                System.out.println(fields[i] + "---" + fields[i].get(instance));
            }
        }
    }
}



