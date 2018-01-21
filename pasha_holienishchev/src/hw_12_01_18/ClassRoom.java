package hw_12_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class ClassRoom {
    private String classWord = "N";
    private int classLimit = 40;
    private Student[] studMass = new Student[40];
    private int sCounter = 0;

    public ClassRoom(int nLimit) {
        this.studMass = new Student[nLimit];
    }

    public ClassRoom(String classWord, int classLimit) {
        this.classLimit = classLimit;
        this.classWord = classWord;
        studMass = new Student[classLimit];
    }

    public void studToClass(Student studRand) {
        if (sCounter < studMass.length) {
            for (int i = sCounter; i <= studMass.length; ++i) {
                if (studMass[i] == null) {
                    studMass[i] = studRand;
                    sCounter++;
                    break;
                }
                else {
                    break;
                }
            }
        } else {
            System.out.println("error");
        }
    }

    public static void printClass(ClassRoom N) {
        System.out.println(N.getClassWord());
        Student[] nStud = N.getStudMass();
        for (int i = 0; i < nStud.length; ++i) {
            System.out.println(nStud[i].getName() + " " + nStud[i].getAge());
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
