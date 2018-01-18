package hw_12_01_18;

import java.util.Scanner;


// Todo  вынести логику в методы, конструкцию свитч убрать, сканер также выпилить из проекта
public class Main {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        Student[] allMassStud = new Student[40];

        int inA = 0;
        int inB = 0;
        int n = 0, a = 0, k = 0, b = 0;
        for (int i = 0; i < allMassStud.length; i++) {
            Student stud = new Student();
            stud.setName("name" + (i + 1));
            allMassStud[i] = stud;
            if (stud.getAge() <= 12) {
                //System.out.println(stud.getAge());
                inA++;
            } else {
                inB++;
            }
        }
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
                    //System.out.println(studA[i].getAge());
                    a = j + 1;
                    break;
                }
            }
        }
        ClassRoom classA = new ClassRoom("A", 12, studA);

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
            System.out.println(student.getName() + "  " + student.getAge());
        }
        System.out.println("---Класс А---");
        for (Student student : studA) {
            System.out.println(student.getName() + "  " + student.getAge());
        }
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
        System.out.println("---Не вошли в класс Б---");
        int ostB = 0;
        for (int i = b; i < allMassStud.length; i++) {
            if (allMassStud[i].getAge() > 12) {
                System.out.println(allMassStud[i].getName() + "  " + allMassStud[i].getAge());
                ostB++;
            }
        }
        System.out.println("Всего не вошло в класс Б:  " + ostB + " студентов\n");

        int num;
        do {
            System.out.println("Введите цифру для выбора метода (для выхода нажмите 111) :  \n" +
                    " 1-Количество студентов в каждом классе;\n" +
                    " 2-Список студетов каждого класса(имена и возраст\n" +
                    " 3-Список только имен студентов каждого класса\n"+
                    " 4-Сортировка каждого класса по возрасту(по возрастанию)\n"+
                    " 5-Сортировка каждого класса по возрасту(по убыванию)\n"+
                    " 6-Поиск студента по имени в конкретном классе\n"+
                    " 7-Поиск студента по имени во всех классах\n");
            num = in.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Количество студентов в классе А; " + classA.countStudent());
                    System.out.println("Количество студентов в классе Б; " + classB.countStudent());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Список студентов класса А: ");
                    classA.listStudent();
                    System.out.println("Список студентов класса Б: ");
                    classB.listStudent();
                    break;
                case 3:
                    System.out.println("Список имен студентов классе А: ");
                    classA.listNamesOfStudents();
                    System.out.println("Список имен студентов классе Б: ");
                    classB.listNamesOfStudents();
                    break;
                case 4:
                    System.out.println("Список студентов классе А по возрасту(по возрастанию): ");
                    classA.sortAge();
                    classA.listStudent();
                    System.out.println("Список студентов классе Б по возрасту(по возрастанию): ");
                    classB.sortAge();
                    classB.listStudent();
                    break;
                case 5:
                    System.out.println("Список студентов классе А по возрасту(по убыванию): ");
                    classA.sortAgeRevers();
                    classA.listStudent();
                    System.out.println("Список студентов классе Б по возрасту(по убыванию): ");
                    classB.sortAgeRevers();
                    classB.listStudent();
                    break;
                case 6:
                    System.out.println("Введите имя студента для класса A:");
                    Scanner scan1=new Scanner(System.in);
                    String name1=scan1.nextLine();
                    System.out.println("Студент " + name1+" в классе А: "+classA.findName(name1));
                    System.out.println("Введите имя студента для класса Б:");
                    Scanner scan2=new Scanner(System.in);
                    String name2=scan2.nextLine();
                    System.out.println("Студент " + name2+" в классе Б: "+classB.findName(name2));
                    break;
                case 7:
                    System.out.println("Введите имя студента для поиска");
                    Scanner scan3=new Scanner(System.in);
                    String name3=scan3.nextLine();
                    System.out.println("Студент "+name3+" в классе A: "+classA.findNameInClass(name3));
                    System.out.println("Студент "+name3+" в классе Б: "+classB.findNameInClass(name3));
//                    //classA.findName(Name1);
//                    System.out.println("Введите имя студента для класса Б:");
//                    Scanner scan2=new Scanner(System.in);
//                    String Name2=scan2.nextLine();
//                    System.out.println("Студент " + Name2+" в классе Б: "+classB.findName(Name2));
//                    //classB.findName(Name2);
                    break;
                default:

                    if (num == 111) {
                        System.out.println("Программа окончена");
                        System.exit(0);
                    }
                    System.out.println("Неверно ввели номер метода,повторите ввод!");
                    break;

            }
        } while (num != 111);
    }
}

