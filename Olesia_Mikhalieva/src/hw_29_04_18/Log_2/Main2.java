//package hw_29_04_18.Log_2;
//
//import java.io.*;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//
//public class Main2 {
//
//    private static final String FILENAME = "d:\\Java\\Log.txt";
//
//    public static void main(String[] args) {
//
//
//
//        ArrayList<String> dateArrayList = new ArrayList<>();
//        dateArrayList.add(Utils.currentDate());
//        dateArrayList.add(Utils.currentDate());
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("alina", "kurt", "kurtov"));
//        students.add(new Student("elena", "koneva", "zagugueva"));
//        students.add(new Student("repka", "tianet", "babky"));
//        students.add(new Student("repka", "tianet", "babky"));
//
//
//
//        Log jr = new Log(student.getID(), dateArrayList);
//
//
//
//
//        int index = 1;
//        String[] journaList = null;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
//
//            String sCurrentLine;
//            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
//                index = Integer.parseInt((sCurrentLine.substring(0, sCurrentLine.indexOf(" "))));
//                journaList = sCurrentLine.substring(sCurrentLine.indexOf("[")).replaceAll("[\\[\\]]", "").split(",");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(index++);
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME, true))) {
////            for (Student student : students) {
//            bw.write(jr.getId() + " " + jr.getDates());
//            bw.newLine();
//            index++;
////            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        if (journaList != null) {
//            for (String s : journaList) {
//                System.out.println(s.trim());
//            }
//        }
//    }
//
//
//
//
//
//}
