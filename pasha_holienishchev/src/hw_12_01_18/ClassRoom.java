package hw_12_01_18;

public class ClassRoom
{
    String classWord = "classWord";
    int classLimit = 10;
    Student[] studMass = new Student[40];

    public Student[] getStudMass() {
        return studMass;
    }

    public void setStudMass(Student[] studMass) {
        this.studMass = studMass;
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
}
