package service;


import domenObject.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;


public class ScriptReaderServiceImpl implements ScriptReaderService {

    private static final String INSERT_SCRIPT_FILE = "D:\\athis\\this_java\\project\\Student22.05\\src\\main\\resources\\insertStudent.sql";

    @Override
    public void readScript() {

        Student student = null;
        String[] studFieldMass = null;
        ArrayList<Student> studentList = new ArrayList<>();
        int studentCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(INSERT_SCRIPT_FILE))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String studentDataStr = sCurrentLine.substring(sCurrentLine.indexOf("VALUES") + 8, sCurrentLine.length() - 2).replace("'", "").trim();
                studFieldMass = studentDataStr.split(",");
                student = new Student(studFieldMass[0], studFieldMass[1], studFieldMass[2], studFieldMass[3]);
                studentList.add(student);
                studentCount++;
                //Todo print all studebt with gmail.com
//                if (student.getEmail().contains("@gmaill.com")) {
//                    System.out.println("student with gmail.com domain mail name is -> "+student.getName() + " " + student.getEmail());
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        //Todo print count in the table
        System.out.println("------");
        System.out.printf("student count in table =" + studentCount);
        System.out.println("------");
        checkOnSameName(studentList);
    }


    private static void checkOnSameName(ArrayList<Student> studentArrayList) {
        Collections.sort(studentArrayList);
        HashSet<String> students = new HashSet<>();
        String name = null;
        for (int i = 0; i < studentArrayList.size(); i++) {
            if (name != null && name.equals(studentArrayList.get(i).getSerName())) {
                students.add(studentArrayList.get(i).getSerName());
            }
            name = studentArrayList.get(i).getSerName();
        }
        for (Student student : studentArrayList) {
            for (String s : students) {
                if (student.getSerName().equals(s)) {
                    System.out.println(student.getName() + " " + student.getSerName());
                }
            }
        }
    }
}
