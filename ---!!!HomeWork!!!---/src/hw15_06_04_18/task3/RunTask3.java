package hw15_06_04_18.task3;

import java.io.*;
import java.net.URL;

public class RunTask3 {
    public static void main(String[] args) throws IOException {

        File file = new File("---!!!HomeWork!!!---/src/hw15_06_04_18/task3/file.txt");
        System.out.println(file.createNewFile());

        InputStream inputStream = new URL("https://icpc.baylor.edu/login").openStream();
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file.getParent() + "/" + file.getName()));

        try {

            StringBuilder str = new StringBuilder("");
            while ((str.append((char) bufferedInputStream.read()) != null)) {
            }
            bufferedWriter.write(String.valueOf(str));

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            bufferedInputStream.close();
            bufferedWriter.close();
        }
    }
}
