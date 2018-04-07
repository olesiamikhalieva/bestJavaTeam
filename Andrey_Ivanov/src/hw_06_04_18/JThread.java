package hw_06_04_18;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class JThread extends Thread {

    private File file1 = new File("D:\\HW_06_04_18\\", "notes1.txt");
    private File file2 = new File("D:\\HW_06_04_18\\", "notes2.txt");
    private File file3 = new File("D:\\HW_06_04_18\\", "notes3.txt");
    private File file4 = new File("D:\\HW_06_04_18\\", "notes4.txt");
    private File file5 = new File("D:\\HW_06_04_18\\", "notes5.txt");
    private String s;
    private String url1 = "https://www.marketwatch.com/investing/stock/amzn";
    private String url2 = "https://www.marketwatch.com/investing/stock/aapl";
    private String url3 = "https://google.com.ua";
    private String url4 = "https://gmail.com";
    private String url5 = "https://facebook.com";

    HashMap<Character, String> hashmap = new LinkedHashMap<>();

    public JThread() {
    }

    public HashMap<Character, String> getHashmap() {
        return hashmap;
    }

    public void setHashmap(HashMap<Character, String> hashmap) {
        this.hashmap = hashmap;
    }

    public JThread(String name) {
        super(name);
    }

    @Override
    public void run() {

        if (Thread.currentThread().getName().equals("JThread 1")) {
            System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
            try {
                file1.createNewFile();
                readFromWeb(url1);
                writeToFile(file1);
                s = "";
                writeToMap(file1);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
        }
        if (Thread.currentThread().getName().equals("JThread 2")) {
            System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
            try {
                file2.createNewFile();
                readFromWeb(url2);
                writeToFile(file2);
                s = "";
                writeToMap(file2);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
        }
        if (Thread.currentThread().getName().equals("JThread 3")) {
            System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
            try {
                file3.createNewFile();
                readFromWeb(url3);
                writeToFile(file3);
                s = "";
                writeToMap(file3);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
        }
        if (Thread.currentThread().getName().equals("JThread 4")) {
            System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
            try {
                file4.createNewFile();
                readFromWeb(url4);
                writeToFile(file4);
                s = "";
                writeToMap(file4);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
        }
        if (Thread.currentThread().getName().equals("JThread 5")) {
            System.out.printf("Поток %s начал работу... \n", Thread.currentThread().getName());
            try {
                file5.createNewFile();
                readFromWeb(url5);
                writeToFile(file5);
                s = "";
                writeToMap(file5);
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.printf("Поток %s завершил работу... \n", Thread.currentThread().getName());
        }
        //printMap();
    }

    public void readFromWeb(String url) throws IOException {
        System.out.println("Прочитал из " + url);
        InputStream in = new URL(url).openStream();
        try {
            InputStreamReader inR = new InputStreamReader(in);
            BufferedReader buf = new BufferedReader(inR);
            String line;
            while ((line = buf.readLine()) != null) {
                s += line;
            }
        } finally {
            in.close();
        }
    }

    public void writeToFile(File file) throws IOException {
        System.out.println("Записал в файл" + " " + file.getName());
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(s);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public void writeToMap(File file) throws IOException {
        System.out.println("Прочитал из файла "+file.getName()+" и записал в коллекцию.");
        int count = 0;
        LocalDateTime time = LocalDateTime.now();
        FileInputStream fis = new FileInputStream(file);
        int i = 0;
        while ((i = fis.read()) != -1) {
            if ((char) i != ' ') {
                hashmap.put((char) i, time.get(ChronoField.HOUR_OF_DAY) + "." + time.get(ChronoField.MINUTE_OF_HOUR) + "." + time.get(ChronoField.SECOND_OF_MINUTE) + "." + time.get(ChronoField.MILLI_OF_SECOND));
            }
        }
    }

    public void printMap() {
        System.out.println("Размер MAP="+hashmap.size());
        System.out.println("Вывод всей коллекции:");
        hashmap.forEach((K,V)-> System.out.println(K+"-"+V));;

    }
}


