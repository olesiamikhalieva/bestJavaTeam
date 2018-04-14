package hw15_06_04_18.task3;

import javafx.util.converter.DateStringConverter;

import java.io.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;

public class RunTask3 {
    public static void main(String[] args) throws IOException, InterruptedException {

//
//        String filePath = "---!!!HomeWork!!!---/src/hw15_06_04_18/task3/";
//
//        StringBuilder str = new StringBuilder("");
//        InputStream inputStream = new URL("https://icpc.baylor.edu/login").openStream();//открыли поток для чтения из веба
//        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
//
//
//        try {
//            int i;
//            while ((i = bufferedInputStream.read()) != -1) {
//                str.append((char) i); // записали инфу из веба в переменную
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        } finally {
//            bufferedInputStream.close();
//        }
//        int x = 0;
//        char[] strMass = new char[str.length()]; // массив, который будет хранить строку из веба
//        str.getChars(0, str.length(), strMass, 0); //поместили строку в мссив
//        System.out.println(str.length());
//        System.out.println(strMass.length);
//        for (int i = 0; i < 5; i++) {
//            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(filePath, "file" + i + ".txt")));
//            bufferedWriter.write(strMass, x, strMass.length / 4);
//            x += strMass.length / 4;
//            bufferedWriter.close();
//        }
        new WEBThread("https://icpc.baylor.edu/login", "---!!!HomeWork!!!---/src/hw15_06_04_18/task3/file1.txt", "Поток 1").start();
        new WEBThread("https://www.google.com.ua/", "---!!!HomeWork!!!---/src/hw15_06_04_18/task3/file2.txt", "Поток 2").start();
        new WEBThread("http://labmeb.com.ua/", "---!!!HomeWork!!!---/src/hw15_06_04_18/task3/file3.txt", "Поток 3").start();
        new WEBThread("https://zoon.com.ua/dp/business/salon-magazin_laboratoriya_mebeli_v_novomoskovske/", "---!!!HomeWork!!!---/src/hw15_06_04_18/task3/file4.txt", "Поток 4").start();
        new WEBThread("http://www.mebelminsk.by/companies/laboratoriya-mebeli", "---!!!HomeWork!!!---/src/hw15_06_04_18/task3/file5.txt", "Поток 5").start();

        Thread.sleep(3500);//остановим поток main, что бы потоки успели создать файлы.

        readFileAndWriteMap();

    }

    public static void readFileAndWriteMap() throws IOException {
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss:SSS");

        HashMap<String, String> hashMap = new HashMap<>();
        BufferedReader bufferedReader = new BufferedReader(new FileReader("---!!!HomeWork!!!---/src/hw15_06_04_18/task3/file1.txt")); // считываем с файла, который создался потоком

        int i = 0;
        while (bufferedReader.ready()) {
            hashMap.put("номер " + i++ + " символ -> " + '\'' + String.valueOf((char) bufferedReader.read()) + '\'', simpleDateFormat.format(date)); // записываем в отображение символ и время появления
        }
        bufferedReader.close();

        hashMap.forEach((k,v) -> System.out.println(k + " ---" + v));
        System.out.println(hashMap.size());
    }
}
