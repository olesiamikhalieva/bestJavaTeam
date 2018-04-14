package hw_13_04_18;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Runner {

    public static Class clss = Person.class;

    public static void main(String[] args) throws IllegalAccessException {

        Person person = new Person();
        printFields(person);
        System.out.println();
        toLowerCase(person);
        System.out.println();
        toUpperCase(person);

//        Class clss = Person.class;
//        Field[] fields = clss.getDeclaredFields();
//        for (Field field : fields) {
//            System.out.println(field.getName());
//            System.out.println(field.getType().getName());
//            //System.out.println(Modifier.toString(field.getModifiers()));
//            //System.out.println(field.get(person));
//            if (field.getType().getName() == "int") {
//                //field.setAccessible(true);
//                System.out.println(field.getInt(person));
//                field.setInt(person, 40);
//                System.out.println(field.getInt(person));
//                //System.out.println(Modifier.toString(field.getModifiers()));
    }


    public static void printFields(Person person) throws IllegalAccessException {

        System.out.println("Вывод всех полей класса Person:");
        Field[] fields = clss.getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            System.out.println(Modifier.toString(field.getModifiers()) + "-"
                    + field.getType().getName() + "-" + field.getName() + "=" + field.get(person));
        }
    }
    public static void toLowerCase(Person person) throws IllegalAccessException {
        System.out.println("Меняем все большие буквы на маленькие:");
        Field[]fields=clss.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().getName()=="java.lang.String"){
                field.setAccessible(true);
                field.set(person,(String) field.get(person).toString().toLowerCase());
                System.out.println(field.getName()+"="+field.get(person));
            }

        }
    }
    public static void toUpperCase(Person person) throws IllegalAccessException {
        System.out.println("Меняем все маленькие буквы на большие:");
        Field[]fields=clss.getDeclaredFields();
        for (Field field : fields) {
            if (field.getType().getName()=="java.lang.String"){
                field.setAccessible(true);
                field.set(person,(String) field.get(person).toString().toUpperCase());
                System.out.println(field.getName()+"="+field.get(person));
            }

        }
    }
}

