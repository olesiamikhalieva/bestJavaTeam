package hw_16_01_18;

import java.util.Arrays;

public class School {
    private int numberSchool;
    private ClassRoom[] schoolListOfClass;
    private ClassRoom classRoom;
    private Adress adress;
    private Student[] studMass;
    private Student[] studClassA = new Student[15];
    private Student[] studClassB = new Student[15];
    private Student[] studClassC = new Student[15];
    private Student[] studClassD = new Student[15];


    public School() {
        ClassRoom classA = new ClassRoom("A", "ukr");
        ClassRoom classB = new ClassRoom("B", "ukr");
        ClassRoom classC = new ClassRoom("C", "eng");
        ClassRoom classD = new ClassRoom("D", "eng");
        schoolListOfClass = new ClassRoom[4];
        schoolListOfClass[0] = classA;
        schoolListOfClass[1] = classB;
        schoolListOfClass[2] = classC;
        schoolListOfClass[3] = classD;
    }


    public School(int classCount) {
        schoolListOfClass = new ClassRoom[classCount];
        for (int i = 0; i < schoolListOfClass.length; i++) {
            classRoom = new ClassRoom();
            schoolListOfClass[i] = classRoom;
        }
    }

    public void setClassWordClassDirectionAuto() {
        for (ClassRoom classRoom : schoolListOfClass) {
            classWordClassCount(schoolListOfClass);
            classDirectionClassCount(schoolListOfClass);
            System.out.println("Class is " + classRoom.getClassWord() + " " + classRoom.getClassRoomDirection());
        }

    }

    public School(int numberSchool, ClassRoom[] schoolListOfClass) {
        this.numberSchool = numberSchool;
        this.schoolListOfClass = schoolListOfClass;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public int getClassCount() {
        int classCount = this.schoolListOfClass.length;
        return classCount;
    }

    public void classWordClassCount(ClassRoom[] schoolListOfClass) {
        for (int i = 0; i < schoolListOfClass.length; i++) {
            switch (i) {
                case 0:
                    schoolListOfClass[0].setClassWord("A");
                    break;
                case 1:
                    schoolListOfClass[1].setClassWord("B");
                    break;
                case 2:
                    schoolListOfClass[2].setClassWord("C");
                    break;
                case 3:
                    schoolListOfClass[3].setClassWord("D");
                default:
                    System.out.println("There are no so many classes at school.");
            }
        }
    }

    public void classDirectionClassCount(ClassRoom[] schoolListOfClass) {
        for (int i = 0; i < schoolListOfClass.length; i++) {
            switch (i) {
                case 0:
                    schoolListOfClass[0].setClassRoomDirection("ukr");
                    break;
                case 1:
                    schoolListOfClass[1].setClassRoomDirection("ukr");
                    break;
                case 2:
                    schoolListOfClass[2].setClassRoomDirection("eng");
                    break;
                case 3:
                    schoolListOfClass[3].setClassRoomDirection("eng");
                default:
                    System.out.println("There are no so many classes at school.");
            }
        }
    }


    public int getNumberSchool() {
        return numberSchool;
    }

    public void setNumberSchool(int numberSchool) {
        this.numberSchool = numberSchool;
    }

    public ClassRoom[] getSchoolListOfClass() {
        return schoolListOfClass;
    }

    public void setSchoolListOfClass(ClassRoom[] schoolListOfClass) {
        this.schoolListOfClass = schoolListOfClass;
    }

    public ClassRoom getClassRoom(ClassRoom classRoom) {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }


    public void addClassToSchool(ClassRoom classRoom) {
        this.schoolListOfClass = Arrays.copyOf(schoolListOfClass, schoolListOfClass.length + 1);
        for (int i = 0; i < this.schoolListOfClass.length; i++) {
            if (schoolListOfClass[i] == null) {
                schoolListOfClass[i] = classRoom;
            }
        }
        classDirectionClassCount(schoolListOfClass);
        classWordClassCount(schoolListOfClass);
    }

    public void printClassesAtSchool() {
        int countEngClass = 0;
        int countUkrClass = 0;

        for (ClassRoom classRoom : this.schoolListOfClass) {
            if (classRoom != null) {
                System.out.print("ClassWord of class: " + classRoom.getClassWord() + ";   ");
                System.out.println("Direction of class: " + classRoom.getClassRoomDirection());
            }

            if (classRoom.getClassRoomDirection() == "eng") {
                countEngClass++;
            }
            if (classRoom.getClassRoomDirection() == "ukr") {
                countUkrClass++;
            }

        }
        System.out.println("Count of Ukr Classes: " + countUkrClass);
        System.out.println("Count of Eng Classes: " + countEngClass);

    }

    public Student[] add30Students() {
        Student[] studMass = new Student[30];
        for (int i = 0; i < 30; i++) {
            Student student = new Student();
            studMass[i] = student;
            student.setRandomAge();
            student.setRandomSkills();
            student.setRandomName();
        }
        return studMass;

    }

    public void distrStudents() {
        int k = 0, n = 0, m = 0, s = 0;

        for (Student stud : add30Students()) {
            if ((stud.getSkills() == "ukr") && (stud.getAge() > 7 && stud.getAge() < 13)) {
                for (int i = 0; i < studClassA.length; i++) {
                    studClassA[k] = stud;
                    k++;
                    break;
                }
            }
            if ((stud.getSkills() == "ukr") && (stud.getAge() > 13 && stud.getAge() < 17)) {
                for (int i = 0; i < studClassB.length; i++) {
                    studClassB[n] = stud;
                    n++;
                    break;
                }
            }
            if ((stud.getSkills() == "eng") && (stud.getAge() > 7 && stud.getAge() < 13)) {
                for (int i = 0; i < studClassC.length; i++) {
                    studClassC[m] = stud;
                    m++;
                    break;
                }
            }
            if ((stud.getSkills() == "eng") && (stud.getAge() > 13 && stud.getAge() < 17)) {
                for (int i = 0; i < studClassD.length; i++) {
                    studClassD[s] = stud;
                    s++;
                    break;
                }
            }

        }

    }

    public void printClasses() {
        int countStudent = 0;
        System.out.println("Class A:");
        for (Student stud : studClassA) {
            if (stud != null) {
                System.out.println(stud.getName() + " " + stud.getAge() + " " + stud.getSkills());
                countStudent++;
            }
        }
        System.out.println("There are " + countStudent + " students at class A.");
        System.out.println();
        countStudent = 0;
        System.out.println("Class B:");
        for (Student stud : studClassB) {
            if (stud != null) {
                System.out.println(stud.getName() + " " + stud.getAge() + " " + stud.getSkills());
                countStudent++;
            }
        }
        System.out.println("There are " + countStudent + " students at class B.");
        System.out.println();
        countStudent = 0;
        System.out.println("Class C:");
        for (Student stud : studClassC) {
            if (stud != null) {
                System.out.println(stud.getName() + " " + stud.getAge() + " " + stud.getSkills());
                countStudent++;
            }
        }
        System.out.println("There are " + countStudent + " students at class C.");
        System.out.println();
        countStudent = 0;
        System.out.println("Class D:");
        for (Student stud : studClassD) {
            if (stud != null) {
                System.out.println(stud.getName() + " " + stud.getAge() + " " + stud.getSkills());
                countStudent++;
            }
        }
        System.out.println("There are " + countStudent + " students at class D.");
    }

}




