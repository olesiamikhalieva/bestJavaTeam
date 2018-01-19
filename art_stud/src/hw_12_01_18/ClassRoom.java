package hw_12_01_18;

/**
 * Created by java on 16.01.2018.
 */
public class ClassRoom {
    private String classWord;
    private int classLimit;
    private Student[] studMass;


    public ClassRoom() {
    }

    public ClassRoom(String classWord,int classLimit) {
        this.classLimit = classLimit;
        this.classWord = classWord;
        this.studMass = new Student[classLimit];
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

    public  void addStudentToClass(Student student){

        for (int i=0 ; i< studMass.length; i++) {
            if (studMass[i]== null) {
                studMass[i] = student;
            }
        }
    }
}
