package hw_16_01_18;

import java.util.Scanner;

public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        //создание 40 студентов с именем, возрастом и адресом
        Student[] allMassStud = new Student[40];
        int inA = 0;
        int inB = 0;
        int n = 0, a = 0, k = 0, b = 0;
        for (int i = 0; i < allMassStud.length; i++) {
            Student stud = new Student();
            stud.setName("name" + (i + 1));
            stud.setRandomCity();
            stud.setRandomOblast();
            stud.setRandomAdress();
            stud.setRandomTelefon();
            allMassStud[i] = stud;
            if (stud.getAge() <= 12) {
                inA++;
            } else {
                inB++;
            }
        }
        //запись студентов меньше 12 лет в класс А
        if (inA < 12) {
            n = inA;
        } else {
            n = 12;
        }
        Student[] studA = new Student[n];
        for (int i = 0; i < n; i++) {
            for (int j = a; j < allMassStud.length; j++) {
                if (allMassStud[j].getAge() <= 12) {
                    studA[i] = allMassStud[j];
                    a = j + 1;
                    break;
                }
            }
        }
        ClassRoom classA = new ClassRoom("A", 12, studA);
        //запись студентов больше 12 лет в класс Б
        if (inB < 15) {
            k = inB;
        } else {
            k = 15;
        }
        Student[] studB = new Student[k];
        for (int i = 0; i < k; i++) {
            for (int j = b; j < allMassStud.length; j++) {
                if (allMassStud[j].getAge() > 12) {
                    studB[i] = allMassStud[j];
                    b = j + 1;
                    break;
                }
            }
        }
        ClassRoom classB = new ClassRoom("B", 15, studB);

        System.out.println("---Все 40 студентов---");
        for (Student student : allMassStud) {
            System.out.println(student.getName() + "  " + student.getAge() + " " + student.getCity() + "-" + student.getOblast() +
                    "-" + student.getAdress() + "-" + student.getTelefon());
        }
        System.out.println("---Класс А---");
        for (Student student : studA) {
            System.out.println(student.getName() + "  " + student.getAge());
        }
        //Сколько студетнов не вошли в клаас А
        System.out.println("---Не вошли в класс А---");
        int ostA = 0;
        for (int i = a; i < allMassStud.length; i++) {
            if (allMassStud[i].getAge() <= 12) {
                System.out.println(allMassStud[i].getName() + "  " + allMassStud[i].getAge());
                ostA++;
            }
        }
        System.out.println("Всего не вошло в класс А:  " + ostA + " студентов");

        System.out.println("---Класс Б-----");
        for (Student student : studB) {
            System.out.println(student.getName() + "  " + student.getAge());
        }
        //Сколько студетнов не вошли в клаас Б
        System.out.println("---Не вошли в класс Б---");
        int ostB = 0;
        for (int i = b; i < allMassStud.length; i++) {
            if (allMassStud[i].getAge() > 12) {
                System.out.println(allMassStud[i].getName() + "  " + allMassStud[i].getAge());
                ostB++;
            }
        }
        System.out.println("Всего не вошло в класс Б:  " + ostB + " студентов\n");
        // Количество студентов к каждом классе
        System.out.println("Количество студентов в классе А: " + classA.countStudent());
        System.out.println("Количество студентов в классе Б: " + classB.countStudent());
        //Имена астудентов каждого класса
        System.out.println("Список студентов класса А: ");
        classA.listStudent();
        System.out.println("Список студентов класса Б: ");
        classB.listStudent();
        //Список студентов по количеству лет_по возрастанию
        System.out.println("Список студентов классе А по возрасту(по возрастанию): ");
        classA.sortAge();
        classA.listStudent();
        System.out.println("Список студентов классе Б по возрасту(по возрастанию): ");
        classB.sortAge();
        classB.listStudent();
        //Список студентов по количеству лет_по убыванию
        System.out.println("Список студентов классе А по возрасту(по убыванию): ");
        classA.sortAgeRevers();
        classA.listStudent();
        System.out.println("Список студентов классе Б по возрасту(по убыванию): ");
        classB.sortAgeRevers();
        classB.listStudent();
        //Поиск студента по имени в конкретном классе
        System.out.println("Введите имя студента для класса A:");
        Scanner scan1 = new Scanner(System.in);
        String name1 = scan1.nextLine();
        System.out.println("Студент " + name1 + " в классе А: " + classA.findName(name1));
        System.out.println("Введите имя студента для класса Б:");
        Scanner scan2 = new Scanner(System.in);
        String name2 = scan2.nextLine();
        System.out.println("Студент " + name2 + " в классе Б: " + classB.findName(name2));
        //Поиск студента по артрибуту(имя,город,область,телефон,адрес
        int count = 0;
        System.out.println("Введите атрибут студента для поиска");
        Scanner scan4 = new Scanner(System.in);
        String name4 = scan4.nextLine();
        for (Student student : allMassStud) {
            if (student.getName().equals(name4) || student.getCity().equals(name4) || student.getOblast().equals(name4) || student.getTelefon().equals(name4) || student.getAdress().equals(name4)) {
                System.out.println("Найден студент с данным атрибутом: " + student.getName() + "-" + student.getAge() + "-" + student.getCity() + "-" + student.getOblast() + "-" + student.getAdress() + "-" + student.getTelefon());
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Студент с заданным атрибутом не найден!");
        }
    }
}