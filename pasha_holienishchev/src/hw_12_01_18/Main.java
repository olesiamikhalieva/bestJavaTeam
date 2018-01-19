package hw_12_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static int sCount = 40;
    private static int stud7To12N = 0;
    private static int studFrom12N = 0;

    public static void main(String[] args) {
        ClassRoom mainClass = new ClassRoom(sCount);
        mainClass.setStudMass(createRandomStudents(40));

        ClassRoom A = new ClassRoom("A", 12);
        ClassRoom B = new ClassRoom("B", 15);

        studFilter(mainClass, A, B);
        printClass(mainClass);
    }

    public static Student[] createRandomStudents(int sCount) {
        Student[] studMass = new Student[sCount];
        for (int i = 0; i <= studMass.length; ++i) {
            Student studRand = new Student();
            studRand.setAge(ThreadLocalRandom.current().nextInt(7, 16 + 1));
            studRand.setName("Student " + ThreadLocalRandom.current().nextInt(0, 40 + 1));

        }
        return studMass;
    }

    private static void studFilter(ClassRoom mainClass, ClassRoom A, ClassRoom B)
    {
        Student[] studMass = mainClass.getStudMass();
        for (int i = 0; i < studMass.length; ++i) {
            if(studMass[i].getAge() >= 7 && studMass[i].getAge() < 12)
            {
                A.studToClass(studMass[i]);
            } else if (studMass[i].getAge() >= 12)
            {
                B.studToClass(studMass[i]);
            }
        }
    }

    private static void printClass(ClassRoom N)
    {
        System.out.println(N.getClassWord());
        Student[] nStud = N.getStudMass();
        for (int i = 0; i < nStud.length; ++i)
        {
            System.out.println(nStud[i].getName() + " " +nStud[i].getAge());
        }
    }
}