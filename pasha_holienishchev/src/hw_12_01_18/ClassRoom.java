package hw_12_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class ClassRoom {
    private String classWord;
    private int classLimit;
    private Student[] studMass;
    private int sCounter = 0;

    public ClassRoom(int nLimit) {
        this.studMass = new Student[nLimit];
    }

    public ClassRoom(String classWord, int classLimit) {
        this.classLimit = classLimit;
        this.classWord = classWord;
        studMass = new Student[classLimit];
    }
    // Вывод классов
    public void printClass() {
        System.out.println(this.classWord);
        Student[] nStud = this.studMass;
        for (int i = 0; i < this.classLimit; ++i) {
            if (nStud[i] != null) {
                System.out.println(nStud[i].getName() + " " + nStud[i].getAge());
            }
        }
    }

    // Поиск студента с одинаковым именем в массиве
    public void findStudent(String Name) {
        for (int i = 0; i < studMass.length; ++i) {
            if (Name.equals(studMass[i].getName())) {
                System.out.println(Name);
            }
        }
    }

    // Добавляем данного студента в массив студентов класса Classroom
    public void studToClass(Student studRand) {
        if (sCounter < studMass.length) {
            for (int i = sCounter; i <= studMass.length; ++i) {
                if (studMass[i] == null) {
                    studMass[i] = studRand;
                    sCounter++;
                    break;
                }
            }
        }
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

    public int getsCounter() {
        return sCounter;
    }

    public void setsCounter(int sCounter) {
        this.sCounter = sCounter;
    }

}
