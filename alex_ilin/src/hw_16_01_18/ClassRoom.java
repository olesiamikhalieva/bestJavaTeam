package hw_16_01_18;

public class ClassRoom {

    private String classWord;
    private int classLimit;
    Student[] studMass;


    public ClassRoom(int classLimit) {//конструктор, к-й задает длину массива
        studMass = new Student[classLimit];
    }

    public ClassRoom(String classWord, int classLimit) {//конструктор, принимающий букву класса и его размер
        this.classWord = classWord;
        this.classLimit = classLimit;
        studMass = new Student[classLimit];
    }

    public String getClassWord() {
        return classWord;
    }

    public void setClassWord(String classWord) {
        this.classWord = classWord;
    }

    public int getClassLimit() {
        return classLimit;
    }

    public void setClassLimit(int classLimit) {
        this.classLimit = classLimit;
    }

    public Student[] getStudMass() {
        return studMass;
    }

    public void setStudMass(Student[] studMass) {
        this.studMass = studMass;
    }

    private int studCount = 0;

    public int getStudCount() {
        return studCount;
    }

    public void setStudCount(int studCount) {
        this.studCount = studCount;
    }

    public void addStudentToClass(Student s) {//добавить студентов в класс
        if (studCount < studMass.length) {
            for (int i = 0; i < studMass.length; i++) {
                if (studMass[i] == null) {
                    studMass[i] = s;
                    studCount++;
                    break;
                }
            }
        } else {
            System.out.println("net mest");
        }

    }

    public void printStudentNameAndAgeInClass() {//вывести имена и возраст студентов в классе
        for (Student student : studMass) {
            if (student != null) {
                System.out.println(student.getName() + " , " + student.getAge());
            }
        }
    }

    public void printStudentNameInClass() {//вывести имена в классе
        for (Student student : studMass) {
            if (student != null) {
                System.out.println(student.getName());
            }
        }
    }

    public Student getStudentByName(String name) {//получить студента по имени
        for (Student stud : studMass) {
            if (stud.getName().equals(name)) {
                return stud;
            }
        }
        return null;
    }


}