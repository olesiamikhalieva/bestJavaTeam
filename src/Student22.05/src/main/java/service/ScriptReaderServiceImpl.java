package service;

import domenObject.Student;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class ScriptReaderServiceImpl implements ScriptReaderService {

    private static final String INSERT_SCRIPT_FILE = "D:\\_aJavaBestTeam\\Student\\src\\main\\resources\\insertStudent.sql";

    @Override
    public void readScript() {

        Student student = null;
        String[] studFieldMass = null;
        List<String> surnameList = new ArrayList<>();
        int studentCount = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(INSERT_SCRIPT_FILE))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
                String studentDataStr = sCurrentLine.substring(sCurrentLine.indexOf("VALUES") + 8, sCurrentLine.length() - 2).replace("'", "").trim();
                studFieldMass = studentDataStr.split(",");
                student = new Student(studFieldMass[0], studFieldMass[1], studFieldMass[2], studFieldMass[3]);

                if (surnameList.contains(student.getSerName())) {
                    System.out.println(student.getSerName());
                }
                // System.out.println(student.getName() + "" + student.getSerName() + "" + student.getPhone() + " " + student.getEmail());
                studentCount++;
//                if (student.getEmail().contains("gmail.com")) {
//                    System.out.println(student.getName() + " " + student.getEmail());
//                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
//        System.out.printf("student count in table =" + studentCount);
    }

}
