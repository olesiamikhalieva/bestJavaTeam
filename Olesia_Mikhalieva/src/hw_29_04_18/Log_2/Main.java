package hw_29_04_18.Log_2;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        String fileStudentStorage = "D:\\Java\\Project\\File\\Students.txt";
        StudentStorage studentStorage = new StudentStorage(fileStudentStorage);
        Student student1 = new Student("alina", "kurt", "kurtov");
        Student student2 = new Student("elena", "koneva", "zagugueva");
        Student student3 = new Student("alina", "Ivanova", "Zueva");
        studentStorage.addStudent(student1);
        studentStorage.addStudent(student2);
        studentStorage.addStudent(student3);
        studentStorage.addStudentToFile();
        studentStorage.addStudent(new Student("Vasya", "Volkov", "Ivanovich"));
        studentStorage.updateStudentFile();
        studentStorage.getStudentByIndex(1);
        studentStorage.getStudentByName("Vasya");
        studentStorage.deleteSudentsByIndex(1);
        studentStorage.updateStudentFile();
        String fileLogStorage = "D:\\Java\\Project\\File\\Log.txt";
        LogStorage logStorage = new LogStorage(fileLogStorage);
        logStorage.addDataOfPresentStudentToLog(studentStorage.getIndexByStudent(student2),"15.08.17");
    }
}
