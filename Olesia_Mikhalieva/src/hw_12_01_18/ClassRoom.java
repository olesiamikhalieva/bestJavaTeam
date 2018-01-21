package hw_12_01_18;

public class ClassRoom {
    private  String classWord;
    private int classLimit;
    private  Student[] studMass;
    private  int limitStudent = 40;
    private int countClass = 0;

    public ClassRoom() {
    }

    public ClassRoom(String classWord, int classLimit) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        studMass = new Student[limitStudent];
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

    private int k = 0;
    public void addStudent(Student stud, ClassRoom classRoom) {
        if (k < classRoom.classLimit) {
            for (int i = 0; i < studMass.length; i++) {
                if (studMass[i] == null) {
                    studMass[i] = stud;
                    k++;
                    break;
                }
            }
        }
    }





    public void printClassName() {
        for (Student stud : studMass) {
            if (stud != null) {
                System.out.println(stud.getName());
            }
        }
    }

    public void printClassNameAndAge() {
        for (Student stud : studMass) {
            if (stud != null) {
                System.out.println(stud.getName()+" "+stud.getAge());
            }
        }
    }

    public int printCountClass(){
        for (Student stud: studMass){
            if (stud!=null){
                countClass++;
            }
        }
        return countClass;
    }



}




