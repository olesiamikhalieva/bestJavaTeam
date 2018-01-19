package hw_12_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class ClassRoom
{
    private String classWord = "N";
    private int classLimit = 10;
    private Student[] studMass = new Student[40];
    private int sCounter = 0;

    public ClassRoom(int classLimit)
    {
        studMass = new Student[classLimit];
    }

    public ClassRoom(String classWord, int classLimit)
    {
        this.classLimit = classLimit;
        this.classWord = classWord;
        studMass = new Student[classLimit];
    }

    public /*Student[]*/void studToClass(Student studRand)
    {
        if (sCounter <= studMass.length )
        {
            for(int i = 0; i <= studMass.length; ++i)
            {
                if(studMass[i] == null)
                {
                    studMass[i] = studRand;
                    sCounter++;
                    break;
                }
            }
        }
//        return studMass;
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
