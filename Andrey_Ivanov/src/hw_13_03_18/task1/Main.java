package hw_13_03_18.task1;

import java.util.*;

public class Main {
    /*Создать структуру данных которая содержит в себе имена : Аня. Виктор, Игнат, Валентин,Игорь, Оля, Света, Таня.
   Создать еще одну структуру данных, но которая будет содержать только уникальные значения, заполнить ее полями предыдущей структуры.
   -Добавить в обе структуры данных имена:  Виктор, Игнат, Иннакентий, Тит, Ждери, Освальд, Фернандо, после вывести их содержание.*/

    public static void main(String[] args) {

        List<String>names=new ArrayList<>();

        names.add("Аня");
        names.add("Виктор");
        names.add("Игнат");
        names.add("Валентин");
        names.add("Игорь");
        names.add("Оля");
        names.add("Света");
        names.add("Таня");
        System.out.println("Вывод коллекции ArrayList:\n"+" "+names+"\n");

        Set<String>namesSet=new HashSet<>(names);

        System.out.println("Вывод коллекции Set:\n"+" "+namesSet+"\n");

        names.add("Виктор");
        names.add("Игнат");
        names.add("Иннакентий");
        names.add("Тит");
        names.add("Ждери");
        names.add("Освальд");
        names.add("Фернандо");

        System.out.println("Добавил имена в коллекцию ArrayList:\n"+names+"\n");

        namesSet=new HashSet<>(names);

        System.out.println("Добавил имена в коллекцию Set:\n"+" "+namesSet+"\n");


    }
}
