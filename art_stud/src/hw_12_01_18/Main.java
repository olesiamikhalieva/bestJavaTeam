package hw_12_01_18;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by java on 16.01.2018.
 */
//Todo bad work
public class Main {

    private static int studentAgeFrom7To12Count = 0;
    private static int studentAgeMoreThen12Count = 0;
    private static int studentCount = 40;

   private static Student []  studMisingMass = new Student[50];



    private static ClassRoom[] classRoomMass;


    //Todo  it is a comment
    public static void main(String[] args) {


        ClassRoom classA = new ClassRoom("A", 12);
        ClassRoom classB = new ClassRoom("B", 15);

        System.out.println(classA.getStudMass().length + " class A");
        System.out.println(classB.getStudMass().length + " Class B");

        Student[] studentsMass = initStudentMass();

        for (Student stud : studentsMass) {
            if (stud.getAge() >= 7 && stud.getAge() < 12) {
                classA.addStudentToClass(stud);
            } else {
                classB.addStudentToClass(stud);
            }
        }

        Student st=new Student("Art",13);





    }


    public static Student[] initStudentMass() {

        Student[] students = new Student[40];
        int min = 7;
        int max = 16;
        int randomAge;


        for (int i = 0; i < students.length; i++) {
            randomAge = ThreadLocalRandom.current().nextInt(min, max + 1);
            String studName = "A" + randomAge + "cov";
            Student stud = new Student(studName, randomAge);
            students[i] = stud;
            studentCountByAgeInfo(randomAge);
            if ((randomAge >=7 && randomAge <12)){

                studMisingMass[i] = stud;

            }

        }
        System.out.println(students.length + " all student in school");

        return students;

    }

    private static void studentCountByAgeInfo(int randomAge) {
        if (randomAge >= 7 && randomAge < 12) {
            studentAgeFrom7To12Count++;
        } else {
            studentAgeMoreThen12Count++;
        }
    }

}
