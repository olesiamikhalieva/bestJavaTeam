package hw15_06_04_18.task3;

import java.io.*;
import java.net.URL;

public class WEBThread extends Thread {
    String address;
    String nameFile;
    String nameThread;

    public WEBThread(String address, String nameFile, String nameThread) { // передаем через конструктор ссылку, с которой нужно считать и файл, куда нужно записть.
        this.address = address;
        this.nameFile = nameFile;
        this.nameThread = nameThread;
    }

    @Override
    public void run() {
        try {
            StringBuilder strBuild = new StringBuilder();
            InputStream inputStream = new URL(address).openStream(); //считывает с сайта
            System.out.println(nameThread + " открыл поток");
            int i;
            while ((i = inputStream.read()) != -1){
                strBuild.append((char)i); // записываем в переменную
            }
            inputStream.close();
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(nameFile));
            bufferedWriter.write(String.valueOf(strBuild)); // записываем напосредственно в файл
            System.out.println(nameThread + " записал в файл");
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
