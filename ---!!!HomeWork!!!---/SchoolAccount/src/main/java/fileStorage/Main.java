package fileStorage;

import java.io.*;
import java.util.ArrayList;

/**
 * Created by java on 11.05.2018.
 */
public class Main {
    public static void main(String[] args) {
        int index = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("StudDB.txt"))) {

            String sCurrentLine;

            while ((sCurrentLine = br.readLine()) != null) {
                index = Integer.parseInt(sCurrentLine.substring(0,sCurrentLine.indexOf(" ")));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(index);

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("один1", "два1", "три1"));
        students.add(new Student("один2", "два2", "три3"));
        students.add(new Student("один3", "два3", "три3"));

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("StudDB.txt",true))) {
            for (Student s:students) {
                bw.write(++index + " " + s.getName() + " " + s.getSecName() + " " + s.getThirdName());
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //todo проверить запись, если БД пустая
    }
}
