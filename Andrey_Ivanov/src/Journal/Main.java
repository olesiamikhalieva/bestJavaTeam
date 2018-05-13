package Journal;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

        StudentStorageWorkerIml stud = new StudentStorageWorkerIml();


        stud.createStudentList();//создание студентов
        stud.writeStudentsToFile();//запись созданных студентов в файл
        stud.getStudentByIndex(4);//поиск студента по индексу
        stud.getStudentByName("Leo");//поиск студента по имени
        stud.deleteSudentsByIndex(6);//удаление студента по индексу из файла
        stud.readFromFile();//чтение файла d:\\StudentDB.txt"
        stud.addStudent(stud.student=new Student("Roberto","Carlos","Viniloviy"));//добавление студента в файл
        //stud.clearFileStudents();//метод для очитски файла "d:\\StudentDB.txt"
    }
}
