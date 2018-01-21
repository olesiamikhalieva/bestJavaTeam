package hw_12_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    private static int sCount = 40;
    private static int stud7To12N = 0;
    private static int studFrom12N = 0;

    public static void main(String[] args) {
        ClassRoom mainClass = new ClassRoom("Main", sCount);
        createRandomStudents(mainClass);

        //ClassRoom A = new ClassRoom("A", 12);
        //ClassRoom B = new ClassRoom("B", 15);

        mainClass.printClass(mainClass);
        //studFilter(mainClass, A, B);
    }

    public static void createRandomStudents(ClassRoom nClass) {
        for (int i = 0; i <= sCount; ++i) {
            Student newStud = new Student();
            newStud.setAge(ThreadLocalRandom.current().nextInt(7, 16 + 1));
            newStud.setName("Student№" + ThreadLocalRandom.current().nextInt(0, 40 + 1));
            nClass.studToClass(newStud);
        }
    }



}