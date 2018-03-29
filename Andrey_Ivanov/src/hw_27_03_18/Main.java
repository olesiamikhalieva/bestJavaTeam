package hw_27_03_18;

import java.io.*;
import java.nio.file.*;

import static javafx.scene.input.KeyCode.R;

public class Main {

    static String str1 = "";//хранит строку считанную из первого файла
    static String str2 = "";//хранит строку считанную из второго файла
    static String str3 = "";//хранит строку считанную из третего файла

    public static File dirWork;
    public static File dirError;
    public static File dirDone;

    public static File file1;
    public static File file2;
    public static File file3;


    public static void main(String[] args) throws IOException {

        createFolders();             //метод для создания папок
        checkFolders();              //проверяем на наличие файлов в папках Done и Error
        writingStringsToFiles();    //создаём в папке "D:/HW_27_03_18/Work" три файла и записывем в них строки из стиха
        readLinesFromFiles();       //cчитываем строки из файлов
        checkForSpace();            //проверяем наличие пробелы в считанных строках из файлов


    }

    public static void createFolders() {
        dirWork = new File("D:/HW_27_03_18/Work/");
        dirWork.mkdirs();
        dirDone = new File("D:/HW_27_03_18/Done");
        dirDone.mkdirs();
        dirError = new File("D:/HW_27_03_18/Error");
        dirError.mkdirs();
    }

    public static void checkFolders() throws IOException {
        if (dirError.isDirectory()) {
            for (File file : dirError.listFiles()) {
                moveFile(file, dirWork);
            }
        }
        if (dirDone.isDirectory()) {
            for (File file : dirDone.listFiles()) {
                moveFile(file, dirWork);
            }
        }
    }

    public static void writingStringsToFiles() throws IOException {

        String str = "Довольно изучать, \n" +
                "давайте излучать, \n" +
                "измучившись от внутреннего жара, \n" +
                "друг другу свет передавать, \n" +
                "а не туман клубящегося пара.";
        // созданеи файлов
        file1 = new File(dirWork, "1.txt");
        file2 = new File(dirWork, "2.txt");
        file3 = new File(dirWork, "3.txt");

        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        //запсиь текста в файлы
        FileOutputStream f1 = new FileOutputStream(file1);
        FileOutputStream f2 = new FileOutputStream(file2);
        FileOutputStream f3 = new FileOutputStream(file3);


        byte[] buffer1 = (str.substring(0, str.indexOf(','))).replaceAll("\\s+", "").getBytes();
        f1.write(buffer1, 0, buffer1.length);

        byte[] buffer2 = (str.substring(19, 36)).getBytes();
        f2.write(buffer2, 0, buffer2.length);

        byte[] buffer3 = (str.substring(38, 70)).getBytes();
        f3.write(buffer3, 0, buffer3.length);

    }

    public static void readLinesFromFiles() {
        int a = 0;
        int b = 0;
        int c = 0;

        try (FileInputStream st1 = new FileInputStream(file1);
             InputStreamReader sst1 = new InputStreamReader(st1);//для русского языка

             FileInputStream st2 = new FileInputStream(file2);
             InputStreamReader sst2 = new InputStreamReader(st2);//для русского языка

             FileInputStream st3 = new FileInputStream(file3);
             InputStreamReader sst3 = new InputStreamReader(st3)) {
            {
                while ((a = sst1.read()) != -1) {
                    //System.out.print((char) a);
                    str1 += (char) a;
                }
                while ((b = sst2.read()) != -1) {
                    //System.out.print((char) b);
                    str2 += (char) b;
                }
                System.out.println();
                while ((c = sst3.read()) != -1) {
                    //System.out.print((char) c);
                    str3 += (char) c;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Запись в первом файле:" + str1);
        System.out.println("Запись во втором файле:" + str2);
        System.out.println("Запись в третем файле:" + str3);
    }

    public static void checkForSpace() throws IOException {
        if (!str1.contains(" ")) {
            moveFile(file1, dirError);
        } else {
            moveFile(file1, dirDone);
        }
        if (!str2.contains(" ")) {
            moveFile(file2, dirError);
        } else {
            moveFile(file2, dirDone);
        }
        if (!str3.contains(" ")) {
            moveFile(file3, dirError);
        } else {
            moveFile(file3, dirDone);
        }
    }

    public static void moveFile(File from, File to) throws IOException {

        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(from);
            os = new FileOutputStream(new File(to, from.getName()));
            byte[] buffer = new byte[1024];
            int a;
            while ((a = is.read(buffer)) > 0) {
                os.write(buffer, 0, a);
            }
        } finally {
            is.close();
            os.close();
            if (from.delete()) {
                System.out.println("файл был перенесён");
            } else System.out.println("Файл не был перенесён");
        }
    }
}





