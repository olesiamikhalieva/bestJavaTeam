package hw_29_04_18.Log_2;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StudentStorage{

    private static String file;

    public StudentStorage(String file) {
        this.file = file;
    }


    public void addStudentToFile(ArrayList<Student> students) {
        int index = ifEmptyFile()+1;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,true))) {
            for (Student student : students) {
                bw.write(index + " " + student.getName() + " " + student.getSecName() + " " + student.getThirdname());
                bw.newLine();
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void updateStudentFile(ArrayList<Student>students){
        int index = 1;

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file,false))) {
            for (Student student : students) {
                bw.write(index + " " + student.getName() + " " + student.getSecName() + " " + student.getThirdname());
                bw.newLine();
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int ifEmptyFile() {
        int index = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                index = Integer.parseInt((sCurrentLine.substring(0,sCurrentLine.indexOf(" "))));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return index;
    }

    public void getStudentByIndex(int index) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(file));
        int count = 0;
        int count1 = 0;
        for (String line : lines) {
            count++;
            if (count == index) {
                System.out.println(line);
                break;
            } else {
                count1++;
            }
        }
        if (count == count1) {
            System.out.println("No such index.");
        }
    }


    public void getStudentByName(String name) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(file));
        name = name.toLowerCase();
        int count = 0;
        for (String line : lines) {
            String newline = line.toLowerCase();
            if (newline.contains(name)) {
                count++;
                System.out.println(line);
            }
        }
        if (count == 0) {
            System.out.println("No such student.");
        }
    }


    public void deleteSudentsByIndex(int index, ArrayList<Student>students) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                arrayList.add(sCurrentLine);
            }
            for (int i = 0; i < arrayList.size(); i++) {
                Pattern p = Pattern.compile("^" + index + "\\s");
                Matcher m = p.matcher(arrayList.get(i));
                if (m.find()) {
                    count++;
                    System.out.println(index + " " + students.get(i).getName() + " " + students.get(i).getSecName() + " " + students.get(i).getThirdname());
                    arrayList.remove(index - 1);
                    students.remove(index - 1);
                }
            }
            if (count == 0) {
                System.out.println("Not such index!");
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))) {
            for (String st : arrayList) {
                bw.write(st);
                bw.newLine();
            }
        }
    }
}


