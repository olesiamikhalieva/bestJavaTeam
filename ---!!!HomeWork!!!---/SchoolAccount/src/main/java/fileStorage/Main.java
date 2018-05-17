package fileStorage;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by java on 11.05.2018.
 */
public class Main {
    public static void main(String[] args) {
        ThreeStud(); //записываем 3 студентов в файл
        Journal.addStudentInJournal(); // добавляем всех студентов в журна

        System.out.println(Journal.getStudentByIndex(2));
        System.out.println(Journal.getStudentByName("Имя5"));
        Student student = Student.builder().id(1).address("dsf").age(1).name("dfcz").secName("ff").thirdName("fg").build();
        Journal.addStudentInJournal(student);
        System.out.println(Journal.studentVisit(10));
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
