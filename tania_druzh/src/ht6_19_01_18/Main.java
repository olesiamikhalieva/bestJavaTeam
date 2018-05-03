package ht6_19_01_18;

import ht6_19_01_18.ClassRoom;
import ht6_19_01_18.Student;

import java.util.Scanner;
// Todo  проанализировать и продумать - где в коде выполняются аналогичные действия -шаги.
// Todo  Возможно стоит вынести в методы?
// Todo  Задача метода-  неоднократное использование и переиспользование.

public class Main {
    private static int colStudents = 40;
    private static Student [] studArr= new Student[colStudents];
    public static void main(String[] args) {
        createStudents();
    }

    /*Необходимо создать 40 студентов, у каждого из которых должен быть указан возраст(произвольный в диапазоне от 7 до 16 лет)*/
    private static void createStudents() {
        int countA = 0;
        int countB = 0;
        for (int i = 0; i < studArr.length; i++) {
            Student stud = new Student();
            studArr[i] = stud;
            if (stud.getAge() <12 ) {
                countA ++;
            }
            else {
                countB ++;
            }
        }

        /*В класс А записать(добавить студентов) возрастом от 7 до 12 лет, остальных в класс Б.
        * При чем, каждый класс имеет макс кол-во студентов. Для А -12, для Б -15.*/
        int n = 0;
        if (countA < 12) {
           n = countA;
        }
        else {
           n = 12;
        }
        int n1 = 0;
        Student [] stA = new Student[n];
        for (int i = 0; i < n; i++){
            for (int j = n1; j < studArr.length; j++){
                if (studArr[j].getAge() < 12) {
                    stA[i] = studArr[j];
                    n1 = j + 1;
                    break;
                }
            }
        }
        ClassRoom clA = new ClassRoom("A",12,stA);

        int k = 0;
        if (countB < 15) {
            k = countB;
        }
        else {
            k = 15;
        }
        Student [] stB = new Student[k];
        int k1 = 0;
        for (int i = 0; i < k; i++){
            for (int j = k1; j < studArr.length; j++){
                if (studArr[j].getAge() >= 12) {
                    stB[i] = studArr[j];
                    k1 = j + 1;
                    break;
                }
            }
        }
        ClassRoom clB = new ClassRoom("B",15,stB);

        System.out.println("----------ALL----------");
        for (Student student : studArr) {
            System.out.println(student.getName() +" "+ student.getAge());
        }

        System.out.println("----------A----------");
        for (Student student : stA) {
            System.out.println(student.getName() +" "+ student.getAge());
        }

        System.out.println("----------B----------");
        for (Student student : stB) {
            System.out.println(student.getName() +" "+ student.getAge());
        }

        /*После добавления мы должны видеть сколько студентов не смогло записаться в класс и какие именно.*/
        int countNEnA = 0;
        System.out.println("-------Not enough A---------");
        for (int j = n1; j < studArr.length; j++){
            if (studArr[j].getAge() < 12) {
                System.out.println(studArr[j].getName() +" "+ studArr[j].getAge());
                countNEnA ++;
            }
        }
        System.out.println("Total not in A: " + countNEnA);

        int countNEnB = 0;
        System.out.println("-------Not enough B---------");
        for (int j = k1; j < studArr.length; j++){
            if (studArr[j].getAge() >= 12) {
                System.out.println(studArr[j].getName() +" "+ studArr[j].getAge());
                countNEnB ++;
            }
        }
        System.out.println("Total not in B: " + countNEnB);

        testClasses(clA, clB);
    }

    private static void testClasses(ClassRoom clA, ClassRoom clB) {
        /*показывающие сколько человек есть в в конкретном классе*/
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Count students in A class is " + clA.getClassCount());
        System.out.println("----------B----------");
        System.out.println("Count students in B class is " + clB.getClassCount());

        /*показывающей всех студентов класса(их имена и возраст)*/
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Students list in A class is: ");
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Students list in B class is: ");
        clB.getClassList();

        /*показывающей всех студентов класса(только имя)*/
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Students list in A class is: ");
        clA.getShortClassList();
        System.out.println("----------B----------");
        System.out.println("Students list in B class is: ");
        clB.getShortClassList();

        /*показывающий всех   в отсортированном порядке по возрасту*/
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Sorted students list in A class is: ");
        clA.ageSort();
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Sorted students list in B class is: ");
        clB.ageSort();
        clB.getClassList();

        /*показывающий всех   в отсортированном обратном порядке по возрасту*/
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Sorted rev students list in A class is: ");
        clA.ageRevSort();
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Sorted rev students list in B class is: ");
        clB.ageRevSort();
        clB.getClassList();

        /*показывающий всех   в отсортированном порядке по алфавиту*/
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Sorted name students list in A class is: ");
        clA.nameSort();
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Sorted name students list in B class is: ");
        clB.nameSort();
        clB.getClassList();

        /*показывающий всех   в отсортированном обратном порядке по алфавиту*/
        System.out.println("--------------------");
        System.out.println("----------A----------");
        System.out.println("Sorted rev name students list in A class is: ");
        clA.nameRevSort();
        clA.getClassList();
        System.out.println("----------B----------");
        System.out.println("Sorted rev name students list in B class is: ");
        clB.nameRevSort();
        clB.getClassList();

        /*метод который находит конкретного студента по имени в конкретном классе*/
        String fName = "Vasia";
        System.out.println("----------A----------");
        System.out.println("Students in A class with name  " + fName + ":");
        clA.findStudent(fName);
        System.out.println("----------B----------");
        System.out.println("Students in B class with name  " + fName + ":");
        clB.findStudent(fName);

        /*метод который ищет и показывает в каких классах есть студент с таким именем*/
        String sName = "Vasia";
        System.out.println("----------A----------");
        System.out.println("Students with name " + sName +" in class " +  clA.findClass(fName));
        System.out.println("----------B----------");
        System.out.println("Students with name " + sName + " in class  " +  clB.findClass(fName));

        clA.findClassByName("Vasia");
    }

}

