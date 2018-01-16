package hw_12_01_18;

public class ClassRoom {
    String classWord;
    int classLimit;
    Student[] studMass;


    public ClassRoom(String classWord, int classLimit, Student[] studMass) {
        this.classWord = classWord;
        this.classLimit = classLimit;
        this.studMass = studMass;
    }
    public int countStudent() {
        return studMass.length;
    }

    public void listStudent() {
        for (Student mass : studMass) {
            System.out.println(mass.getName() + "  " + mass.getAge());
        }
    }

    public void listNamesOfStudents() {
        for (Student mass : studMass) {
            System.out.println(mass.getName());
        }
    }

    public void sortAge() {
        boolean is_swapped;
        for (int j = 0; j < studMass.length - 1; j++) {
            is_swapped = false;
            for (int i = 0; i < studMass.length - 1 - j; i++) {
                if (studMass[i].getAge() > studMass[i + 1].getAge()) {
                    Student tmp = studMass[i];
                    studMass[i] = studMass[i + 1];
                    studMass[i + 1] = tmp;
                    is_swapped = true;
                }
            }
            if (!is_swapped) {
                break;
            }
        }
    }

    public void sortAgeRevers() {
        boolean is_swapped;
        for (int j = 0; j < studMass.length - 1; j++) {
            is_swapped = false;
            for (int i = 0; i < studMass.length - 1 - j; i++) {
                if (studMass[i].getAge() < studMass[i + 1].getAge()) {
                    Student tmp = studMass[i];
                    studMass[i] = studMass[i + 1];
                    studMass[i + 1] = tmp;
                    is_swapped = true;
                }
            }
            if (!is_swapped) {
                break;
            }
        }
    }

    public String findName(String name) {
        for (int i = 0; i < studMass.length; i++) {
            if (studMass[i].getName().equals(name)) {
                return "Имя студента "+studMass[i].getName() + " возраст " + studMass[i].getAge();
            }
        }
        return "Отсутствует!";
    }
    public String findNameInClass(String name){
        for (int i=0;i<studMass.length;i++){
            if(studMass[i].getName().equals(name)){
                return "имя "+studMass[i].getName()+" возраст "+studMass[i].getAge()+" лет";
            }
        }
        return "не найден!";
    }
}




