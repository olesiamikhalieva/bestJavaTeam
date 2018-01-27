import java.lang.reflect.Array;

public class ClassRoom {

    private String classWord;

    private int classLimit;
    Student[] studMass;
    private int countOfStudents = 0;
    private int missedStudents = 0;


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

    public int getMissedStudents() {//можно глянуть сколько студентов, подходящих по возрасту не попало в класс
        return missedStudents;
    }


    public void addStudentToClass(Student student) {// запись конкретного студента в класс

        if (countOfStudents < studMass.length) {
            for (int i = 0; i < studMass.length; i++) {
                if (studMass[i] == null) {
                    studMass[i] = student;
                    countOfStudents++;
                    break;
                }
            }
        } else {
            missedStudents++;
            System.out.println(student.getAge() + " имя " + student.getName());
        }

    }

    public void showAllStudents() {// показать всех студентов
        System.out.println("Класс " + classWord);
        for (int i = 0; i < studMass.length; i++) {
            if (checkStudentOnNull(studMass[i]) == true) {
                break;
            } else {
                System.out.println("Имя ученика(ученицы): " + studMass[i].getName() + ". Его(её) возраст - " + studMass[i].getAge());
            }
        }
    }

    public void showAllStudentsByName() {// показать всех студентов по имени
        System.out.println("Класс " + classWord);
        for (int i = 0; i < studMass.length; i++) {
            if (checkStudentOnNull(studMass[i]) == true) {
                break;
            } else {
                System.out.println("Имя ученика(ученицы): " + studMass[i].getName());
            }
        }
    }

    public void sortByAge() {//сортировка по имени в прямом порядке
        for (int i = 0; i < studMass.length; i++) {
            if (checkStudentOnNull(studMass[i]) == true) {
                studMass = updateStudMass(studMass);
            }
        }
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j].getAge() < studMass[j + 1].getAge()) {
                    Student tmp;
                    tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
            System.out.println(studMass[i].getAge() + " Имя " + studMass[i].getName());
        }
    }

    public void sortRevByAge() {//сортировка по возрасту в обратном порядке
        for (int i = 0; i < studMass.length; i++) {
            if (checkStudentOnNull(studMass[i]) == true) {
                studMass = updateStudMass(studMass);
            }
        }
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j].getAge() > studMass[j + 1].getAge()) {
                    Student tmp;
                    tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
            System.out.println(studMass[i].getAge() + " Имя " + studMass[i].getName());
        }
    }
    public void sortByName() {//сортировка по имени в прямом порядке
        for (int i = 0; i < studMass.length; i++) {
            if (checkStudentOnNull(studMass[i]) == true) {
                studMass = updateStudMass(studMass);
            }
        }
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) < 0) {
                    Student tmp;
                    tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
            System.out.println(studMass[i].getAge() + " Имя " + studMass[i].getName());
        }
    }


    public void sortRevByName() {//сортировка по имени в реверсном порядке
        for (int i = 0; i < studMass.length; i++) {
            if (checkStudentOnNull(studMass[i]) == true) {
                studMass = updateStudMass(studMass);
            }
        }
        for (int i = studMass.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (studMass[j].getName().compareTo(studMass[j + 1].getName()) > 0) {
                    Student tmp;
                    tmp = studMass[j];
                    studMass[j] = studMass[j + 1];
                    studMass[j + 1] = tmp;
                }
            }
            System.out.println(studMass[i].getAge() + " Имя " + studMass[i].getName());
        }
    }

    private int countCalledStudents = 0;

    public void callStudentByNameInClass(Student s) {//ищем студента по имени внутри класса
        s.generateName();
        System.out.println("Ищем студента по имени: " + s.getName());
        for (int i = 0; i < studMass.length; i++) {
            if (s.getName().equals(studMass[i].getName())) {
                System.out.println(studMass[i].getName() + " ему(ей) " + studMass[i].getAge() + " лет");
                countCalledStudents++;
            }

        }
        if (countCalledStudents == 0) {
            System.out.println("\nНикого тут нет\n");
        }
    }

    public boolean checkStudentOnNull(Student student) {
        if (student == null) {
            return true;
        } else {
            return false;
        }
    }

    public Student[] updateStudMass(Student[] studMass) {
        for (int i = 0; i < studMass.length; i++) {
            if (studMass[i] == null) {
                Student[] updateStudMass = new Student[i];
                System.arraycopy(studMass, 0, updateStudMass, 0, i);
                studMass = updateStudMass;
            }
        }
        return studMass;
    }
}
