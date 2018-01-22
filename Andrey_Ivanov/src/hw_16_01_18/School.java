package hw_16_01_18;

public class School {
    private int numberSchool;
    private String adressSchool;
    private String numberPriemnoi;
    private ClassRoom[] classList;

    /*Когда создаем объект школа, по умолчанию она должна иметь 4 класса
    А", "Б" - украинские классы, "Д","З" - английские
    Если же ничего не указывать, то должна срабатывать логика по умолчанию.*/
    public School() {
        classList = new ClassRoom[4];
        classList[0] = new ClassRoom("A", "ukr");
        classList[1] = new ClassRoom("B", "ukr");
        classList[2] = new ClassRoom("D", "angl");
        classList[3] = new ClassRoom("E", "angl");
    }

    public School(int numberSchool, String adressSchool, String numberPriemnoi, ClassRoom[] classList) {
        this.numberSchool = numberSchool;
        this.adressSchool = adressSchool;
        this.numberPriemnoi = numberPriemnoi;
        this.classList = classList;
    }

    /*При чем, если я создаю объект школа, должна быть возможность указать количество, и буквы
классов в школе.*/
    public void newSchool(String[] classesOfSchool) {
        ClassRoom[] classes = new ClassRoom[classesOfSchool.length];
        for (int i = 0; i < classesOfSchool.length; i++) {
            classes[i] = new ClassRoom(classesOfSchool[i]);

        }
    }

    /*Реализовать логику добавления новых классов, в дополнение к имеющимся. 1 вар*/
    public void newClasses(ClassRoom newClass) {
        for (int i = 0; i < classList.length; i++) {
            if (classList == null) {
                classList[i] = newClass;
            }
        }
    }

    public School(int number, String adres, String telefon, ClassRoom classRoom) {
        this.numberSchool = number;
        this.adressSchool = adres;
        this.numberPriemnoi = telefon;
        for (int i = 0; i < classList.length; i++) {
            if (classList == null) {
                classList[i] = classRoom;
            }
        }
    }

    /*показывающий сколько и какие классы есть в школе*/
    public void classesSchool() {
        System.out.println("Имеется " + classList.length + " классов в школе");
        for (ClassRoom classR : classList) {
            System.out.println("Класс " + classR.getClassWord() + " имеет лимит " + classR.getClassLimit() + " и язык " + classR.getClass());

        }
    }

    /*сколько украино язычных, сколько англоязычных.*/
    public void countLangClasses() {
        int countUkr = 0;
        int countAngl = 0;
        for (ClassRoom classes : classList) {
            if (classes.getClassLanguage() == "ukr") {
                countUkr++;
            } else if (classes.getClassLanguage() == "angl") {
                countAngl++;
            }
        }

        System.out.println("В школе " + countUkr + " украинских классов и " + countAngl + " английских классов");
    }

    /*сколько студентов в каждом классе*/
    public void countStudInClasses() {
        for (ClassRoom classRoom : classList) {
            System.out.println("В классе " + classRoom.getClassWord() + " учаться " + classRoom.getCountStud());
        }
    }

    /*сколько всего студентов учится в школе*/
    public void countStudInSchool() {
        int countAllStud = 0;
        for (ClassRoom classRoom : classList) {
            countAllStud += classRoom.getCountStud();
            System.out.println("В школе " + numberSchool + " учаться " + countAllStud + " студентов");
        }
    }

    /*какой возрастной диапазон.*/
    public void getAgeMinMax() {
        int minAge;
        int maxAge;
        for (ClassRoom classRoom : classList) {
            if (classRoom.getStudMass() != null) {
                minAge = classRoom.getStudMass()[0].getAge();
                maxAge = classRoom.getStudMass()[0].getAge();
                for (Student student : classRoom.getStudMass()) {
                    if (student.getAge() > maxAge) {
                        maxAge = student.getAge();
                    }
                    if (student.getAge() < minAge) {
                        minAge = student.getAge();
                    }
                }
                System.out.println("Класс " + classRoom.getClassWord() + " мин возраст " + minAge + " и макс " + maxAge);
            }
        }
    }
    private static int countStudents = 30;
    private static Student[] studArr = new Student[countStudents];
}