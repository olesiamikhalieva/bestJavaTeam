package fileStorage;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by java on 11.05.2018.
 */
public class Main {
    public static void main(String[] args) {
//        ThreeStud(); //записываем 3 студентов в файл
//        MethodJournal.addStudentInJournal(); // добавляем всех студентов в журнал
//
//        System.out.println(MethodJournal.getStudentByIndex(2));
//        System.out.println(MethodJournal.getStudentByName("Имя5"));
//        MethodJournal.addStudentInJournal(Student.builder().id(1).address("dsf").age(1).name("dfcz").secName("ff").thirdName("fg").build());
//        System.out.println(MethodJournal.studentVisit(10));
//        MethodJournal.addStudentsInJournalWithoutVisit(Student.builder().id(1).address("123456").age(150).name("Добавляем").secName("Одного").thirdName("Студента").build());

        ArrayList<Student>students = new ArrayList<>();
        students.add(Student.builder().id(1).address("123456").age(150).name("Добавляем1").secName("пачку1").thirdName("Студентов1").build());
        students.add(Student.builder().id(1).address("123456").age(175).name("Добавляем2").secName("пачку2").thirdName("Студентов2").build());
        students.add(Student.builder().id(1).address("123456").age(7).name("Добавляем3").secName("пачку3").thirdName("Студентов3").build());
        MethodJournal.addStudentsInJournalWithoutVisit(students);
    }

    public static void ThreeStud() {
        String fileStudDB = "StudDB.txt";
        int index = 0;
        ArrayList<Student> students = new ArrayList<>();
        ArrayList<String> stringStud = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileStudDB))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                index = Integer.parseInt(sCurrentLine.substring(0, sCurrentLine.indexOf(" ")));
                stringStud.add(sCurrentLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        students.add(new Student(++index, "Имя" + index, "Фамилия" + index, "Отчество" + index));
        students.add(new Student(++index, "Имя" + index, "Фамилия" + index, "Отчество" + index));
        students.add(new Student(++index, "Имя" + index, "Фамилия" + index, "Отчество" + index));


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileStudDB, true))) {
            for (Student s : students) {
                bw.write(s.getId() + " " + s.getName() + " " + s.getSecName() + " " + s.getThirdName());
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
