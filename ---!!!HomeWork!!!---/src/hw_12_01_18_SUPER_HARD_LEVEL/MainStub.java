package hw_12_01_18_SUPER_HARD_LEVEL;
import java.util.concurrent.ThreadLocalRandom;

public class MainStub {

    public static ClassRoom[] classRoomMass;

    public static void main(String[] args) {

        School school = new School();

        ClassRoom classA = createNewClass("A", 12);
        ClassRoom classB = createNewClass("Б", 15);

        school.showAllClassesLetter(classRoomMass);

        addStudentsToClasses(classA, classB);


        Student student = new Student();
        student.generateName();

        classA.showAllStudents();
        classB.showAllStudents();

        System.out.println("\nТолько имена\n");

        classA.showAllStudentsByName();
        classB.showAllStudentsByName();

        System.out.println("\nСортировка по имени: \n Класс А\n");

        classA.sortByName();
        System.out.println("\nКласс Б\n");
        classB.sortByName();

        System.out.println("\nПо возрасту: \n Класс А\n");

        classA.sortByAge();
        System.out.println("\nКласс Б\n");
        classB.sortByAge();

        System.out.println("\nСортировки в реверсном порядке\n Класс А\n");

        classA.sortRevByName();
        System.out.println("\nКласс Б\n");
        classB.sortRevByName();

        System.out.println("\nПо возрасту\nКласс А\n");

        classA.sortRevByAge();
        System.out.println("\nКласс Б\n");
        classB.sortRevByAge();

        System.out.println("\nПоиск студентов по имени внутри конкретного класса\n");
        Student student1 = new Student();

        classA.callStudentByNameInClass(student1);
        classB.callStudentByNameInClass(student1);

        System.out.println("\nПоиск студентов в обоих классах по имени\n");

        callStudentByNameFromAnyClass(student, classA, classB);
    }

    public static Student[] initStudents() {      //инициализация студентов
        Student[] allStudents = new Student[40];
        System.out.println("Все студенты\n");
        for (int i = 0; i < allStudents.length; i++) {
            Student student = new Student();
            student.generateName();
            student.setAge(ThreadLocalRandom.current().nextInt(7, 16 + 1));
            allStudents[i] = student;
            System.out.println(student.getName() + " " + student.getAge());
        }

        System.out.println("\nСтуденты не попали:\n");
        return allStudents;
    }

    public static void addStudentsToClasses(ClassRoom classA, ClassRoom classB) {     //запись студентов в класс

        for (Student student : initStudents()) {
            if (student.getAge() <= 12) {
                classA.addStudentToClass(student);
            } else {
                classB.addStudentToClass(student);
            }
        }
        System.out.println("\nКол-во студентов, которые не попали в:\n" + "Класс А\n" + classA.getMissedStudents() + "\nКласс Б\n" + classB.getMissedStudents());
    }

    public static void callStudentByNameFromAnyClass(Student s, ClassRoom classA, ClassRoom classB) {//ищем студента по имени в обоих классах
        int countCalledStudents = 0;
        System.out.println("Ищем студента по имени во обоих классах: " + s.getName());
        System.out.println("В классе А:\n");
        for (int i = 0; i < classA.studMass.length; i++) {
            if (classA.checkStudentOnNull(classA.studMass[i]) == true) {
                break;
            }
            if (s.getName().equals(classA.studMass[i].getName())) {
                System.out.println(classA.studMass[i].getName() + " ему(ей) " + classA.studMass[i].getAge() + " лет");
                countCalledStudents++;
            }
        }
        if (countCalledStudents == 0) {
            System.out.println("\nНикого тут нет\n");
        }
        countCalledStudents = 0;
        System.out.println("В классе Б:\n");
        for (int i = 0; i < classB.studMass.length; i++) {
            if (classB.checkStudentOnNull(classB.studMass[i]) == true) {
                break;
            }
            if (s.getName().equals(classB.studMass[i].getName())) {
                System.out.println(classB.studMass[i].getName() + " ему(ей) " + classB.studMass[i].getAge() + " лет");
                countCalledStudents++;
            }
        }
        if (countCalledStudents == 0) {
            System.out.println("\nНикого тут нет\n");
        }
    }

    public static ClassRoom createNewClass(String classWord, int classLimit) {
       ClassRoom newSchoolClass = new ClassRoom(classWord,classLimit);
        if (classRoomMass == null) {
            classRoomMass = new ClassRoom[1];
            classRoomMass[0] = newSchoolClass;
        } else {
            ClassRoom[] updateClassRoomMass = new ClassRoom[classRoomMass.length + 1];
            System.arraycopy(classRoomMass,0,updateClassRoomMass,0,classRoomMass.length);
            for (int i = 0; i < updateClassRoomMass.length; i++){
                if (updateClassRoomMass[i] == null){
                    updateClassRoomMass[i] = newSchoolClass;
                    classRoomMass = updateClassRoomMass;
                }
            }
        }
        return newSchoolClass;
    }
}
