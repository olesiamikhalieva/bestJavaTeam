package hw_12_01_18;

import java.util.Scanner;

//Todo  разбить код на методы, вынести логику из мейна, убрать свитчи.

public class Main {
    public static void main(String[] args) {
        Student [] studMass= new Student[40];
        int countClass_A = 0;
        int countClass_B = 0;
        for (int i = 0; i < 40; i++) {
            Student stud = new Student();
            studMass[i] = stud;
            if (stud.getAge() <12 ) {
                countClass_A ++;
            }
            else {
                countClass_B ++;
            }
        }
        int n = 0;
        if (countClass_A < 12) {
            n = countClass_A;
        }
        else {
            n = 12;
        }
        int m = 0;
        Student [] students_A = new Student[n];
        for (int i = 0; i < n; i++){
            for (int j = m; j < studMass.length; j++){
                if (studMass[j].getAge() < 12) {
                    students_A[i] = studMass[j];
                    m = j + 1;
                    break;
                }
            }
        }
        ClassRoom class_A = new ClassRoom("A",12,students_A);

        int k = 0;
        if (countClass_B < 15) {
            k = countClass_B;
        }
        else {
            k = 15;
        }
        Student [] students_B = new Student[k];
        int k1 = 0;
        for (int i = 0; i < k; i++){
            for (int j = k1; j < studMass.length; j++){
                if (studMass[j].getAge() >= 12) {
                    students_B[i] = studMass[j];
                    k1 = j + 1;
                    break;
                }
            }
        }
        ClassRoom class_B = new ClassRoom("B",15,students_B);

        System.out.println("Все ученики");
        for (Student student : studMass) {
            System.out.println(student.getName() +" в возрасте: "+ student.getAge()+" лет");
        }

        System.out.println("В класс А попали:");
        for (Student student : students_A) {
            System.out.println(student.getName() +" в возрасте: "+ student.getAge()+" лет");
        }

        System.out.println("В класс В попали: ");
        for (Student student : students_B) {
            System.out.println(student.getName() +" в возрасте: "+ student.getAge()+" лет");
        }

        int countMissed_A = 0;
        System.out.println("В класс А не хватило места:");
        for (int j = m; j < studMass.length; j++){
            if (studMass[j].getAge() < 12) {
                System.out.println(studMass[j].getName() +" "+ studMass[j].getAge());
                countMissed_A ++;
            }
        }
        System.out.println("В целом не попали в А:" + countMissed_A+" учеников");

        int countMissed_B = 0;
        System.out.println("В класс В не хватило места");
        for (int j = k1; j < studMass.length; j++){
            if (studMass[j].getAge() >= 12) {
                System.out.println(studMass[j].getName() +" "+ studMass[j].getAge());
                countMissed_B ++;
            }
        }
        System.out.println("В целом не попали в B:" + countMissed_B+" учеников");

        boolean menu = true;
        while (menu) {
            System.out.println("Операции:");
            System.out.println("1. Количество учеников в классах");
            System.out.println("2. Список учеников в классах");
            System.out.println("3. Имена студентов в каждом классе");
            System.out.println("4. Сортировка учеников по возрасту по возрастанию");
            System.out.println("5. Сортировка учеников по возрасту в порядке убывания");
            System.out.println("6. Сортировка учеников по имени по возрастанию");
            System.out.println("7. Сортировка учеников по имени в порядке убывания");
            System.out.println("8. Поиск студента по имени");
            System.out.println("9. Поиск класса по имени студента");

            Scanner in = new Scanner(System.in);
            int answer = in.nextInt();

            switch (answer) {
                case 1: {
                    System.out.println("______________________");
                    System.out.println("________Класс А_______");
                    System.out.println("Кол-во студентов в классе А: " + class_A.getClassCount());
                    System.out.println("________Класс В_______");
                    System.out.println("Кол-во студентов в классе В: " + class_B.getClassCount());
                    break;
                }
                case 2: {
                    System.out.println("______________________");
                    System.out.println("________Класс А_______");
                    System.out.println("Список студентов в классе А: ");
                    class_A.getClassList();
                    System.out.println("________Класс В_______");
                    System.out.println("Список студентов в классе В: ");
                    class_B.getClassList();
                    break;
                }
                case 3: {
                    System.out.println("______________________");
                    System.out.println("________Класс А_______");
                    System.out.println("Список студентов в классе А: ");
                    class_A.getShortClassList();
                    System.out.println("________Класс В_______");
                    System.out.println("Список студентов в классе В: ");
                    class_B.getShortClassList();
                    break;
                }
                case 4: {
                    System.out.println("______________________");
                    System.out.println("________Класс А_______");
                    System.out.println("Сортированный список класса А: ");
                    class_A.ageSort();
                    class_A.getClassList();
                    System.out.println("________Класс В_______");
                    System.out.println("Сортированный список класса В: ");
                    class_B.ageSort();
                    class_B.getClassList();
                    break;
                }
                case 5: {
                    System.out.println("______________________");
                    System.out.println("________Класс А_______");
                    System.out.println("Сортированный перевернутый список класса А: ");
                    class_A.ageReverseSort();
                    class_A.getClassList();
                    System.out.println("________Класс В_______");
                    System.out.println("Сортированный перевернутый список класса В: ");
                    class_B.ageReverseSort();
                    class_B.getClassList();
                    break;
                }

                case 6: {
                    System.out.println("______________________");
                    System.out.println("________Класс А_______");
                    System.out.println("Сортированный список имен учеников класса А: ");
                    class_A.nameSort();
                    class_A.getClassList();
                    System.out.println("________Класс В_______");
                    System.out.println("Сортированный список имен учеников класса В: ");
                    class_B.nameSort();
                    class_B.getClassList();
                    break;
                }

                case 7: {
                    System.out.println("______________________");
                    System.out.println("________Класс А_______");
                    System.out.println("Сортированный перевернутый список имен учеников класса А: ");
                    class_A.nameRevSort();
                    class_A.getClassList();
                    System.out.println("________Класс В_______");
                    System.out.println("Сортированный перевернутый список имен учеников класса А: ");
                    class_B.nameRevSort();
                    class_B.getClassList();
                    break;
                }
                case 8:{
                    System.out.println("Введите имя ученика:");
                    Scanner inName = new Scanner(System.in);
                    String findName = inName.nextLine();
                    System.out.println("________Класс А_______");
                    System.out.println("Учеников в Классе А по имени " + findName + ":");
                    class_A.findStudent(findName);
                    System.out.println("________Класс В_______");
                    System.out.println("Учеников в Классе В по имени  " + findName + ":");
                    class_B.findStudent(findName);
                    break;
                }

                case 9:{
                    System.out.println("Введите имя ученика:");
                    Scanner inName = new Scanner(System.in);
                    String findName = inName.nextLine();
                    System.out.println("________Класс А_______");
                    System.out.println("Ученики по имени " + findName +" в классе " +  class_A.findClass(findName));
                    System.out.println("________Класс В_______");
                    System.out.println("Ученики по имени " + findName + " в классе  " +  class_B.findClass(findName));
                    break;
                }

                default:{
                    menu = false;
                    System.out.println("Конец программы");
                    break;
                }
            }
        }

    }
}