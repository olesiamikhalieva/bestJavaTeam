package hw_12_01_18;

//import jdk.management.resource.internal.inst.FileOutputStreamRMHooks;

import java.util.concurrent.ThreadLocalRandom;

public class Main {


    public static void main(String[] args) {
        ClassRoom mainClass = new ClassRoom("Main", 40);
        createRandomStudents(mainClass); // Класс студентов со случайным возрастом

        ClassRoom classA = new ClassRoom("A", 12); // Инициализация класса А
        ClassRoom classB = new ClassRoom("B", 15); // Инициализация класса А
        studFilter(mainClass, classA, classB); // Фильтруем из Main в класс А и В по возрасту

//        Вывод классов на экран
//        mainClass.printClass(); // Имя Возраст
//        classA.printClass(); // Имя Возраст
//        classB.printClass(); // Имя Возраст
//        printClassName(mainClass);  // Только имя
//        classA.findStudent("Student1"); // Ищем студента

    }

    // ***********************Вывод данных***********************
    /*public static void printClass(ClassRoom N) {
        System.out.println(N.getClassWord());
        Student[] nStud = N.getStudMass();
        for (int i = 0; i < N.getClassLimit(); ++i) {
            if (nStud[i] != null) {
                System.out.println(nStud[i].getName() + " " + nStud[i].getAge());
            }
        }
    }*/

    public static void printClassName(ClassRoom N) {
        System.out.println(N.getClassWord());
        Student[] nStud = N.getStudMass();
        for (int i = 0; i < N.getClassLimit(); ++i) {
            if (nStud[i] != null) {
                System.out.println(nStud[i].getName());
            }
        }
    }

    // ***********************Инициализация класса****************
    public static void createRandomStudents(ClassRoom nClass) {
        for (int i = nClass.getsCounter(); i < nClass.getClassLimit(); ++i) {
            Student newStud = new Student();
            newStud.setAge(ThreadLocalRandom.current().nextInt(7, 16 + 1));
            newStud.setName("Student" + ThreadLocalRandom.current().nextInt(0, 40 + 1));
            nClass.studToClass(newStud);
        }
    }


    public static void studFilter(ClassRoom mainClass, ClassRoom A, ClassRoom B) {
        Student[] stud = mainClass.getStudMass();
        for (int i = 0; i < stud.length; ++i) {
            if (stud[i].getAge() >= 7 && stud[i].getAge() <= 12) {
                A.studToClass(stud[i]);
            } else if (stud[i].getAge() <= 16) {
                B.studToClass(stud[i]);
            }
        }
    }
}