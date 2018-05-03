package try_to_do_hw_22_01_18;


public class ClassRoom {
    private String classWord;
    private int classLimit;
    Student[] studMass;
    private int sCounter = 0;

    public ClassRoom() {
    }

    public ClassRoom(String classWord, int classLimit) {
        this.classWord = classWord;
        this.classLimit = classLimit;
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

    public static void printClass(ClassRoom N) {
        System.out.println(N.getClassWord());
        Student[] nStud = N.getStudMass();
        for (int i = 0; i < nStud.length; ++i) {
            System.out.println(nStud[i].getName() + " " + nStud[i].getAge());
        }
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


}
