//package hw_29_04_18.Log_2;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Date;
//
//public class LogStorage {
//
//    private static String file;
//    private int id;
//
//
//    public LogStorage(String file) {
//        this.file = file;
//    }
//
//    public void addStudentsToLog(Student student, Date date){
//        int index = 1;
//        String[] journaList = null;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//
//            String sCurrentLine;
//            while ((sCurrentLine = br.readLine()) != null) {
//                journaList = sCurrentLine.substring(sCurrentLine.indexOf("[")).replaceAll("[\\[\\]]", "").split(",");
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
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
//}
