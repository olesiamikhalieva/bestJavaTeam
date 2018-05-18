package fileStorage;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MethodJournal {

    public static void addStudentInJournal() {
        String fileJournalDB = "Journal.txt";
        String fileStudDB = "StudDB.txt";
        ArrayList<String> stringStud = new ArrayList<>();
        ArrayList<String> stringJournal = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileStudDB))) { //читаем файл с студентами
            while (br.ready()) {
                stringStud.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader br = new BufferedReader(new FileReader(fileJournalDB))) { //читакем файл журнала
            while (br.ready()) {
                stringJournal.add(br.readLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileJournalDB))) {
            for (String s : stringStud) {                                               //заходим в массив студентов
                int indexStud = Integer.parseInt(s.substring(0, s.indexOf(" ")));        //забераем индекс текущего студента
                String oldDate = "";                                                    //сохраняем сюда старую дату, когда этот студент уже был на занятиях
                for (String st : stringJournal) {                                         // идем по журналу, что бы узнть когда какие студенты были на занятиех
                    int index = st.indexOf(" ");                                         //сохраняем индекс первого пробела, т.к после первого пробела идут даты
                    if ((Integer.parseInt(st.substring(0, st.indexOf(" ")))) == indexStud) {
                        oldDate = " " + st.substring(index + 1);                           //получили старую дату посещений
                        break;
                    }
                }
                oldDate.trim();
                bw.write(indexStud + oldDate + " " + currentDate()); //означает что студент по номером index был на занятиях currentDate() числа.
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String currentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return now.format(formatter);
    }

    public static String getStudentByIndex(int index) {

        String fileStudDB = "StudDB.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileStudDB))) {
            while (br.ready()) {
                String studString = br.readLine();
                int studIndex = Integer.parseInt(studString.substring(0, studString.indexOf(" ")));
                if (studIndex == index) {
                    return studString; //если студент с таким индексом найден то возвращаем его
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        return "Такого не найдено";
    }

    //возвразаем колекцию, так как могут быть однофамильцы
    public static ArrayList<String> getStudentByName(String name) {

        String fileStudDB = "StudDB.txt";
        ArrayList<String> searchStudent = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(fileStudDB))) {
            while (br.ready()) {
                String studString = br.readLine();
                if (studString.contains(name)) {
                    searchStudent.add(studString); // если студент найден то добавляем в коллекцию
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return searchStudent;
    }

    public static void addStudentInJournal(Student student) {

        String fileStudDB = "StudDB.txt";
        ArrayList<String> stringsStud = new ArrayList<>();
        int index = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileStudDB))) { //считываем тех студентов, которые уже есть
            while (br.ready()) {
                String str = br.readLine();
                stringsStud.add(str); //записываем их в коллекцию как строковое представление студентов(student.toString())
                index = Integer.parseInt(str.substring(0, str.indexOf(" ")));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        student.setId(++index);
        stringsStud.add(student.toString()); // добавляем студента в конец с соответствующим индексом (index)

        bufferWr(fileStudDB, stringsStud);
    }

    //посещение студентов
    public static String studentVisit(int i) {
        String fileStudDB = "StudDB.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fileStudDB))) {
            while (br.ready()) {
                String studString = br.readLine();
                int studIndex = Integer.parseInt(studString.substring(0, studString.indexOf(" ")));
                if (studIndex == i) {
                    return studString.substring(studString.indexOf(" ") + 1); //если студент с таким индексом найден то возвращаем его даты посещения
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return "Такого не найдено";
    }

    public static void addStudentsInJournalWithoutVisit(ArrayList<Student> students) {
        String fileStudDB = "StudDB.txt";
        String fileJourmalDB = "Journal.txt";
        ArrayList<String> stringStudDB = new ArrayList<>();
        int index = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileStudDB))) { //считываем тех студентов, которые уже есть
            while (br.ready()) {
                String str = br.readLine();
                stringStudDB.add(str);
                index = Integer.parseInt(str.substring(0, str.indexOf(" ")));
   //             System.out.println(index);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
// не получается добавить индекс в Journal

 //       System.out.println(index);
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileJourmalDB, true))) {
            for (Student stud : students) { //цикл, который присваивает индексы студентам, которых нужо добавить в БД
                stud.setId(++index);
                stringStudDB.add(stud.toString());// добавляем студента в конец с соответствующим индексом (index), он будет записан в studDb
                bw.write(index);
                bw.newLine();
//                System.out.println(index);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        bufferWr(fileStudDB, stringStudDB);

//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileJourmalDB))) {
//            for (Student s : students) {
//                bw.write(s.getId()); // записываем в Journal index новых студентов без добавления даты посещения
//                bw.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }

    public static void addStudentsInJournalWithoutVisit(Student student) {

    }

    //записывает в указанный файл
    public static void bufferWr(String path, ArrayList<String> stringsStud) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path))) {
            for (String s : stringsStud) {
                bw.write(s); // записываем в БД новых студентов
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
