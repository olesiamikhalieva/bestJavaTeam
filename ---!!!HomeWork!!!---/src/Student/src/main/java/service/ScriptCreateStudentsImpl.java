package service;

import domenObject.Student;
import service.Interfaces.ScriptCreateStudents;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class ScriptCreateStudentsImpl implements ScriptCreateStudents {

    private static final String INSERT_SCRIPT_FILE = "src//main//resources//insertTo30Students.sql";
    private static final String INSERT_SCRIPT = "INSERT INTO student (name, ser_name, phone, email) VALUES (";

    @Override
    public void createThirdStudents() { // скрипт создания дополнительных тридцати студентов
        ArrayList<Student> students = new ArrayList<>();

        for (int i = 1; i <= 30; i++) {
            students.add(new Student("Добавляем"+i, "Студентов"+i, "+000553121"+i,"pochta" + i + "@mail.org"));
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(INSERT_SCRIPT_FILE))) {
            for (Student student : students) {
                bw.write(INSERT_SCRIPT + "'" + student.getName() + "', '" + student.getSerName() + "', '" + student.getPhone() + "', '" + student.getEmail() + "');");
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
