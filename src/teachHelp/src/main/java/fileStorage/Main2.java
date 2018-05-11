package fileStorage;

import java.io.*;
import java.util.ArrayList;

public class Main2 {

    private static final String FILENAME = "d:\\_aJavaBestTeam\\ateacherHelpDataBase\\StudentDB.txt";

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("alina", "kurt", "kurtov"));
        students.add(new Student("elena", "koneva", "zagugueva"));
        students.add(new Student("repka", "tianet", "babky"));
        students.add(new Student("repka", "tianet", "babky"));


        for (int i=0; i<=100; i++){
            students.add(new Student("alina", "kurt", "kurtov"));
        }

        // append to end of file
//        FileWriter fw = new FileWriter(FILENAME, true);
//        BufferedWriter bw = new BufferedWriter(fw);


        //Todo  проверить запись, еслинаша файл пустой.

        int index = 1;

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                index = Integer.parseInt((sCurrentLine.substring(0,sCurrentLine.indexOf(" "))));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(index++);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
            for (Student student : students) {
                bw.write(index + " " + student.getName() + " " + student.getSecName() + " " + student.getThirdname());
                bw.newLine();
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }




}
