package hw_16_01_18;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    private static int limitStudents = 100;
    private static Student[] studMass;
    private static int countStudent = 0;
    private static Student student;
    private static ClassRoom[] classRoomMass;
    private static ClassRoom classRoom;


    public static void main(String[] args) {

        School school = new School();
        printClassSchoolDefault(school);

        School newSchool = new School(3);
        setClassWord(newSchool);




    }


    private static void printClassSchoolDefault(School school) {
        for (ClassRoom classRoom : school.getSchoolListOfClass()) {
            System.out.println(classRoom.getClassWord() + " " + classRoom.getClassRoomDirection());
        }
    }

    private static void setClassWord(School school) {
        int classCount = school.getClassCount();
        for (ClassRoom classRoom : school.getSchoolListOfClass()) {
            school.classWordClassCount(classCount,school.getSchoolListOfClass());
            System.out.println("Class is "+classRoom.getClassWord());
        }
    }


    public static Student[] initStudents() {
        studMass = new Student[limitStudents];
        //name
        for (int i = 0; i < limitStudents; i++) {
            int maxQuolityRandomNames = 100;
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


}









