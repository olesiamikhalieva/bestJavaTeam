package hw_29_04_18.Log_2;

import java.io.IOException;
import java.util.ArrayList;

    public class Main {

        public static void main(String[] args) throws IOException {


            ArrayList<Student> students = new ArrayList<>();
            students.add(new Student("alina", "kurt", "kurtov"));
            students.add(new Student("elena", "koneva", "zagugueva"));
            students.add(new Student("repka", "tianet", "babky"));
            students.add(new Student("repka", "tianet", "babky"));
            StudentStorage studentStorage = new StudentStorage("D:\\Java\\Project\\File\\Students.txt");
            studentStorage.addStudentToFile(students);
            students.add(new Student("Vasya","Volkov","Ivanovich"));
            studentStorage.updateStudentFile(students);
            studentStorage.getStudentByIndex(1);
            studentStorage.getStudentByName("Vasya");
            studentStorage.deleteSudentsByIndex(1,students);
            studentStorage.updateStudentFile(students);
            Log log = new Log();
        }



    }
