package Journal;

import Journal.Student;
import Journal.StudentStorageWorker;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class StudentStorageWorkerIml implements StudentStorageWorker {

    Student student;
    private static final String FILENAME = "d:\\StudentDB.txt";
    static ArrayList<Student> students;
    int index = 1;

    @Override
    public void createStudentList() {
        int count = 1;
        students = new ArrayList<>();
        students.add(new Student("Mike", "Owen", "Victorovich"));
        students.add(new Student("Cristiano", "Ronaldo", "Olegovich"));
        students.add(new Student("Luis", "Suares", "Danilovich"));
        students.add(new Student("David", "Bechkam", "Valentinovich"));
        students.add(new Student("Leo", "Messi", "Sergeevich"));
        students.add(new Student("Andre", "Iniesta", "Dmitrievich"));
        students.add(new Student("Diego", "Costa", "Vladimirovich"));
        students.add(new Student("Robert", "Pires", "Filimonovich"));
        students.add(new Student("Ze", "Roberto", "Kirilovich"));
        students.add(new Student("Bob", "Charlton", "Vladimirovich"));
        System.out.println("Создали " + students.size() + " студентов и записали в файл " + FILENAME);
        for (Student student : students) {
            System.out.println(count + " " + student.getName() + " " + student.getSecName() + " " + student.getThirdname());
            count++;
        }
        System.out.println("------------------------------------------------------");
    }

    void writeStudentsToFile() {
        int index = 1;
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME, false))) {
            for (Student student : students) {
                bw.write(index + " " + student.getName() + " " + student.getSecName() + " " + student.getThirdname());
                bw.newLine();
                index++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    void readFromFile() {
        System.out.println("Получение списка студентов из файла " + FILENAME);
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                index = Integer.parseInt((sCurrentLine.substring(0, sCurrentLine.indexOf(" "))));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("------------------------------------------------------");
    }

    @Override
    public void addStudent(Student student) {
        students.add(student);
        writeStudentsToFile();
        System.out.println("Cоздали ещё одного студента и добавили в общий список:");
        System.out.println("Новый студент = " + student.getName() + " " + student.getSecName() + " " + student.getThirdname());
        System.out.println("Всего активных студентов: " + students.size());
        readFromFile();
    }

    @Override
    public void getStudentByIndex(int index) throws IOException {
        System.out.println("Поиск студента по индексу:" + index);
        List<String> lines = Files.readAllLines(Paths.get(FILENAME));
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
            System.out.println("Нет такого индекса!");
        }
        System.out.println("------------------------------------------------------");
    }

    @Override
    public void getStudentByName(String name) throws IOException {
        System.out.println("Поиск студента по имени:" + name);
        List<String> lines = Files.readAllLines(Paths.get(FILENAME));
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
            System.out.println("Нет студента с таким именем!");
        }
        System.out.println("------------------------------------------------------");
    }

    @Override
    public void deleteSudentsByIndex(int index) throws IOException {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("Удаление студента по индексу:" + index);
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
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
                System.out.println("Нет такого индекса!");
            }
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME, false))) {
            for (String st : arrayList) {
                bw.write(st);
                bw.newLine();
            }
        }
        System.out.println("------------------------------------------------------");
    }

    public void clearFileStudents() throws IOException {
        System.out.println("Произведена очитска файла студентов");
        String[] mass = new String[0];
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME, false))) {
            for (String st : mass) {
                bw.write(st);
                bw.newLine();
            }
        }
        System.out.println("------------------------------------------------------");
    }
}
