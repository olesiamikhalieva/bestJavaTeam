package hw_16_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class ClassRoom {
    private String classWord;
    private Student[] studMass;
    private Student[] studMassUkr = new Student[30];
    private Student[] studMassEng = new Student[30];
    private int studentLimitAtClass = 15;
    private String classRoomDirection;
    private Student student;


    public ClassRoom() {
    }

    public ClassRoom(String classWord, String classRoomDirection) {
        this.classWord = classWord;
        this.classRoomDirection = classRoomDirection;
    }

    public ClassRoom(String classWord, int studentLimitAtClass) {
        this.classWord = classWord;
        this.studentLimitAtClass = studentLimitAtClass;
    }

    public ClassRoom(String classWord, int classLimit, String classRoomDirection) {
        this.classWord = classWord;
        this.studentLimitAtClass = classLimit;
        this.classRoomDirection = classRoomDirection;
    }


    public void setClassRoomDirection(String classRoomDirection) {
        this.classRoomDirection = classRoomDirection;
    }

    public String getClassRoomDirection() {
        return classRoomDirection;
    }


    public String getClassWord() {
        return classWord;
    }

    public void setClassWord(String classWord) {
        this.classWord = classWord;
    }

    public int getClassRandomLimit() {
        return studentLimitAtClass;
    }

    public int getStudentLimitAtClass() {
        return studentLimitAtClass;
    }

    public void setClassLimit(int classLimit) {
        this.studentLimitAtClass = classLimit;
    }


    public void addStudentToClass(Student student, ClassRoom classRoom) {
            if (student.getSkills() == "eng") {
                addStudentToClassEng(student);
            }
            if (student.getSkills() == "ukr") {
                addStudentToClassUkr(student);
            }
        }


    public Student[] addStudentToClassUkr(Student student) {
        for (int i = 0; i < studentLimitAtClass * 2; i++) {
            if (this.studMassUkr[i] == null) {
                this.studMassUkr[i] = student;
                break;
            }
        }
        return studMassUkr;
    }

    public Student[] addStudentToClassEng(Student student) {
        for (int i = 0; i < studentLimitAtClass * 2; i++) {
            if (this.studMassEng[i] == null) {
                this.studMassEng[i] = student;
                break;
            }
        }
            return studMassEng;
    }

            public void printAllStudentAtClass() {
                for (Student stud : studMassEng) {
                    if (stud != null) {
                        System.out.println("English students:");
                        System.out.println(stud.getName() + " " + stud.getAge());
                    }
                }
                for (Student stud: studMassUkr){
                    if (stud!=null){
                        System.out.println("Ukr students:");
                        System.out.println(stud.getName()+" "+stud.getAge());
                    }
                }
            }

        }







