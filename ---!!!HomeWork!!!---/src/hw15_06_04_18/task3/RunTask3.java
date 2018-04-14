package hw15_06_04_18.task3;

import java.io.*;
import java.lang.reflect.Array;
import java.net.URL;
import java.util.Arrays;

public class RunTask3 {
    public static void main(String[] args) throws IOException {


        String filePath = "---!!!HomeWork!!!---/src/hw15_06_04_18/task3/";

        StringBuilder str = new StringBuilder("");
        InputStream inputStream = new URL("https://icpc.baylor.edu/login").openStream();//открыли поток для чтения из веба
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);


        try {
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                str.append((char) i); // записали инфу из веба в переменную
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            bufferedInputStream.close();
        }

        char[] strMass = new char[str.length()]; // массив, который будет хранить строку из веба
        str.getChars(0,str.length(),strMass,0); //поместили строку в мссив
        System.out.println(str.length());
        System.out.println(strMass.length);
        for (int i = 0; i < 5; i++) {
            File file = new File(filePath, "file" + i + ".txt");
            System.out.println(file.createNewFile());

            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (int j = 0; j < strMass.length / 5; j++) {
                bufferedWriter.write(strMass[j]);
            }
        }
    }
}
