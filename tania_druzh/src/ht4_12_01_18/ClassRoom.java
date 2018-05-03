package ht4_12_01_18;

public class ClassRoom {
    private String classWord;
    private int classLimit;
    private Student[] studMass;



    public ClassRoom(String classWord, int classLimit, Student[] studMass) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studMass = studMass;
    }

    /*показывающие сколько человек есть в в конкретном классе*/
    public int getClassCount() {
        return studMass.length;
    }

    /*показывающей всех студентов класса(их имена и возраст)*/
    public void getClassList(){
        for (Student mass : studMass) {
            System.out.println(mass.getName() + " " + mass.getAge());

        }
    }

    /*показывающей всех студентов класса(только имя)*/
    public void getShortClassList(){
        for (Student mass : studMass) {
            System.out.println(mass.getName());

        }
    }

    /*показывающий всех   в отсортированном порядке по возрасту*/
    public void ageSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getAge() > studMass[j + 1].getAge()) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }

    /*показывающий всех   в отсортированном обратном порядке по возрасту*/
    public void ageRevSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getAge() < studMass[j + 1].getAge()) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }

    /*показывающий всех   в отсортированном порядке по алфавиту*/
    public void nameSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) > 0) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }

    /*показывающий всех   в отсортированном обратном порядке по алфавиту*/
    public void nameRevSort() {
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) < 0) {
                    Student tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
        }
    }

    /*метод который находит конкретного студента по имени в конкретном классе*/
    public void findStudent(String name){
        for (int i = 0; i < studMass.length; i++){
            if (studMass[i].getName().equals(name)){
                System.out.println(studMass[i].getName() + " " + studMass[i].getAge());
            }
        }
    }

    /*метод который ищет и показывает в каких классах есть студент с таким именем*/
    public String findClass(String name){
        for (int i = 0; i < studMass.length; i++){
            if (studMass[i].getName().equals(name)){
                return classWord;
            }
        }
        return "Not found in " + classWord;
    }

}
