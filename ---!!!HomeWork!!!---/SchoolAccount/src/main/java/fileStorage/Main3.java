package fileStorage;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 * Created by java on 15.05.2018.
 */
public class Main3 {

    private static final String FILENAME = "Journal.txt";

    public static void main(String[] args) {

        ArrayList<String> dateArrayList = new ArrayList<>();
        dateArrayList.add(currentDate());
        dateArrayList.add(currentDate());

//        Student student = getStudentByName("один1", "два1", "три1");
        Student student = new Student();
        Journal jr = new Journal(student.getId(), dateArrayList);


        int index = 1;
        String[] journaList = null;

        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                index = Integer.parseInt((sCurrentLine.substring(0, sCurrentLine.indexOf(" "))));
                journaList = sCurrentLine.substring(sCurrentLine.indexOf("[")).replaceAll("[\\[\\]]", "").split(",");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(index++);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME, true))) {
//            for (Student student : students) {
            bw.write(jr.getId() + " " + jr.getDates());
            bw.newLine();
            index++;
//            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (journaList != null) {
            for (String s : journaList) {
                System.out.println(s.trim());
            }
        }
    }


    public static String currentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return now.format(formatter);
    }
}

