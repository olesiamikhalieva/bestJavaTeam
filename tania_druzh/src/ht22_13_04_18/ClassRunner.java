package ht22_13_04_18;

import java.lang.reflect.Field;

/**
 * Created by java on 13.04.2018.
 */
public class ClassRunner {
    public static void main(String[] args) throws IllegalAccessException {
        TestClass testClass = new TestClass();
        showFields(testClass);
        toUpperCase(testClass);
        System.out.println("------------------------");
        showFields(testClass);
        toLowerCase(testClass);
        System.out.println("----------------------------");
        showFields(testClass);
    }

    public static void toUpperCase(Object ob) throws IllegalAccessException {
        Class c = ob.getClass();
        Field[] publicFields = c.getDeclaredFields();
        for (Field field : publicFields) {
            Class fieldType = field.getType();
            if (fieldType.getName() == "java.lang.String") {
                field.set(ob, (String) field.get(ob).toString().toUpperCase());
            }
        }
    }

    public static void toLowerCase(Object ob) throws IllegalAccessException {
        Class c = ob.getClass();
        Field[] publicFields = c.getDeclaredFields();
        for (Field field : publicFields) {
            Class fieldType = field.getType();
            if (fieldType.getName() == "java.lang.String") {
                field.set(ob, (String) field.get(ob).toString().toLowerCase());
            }
        }
    }

    public static void showFields(Object ob) throws IllegalAccessException {
        Class c = ob.getClass();
        Field[] publicFields = c.getDeclaredFields();
        for (Field field : publicFields) {
            Class fieldType = field.getType();
            System.out.println("Имя: " + field.getName());
            System.out.println("Тип: " + fieldType.getName());
            Object test = (Object) field.get(ob);
            System.out.println("Значение: " + test.toString());

        }
    }
}
