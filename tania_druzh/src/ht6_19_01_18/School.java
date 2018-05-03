package ht6_19_01_18;


// Todo  School не должен содержать main
// Todo запуск программы (вывод логики по всей школе и отдельным классам) производится в одном ранере
public class School {
    private int number;
    private Adres adres;
    private ClassRoom[] classList;

    /*Когда создаем объект школа, по умолчанию она должна иметь 4 класса
"А", "Б" - украинские классы, "Д","З" - английские
Если же ничего не указывать, то должна срабатывать логика по умолчанию.*/
    public School() {
        classList = new ClassRoom[4];
        classList[0] = new ClassRoom("A", "ukr");
        classList[1] = new ClassRoom("B", "ukr");
        classList[2] = new ClassRoom("D", "eng");
        classList[3] = new ClassRoom("Z", "eng");

    }

    public School(int number, Adres adres, ClassRoom[] classList) {
        this.number = number;
        this.adres = adres;
        this.classList = classList;
    }

    /*При чем, если я создаю объект школа, должна быть возможность указать количество, и буквы
классов в школе.*/
    public void createSchool(String[] classesList) {
        ClassRoom[] classes = new ClassRoom[classesList.length];
        for (int i = 0; i < classesList.length; i++) {
            classes[i] = new ClassRoom(classesList[i]);
        }

    }

    /*Реализовать логику добавления новых классов, в дополнение к имеющимся. 1 вар*/
    public void addClasses(ClassRoom classObj) {
        for (int i = 0; i < classList.length; i++) {
            if (classList == null) {
                classList[i] = classObj;
            }
        }
    }

    /*Реализовать логику добавления новых классов, в дополнение к имеющимся. 2 вар*/
    public void addClasses(String[] classesListString) {
        ClassRoom[] tmp = new ClassRoom[classList.length];
        for (int i = 0; i < tmp.length; i++) {
            tmp[i] = classList[i];
        }
        classList = new ClassRoom[tmp.length + classesListString.length];
        for (int i = 0; i < tmp.length; i++) {
            classList[i] = tmp[i];
        }
        int startNewClasses = tmp.length;
        for (int i = 0; i < classesListString.length; i++) {
            classList[startNewClasses + i] = new ClassRoom(classesListString[i]);
        }
    }

    public School(int number, Adres adres, ClassRoom classRoom) {
        this.number = number;
        this.adres = adres;
        for (int i = 0; i < classList.length; i++) {
            if (classList[i] == null) {
                classList[i] = classRoom;
            }
        }

    }

    /*показывающий сколько и какие классы есть в школе*/
    public void printClassList() {
        System.out.println("There areThere are " + classList.length + " classes in school.");
        for (ClassRoom classR : classList) {
            System.out.println("Class " + classR.getClassWord() + " with limit " + classR.getClassLimit() + " and language " + classR.getLang());

        }
    }

    /*сколько украино язычных, сколько англоязычных классов*/
    public void colClassesByLang() {
        int engCount = 0;
        int ukrCount = 0;
        for (ClassRoom classR : classList) {
            if (classR.getLang() == "eng") {
                engCount++;
            } else if (classR.getLang() == "ukr") {
                ukrCount++;
            }
        }

        System.out.println("There are " + engCount + " english classes and " + ukrCount + " ukrainian.");
    }

    /*сколько студентов в каждом классе*/
    public void colStusEachClass() {
        for (ClassRoom classRoom : classList) {
            System.out.println("Class " + classRoom.getClassWord() + " has " + classRoom.getClassCount());
        }
    }

    /*сколько всего студентов учится в школе*/
    public void colSchoolStud() {
        int col = 0;
        for (ClassRoom classRoom : classList) {
            col = col + classRoom.getClassCount();
        }
        System.out.println("School " + number + " has " + col + " students.");
    }

    /*какой возрастной диапазон.*/
    public void ageRange() {
        int min;
        int max;
        for (ClassRoom classRoom : classList) {
            if (classRoom.getStudMass() != null) {
                min = classRoom.getStudMass()[0].getAge();
                max = classRoom.getStudMass()[0].getAge();
                for (Student student : classRoom.getStudMass()) {
                    if (student.getAge() > max) {
                        max = student.getAge();
                    }
                    if (student.getAge() < min) {
                        min = student.getAge();
                    }
                }
                System.out.println("Class " + classRoom.getClassWord() + " has min age " + min + " and max age " + max);
            }
        }
    }


    private static int colStudents = 30;
    private static Student[] studArr = new Student[colStudents];

    public static void main(String[] args) {
        createStudents();
    }

    /*Добавить в школу еще 30 студентов за признаком языка, исходя из того, что вместимость новых классов
        не более 15 человек.*/
    private static void createStudents() {

        for (int i = 0; i < studArr.length; i++) {
            if (i < studArr.length / 2) {
                Student stud = new Student("eng");
                studArr[i] = stud;
            } else {
                Student stud = new Student("ukr");
                studArr[i] = stud;
            }
        }
        School schoolFirst = new School();
        for (int i = 0; i < studArr.length; i++) {
            for (int j = 0; j < schoolFirst.classList.length; j++) {
                if (schoolFirst.classList[j].getLang() == studArr[i].getLang() &&
                        (schoolFirst.classList[j].getStudMass() == null || schoolFirst.classList[j].getStudMass().length < 15)) {
                    schoolFirst.classList[j].addStudents(studArr[i]);
                    break;
                }
            }
        }

        for (int i = 0; i < schoolFirst.classList.length; i++) {
            if (schoolFirst.classList[i].getStudMass() != null) {
                System.out.println(schoolFirst.classList[i].getClassWord() + " " + schoolFirst.classList[i].getLang());
                schoolFirst.classList[i].getClassList();
            }
        }

        /*какой возрастной диапазон.*/
        schoolFirst.ageRange();

        /*сколько всего студентов учится в школе.*/
        schoolFirst.colSchoolStud();

        /*сколько студентов в каждом классе*/
        schoolFirst.colStusEachClass();

        /*сколько украино язычных, сколько англоязычных.*/
        schoolFirst.colClassesByLang();

        /*показывающий сколько и какие классы есть в школе*/
        schoolFirst.printClassList();
    }
}
