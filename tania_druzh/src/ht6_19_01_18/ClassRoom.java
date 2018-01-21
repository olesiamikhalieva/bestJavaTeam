package ht6_19_01_18;

public class ClassRoom {
    private String classWord;
    private int classLimit;
    private Student[] studMass;
    private String lang;

    private static ClassRoom[] classesList = new ClassRoom[0];

    private void setClassesList() {
        ClassRoom[] tmp = new ClassRoom[classesList.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = classesList[i];
        }
        classesList = new ClassRoom[tmp.length + 1];
        for (int i = 0; i < tmp.length; i++) {
            classesList[i] = tmp[i];
        }
        classesList[tmp.length] = this;
    }

    //private static int colClasses = 0;
    public ClassRoom() {
        setClassesList();
    }

    public ClassRoom(String classWord, int classLimit, Student[] studMass) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studMass = studMass;

        setClassesList();
    }

    public ClassRoom(String classWord, int classLimit, Student[] studMass, String lang) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studMass = studMass;
        this.lang = lang;
    }

    public ClassRoom(String classWord, String lang) {
        this.classWord = classWord;
        this.lang = lang;
        setClassesList();
    }

    public ClassRoom(String classWord) {
        this.classWord = classWord;
        setClassesList();
    }

    public void setClassWord(String classWord) {
        this.classWord = classWord;
    }

    public void setClassLimit(int classLimit) {
        this.classLimit = classLimit;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public static ClassRoom[] getClassesList() {
        return classesList;
    }

    public static void setClassesList(ClassRoom[] classesList) {
        ClassRoom.classesList = classesList;
    }

    public int getClassesCount() {
        return classesList.length;
    }

    /*показывающие сколько человек есть в в конкретном классе*/
    public int getClassCount() {
        if (studMass == null){
            return 0;
        }
        else {
            return studMass.length;
        }
    }

    public Student[] getStudMass() {
        return studMass;
    }


    public void setStudMass(Student[] studMass) {
        this.studMass = studMass;
    }


    /*показывающей всех студентов класса(их имена и возраст)*/
    public void getClassList() {
        for (Student mass : studMass) {
            System.out.println(mass.getName() + " " + mass.getAge() + " " + mass.getLang());

        }
    }

    /*показывающей всех студентов класса(только имя)*/
    public void getShortClassList() {
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
    public void findStudent(String name) {
        for (int i = 0; i < studMass.length; i++) {
            if (studMass[i].getName().equals(name)) {
                System.out.println(studMass[i].getName() + " " + studMass[i].getAge());
            }
        }
    }

    /*метод который ищет и показывает в каких классах есть студент с таким именем. вар. 1*/
    public String findClass(String name) {
        for (int i = 0; i < studMass.length; i++) {
            if (studMass[i].getName().equals(name)) {
                return classWord;
            }
        }
        return "Not found in " + classWord;
    }

    /*метод который ищет и показывает в каких классах есть студент с таким именем. вар. 2*/
    public void findClassByName(String name) {
        for (int j = 0; j < classesList.length; j++) {
            for (int i = 0; i < classesList[j].studMass.length; i++) {
                if (classesList[j].studMass[i].getName().equals(name)) {
                    System.out.println("Found in " + classesList[j].classWord);
                }
            }
            System.out.println("Not found in " + classesList[j].classWord);
        }
    }


    public String getClassWord() {
        return classWord;
    }

    public int getClassLimit() {
        return classLimit;
    }

    public String getLang() {
        return lang;
    }

    public void addStudents(String[] stListString) {
        Student[] tmp = new Student[studMass.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = studMass[i];
        }
        studMass = new Student[tmp.length + stListString.length];
        for (int i = 0; i < tmp.length; i++) {
            studMass[i] = tmp[i];
        }
        int startNewClasses = tmp.length;
        for (int i = 0; i < stListString.length; i++) {
            studMass[startNewClasses + i] = new Student(stListString[i]);
        }
    }

    public void addStudents(Student st) {
        if (studMass != null) {
            Student[] tmp = new Student[studMass.length];
            for (int i = 0; i < tmp.length; i++) {
                tmp[i] = studMass[i];
            }
            studMass = new Student[tmp.length + 1];
            for (int i = 0; i < tmp.length; i++) {
                studMass[i] = tmp[i];
            }

            studMass[tmp.length] = st;
        }
        else {
            studMass = new Student[1];
            studMass[0] = st;
        }

    }

//    public static void main(String[] args) {
//        ClassRoom cl1 = new ClassRoom();
//        System.out.println(cl1.getClassesCount());
//        ClassRoom cl2 = new ClassRoom();
//        System.out.println(cl1.getClassesCount());
//
//    }
}
