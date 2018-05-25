package service;

import domenObject.Student;
import service.Interfaces.ScriptReaderService;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by dev on 22.05.2018.
 */
public class ScriptReaderServiceImpl implements ScriptReaderService {

    private static final String INSERT_SCRIPT_FILE = "src\\main\\resources\\Insert_All_Students.sql";

    private Map<String, Student> mapStudentCheckNamesake = new HashMap<>(); // Мапа, в которой хранятся студенты для поиска однофамильцев
    private ArrayList<String> arrayListNamesake = new ArrayList<>(); // коллекция, в которой хранятся однофамильцы
    private ArrayList<Student> serchGmail = new ArrayList<>(); // тут храняться студенты, у которых почта gmail.
    private ArrayList<Student> studentsMTC = new ArrayList<>(); // тут студенты, у которых оператор связи МТС
    private ArrayList<Student> studentsMTC_andLife = new ArrayList<>(); // тут студенты, у которых оператор связи МТС или лайф
    private ArrayList<Student> studentsMTC_and_Kievstar = new ArrayList<>(); // тут студенты, у которых оператор связи МТС или киевстар

    private int studentCount = 0;
    private int lengthWordValues = 8;   // используем переменную для того, что бы отсечь ненужное из файла базы данных.
    private int endSetens = 2;          // используем для определения конца строки с нужной нам информацией из БД.

    @Override
    public int readScript() {
        try (BufferedReader br = new BufferedReader(new FileReader(INSERT_SCRIPT_FILE))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                String studentDataStr = sCurrentLine.substring(sCurrentLine.indexOf("VALUES") + lengthWordValues, sCurrentLine.length() - endSetens).replace("'", ""); // обрезаем все лишнее от строки, убираем знаки '.
                String[] studFieldMass = studentDataStr.split(","); // разбиваем эту строку на массив по запятой
                Student student = new Student(studFieldMass[0].trim(), studFieldMass[1].trim(), studFieldMass[2].trim(), studFieldMass[3].trim());// создаем студента из масива
                System.out.println(student.getName() + " " + student.getSerName() + " " + student.getPhone() + " " + student.getEmail());
                studentCount++;

                checkMobileOperator(student);
                checkNamesake(mapStudentCheckNamesake, student, arrayListNamesake);
                mapStudentCheckNamesake.put(student.getSerName(), student); // добавляем студента в мапу, если его еще нету

                if (student.getEmail().contains("gmail.com")) {
                    serchGmail.add(student);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("student count is " + studentCount);

        System.out.println("\nОднофамильцы: ");
        arrayListNamesake.forEach(s -> System.out.println(s)); // выводим однофамильцев

        System.out.println("\nСтуденты, у которых почта gmail.com: ");
        serchGmail.forEach(s -> System.out.println(s));

        System.out.println("\nСтуденты, у которых оператор связи МТС: ");
        studentsMTC.forEach(s-> System.out.println(s));
        System.out.println("\nСтуденты, у которых оператор связи МТС или Лайф: ");
        studentsMTC_andLife.forEach(s-> System.out.println(s));
        System.out.println("\nСтуденты, у которых оператор связи МТС или Киевстар: ");
        studentsMTC_and_Kievstar.forEach(s-> System.out.println(s));
        return studentCount;
    }

    private ArrayList<String> checkNamesake(Map<String, Student> mapStudentCheckNamesake, Student student, ArrayList<String> arrayListNamesake) {
        if (mapStudentCheckNamesake.containsKey(student.getSerName())) { // проверяем, есть ли такая фамилия в ключах
            if (!arrayListNamesake.contains(student.getSerName())) { //проверяем, если такой студент в коллекции однофамильцев, если нет, то добавляем его из мапы, как toString()
                arrayListNamesake.add(mapStudentCheckNamesake.get(student.getSerName()).toString());
            }
            arrayListNamesake.add(student.toString()); //и добавляем этого студента toString() в коллекцию со всеми однофамильцами
        }
        return arrayListNamesake; // возвращаем коллекцию однофамильцев
    }

    private void checkMobileOperator(Student student) {
        if(student.getPhone().matches("^\\+38(050|066|095|099).*")){
            studentsMTC.add(student);
        }
        if(student.getPhone().matches("^\\+38(050|066|095|099|063|093|073).*")){
            studentsMTC_andLife.add(student);
        }
        if(student.getPhone().matches("^\\+38(050|066|095|099|067|096|097|098|068).*")){
            studentsMTC_and_Kievstar.add(student);
        }
    }
}
