package hw_12_01_18;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    private static int limitStudents = 40;
    private static Student[] studMass;
    private static int countStudent = 0;
    private static Student student;

    public static void main(String[] args) {
        ClassRoom classA = new ClassRoom("A", 12);
        ClassRoom classB = new ClassRoom("B", 16);
        initStudents();
        addStudentToClass(classA, classB);

        System.out.println("All students:");
        printAllStudents();

        System.out.println("There are " + classA.printCountClass() + " students at class A.");
        System.out.println("Students at class A (name):");
        classA.printClassName();

        System.out.println("There are " + classB.printCountClass() + " students at class B.");
        System.out.println("Students at class B (name+age):");
        classB.printClassNameAndAge();

        System.out.println("All students are sorted by alphabet:");
        printAllStudentsbySortName();

        System.out.println("All students are sorted by age:");
        printAllStudentsSortAge();

        System.out.println("All students' names are sorted by alphabet:");
        printAllStudentsSortAlphabet();

        System.out.println("All students are sorted by age reverse:");
        printAllStudentsSortAgeReverse();

        System.out.println("All students are sorted by alphabet reverse:");
        printAllStudentsSortAgeReverse();

        System.out.println("Find student by name in classes:");
        findStudentName(classA, classB, "Ivan");

    }

    public static void addStudentToClass(ClassRoom classA, ClassRoom classB) {
        for (Student stud : studMass) {
            if (stud.getAge() >= 7 && stud.getAge() <= 12) {
                classA.addStudent(stud, classA);
            } else if (stud.getAge() > 12 && stud.getAge() < 16) {
                classB.addStudent(stud, classB);
            }
        }
    }

    public static int coutStudents(ClassRoom classRoom) {
        for (Student stud : studMass) {
            if (stud.getAge() >= 7 && stud.getAge() <= 12) {
                countStudent++;
            } else if (stud.getAge() > 12 && stud.getAge() < 16) {
                countStudent++;
            }
        }
        return countStudent;
    }


    public static Student[] initStudents() {
        studMass = new Student[limitStudents];
        //name
        for (int i = 0; i < limitStudents; i++) {
            int maxQuolityRandomNames = 40;
            Random random = new Random();
            String[] names = new String[15];
            String[] randomNames = new String[maxQuolityRandomNames];
            names[0] = "Ivan";
            names[1] = "Irina";
            names[2] = "Artem";
            names[3] = "Elena";
            names[4] = "Katia";
            names[5] = "Serger";
            names[6] = "Vasia";
            names[7] = "Denis";
            names[8] = "Pasha";
            names[9] = "Sasha";
            names[10] = "Petia";
            names[11] = "Vova";
            names[12] = "Yulia";
            names[13] = "Macksim";
            names[14] = "Alex";
            for (int j = 0; j < maxQuolityRandomNames; j++) {
                randomNames[j] = names[random.nextInt(names.length)];
                String name = randomNames[i];
                int age = ThreadLocalRandom.current().nextInt(7, 16 + 1);
                Student student = new Student(name, age);
                studMass[i] = student;
            }
        }
        return studMass;
    }

    public static void printAllStudents() {
        for (Student student : studMass) {
            System.out.println(student.getName() + " " + student.getAge());
        }
    }

    public static void printAllStudentsbySortName() {
        String[] massNameStudent = new String[limitStudents];
        for (int i = 0; i < massNameStudent.length; i++) {
            massNameStudent[i] = studMass[i].getName();
        }
        Arrays.sort(massNameStudent, String.CASE_INSENSITIVE_ORDER);
        System.out.println(Arrays.toString(massNameStudent));
    }

    public static void printAllStudentsSortAge() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j].getAge() > studMass[j + 1].getAge()) {
                    Student student = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = student;
                }
            }
        }
        for (Student stud : studMass) {
            System.out.println(stud.getName() + " " + stud.getAge());
        }
    }

    public static void printAllStudentsSortAlphabet() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) > 0) {

                    Student student = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = student;
                }
            }
        }
        for (Student stud : studMass) {
            System.out.println(stud.getName() + " " + stud.getAge());
        }
    }

    public static void printAllStudentsSortAgeReverse() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j].getAge() < studMass[j + 1].getAge()) {
                    Student student = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = student;
                }
            }
        }
        for (Student stud : studMass) {
            System.out.println(stud.getName() + " " + stud.getAge());
        }
    }

    public static void printAllStudentsSortAlphabetReverse() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) < 0) {

                    Student student = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = student;
                }
            }
        }
        for (Student stud : studMass) {
            System.out.println(stud.getName() + " " + stud.getAge());
        }
    }

    public static void findStudentName(ClassRoom classA, ClassRoom classB, String name) {
        int n = 0;
        int k = 0;{
            System.out.println("Students at class A:");

            for (Student stud : classA.getStudMass()) {
                if (stud!=null){
                    if (stud.getName().compareTo(name)==0) {
                        System.out.println(name);
                        n++;
                    }
                }}
            if (n == 0) {
                System.out.println("There are no students that name at class A.");
            }

            System.out.println("Students at class B:");

            for (Student stud : classB.getStudMass()) {
                if (stud!=null){
                    if (stud.getName().compareTo(name)==0) {
                        System.out.println(name);
                        k++;
                    }
                }
            }
            if (k == 0) {
                System.out.println("There are no students that name at class B.");
            }
        }
    }


}









