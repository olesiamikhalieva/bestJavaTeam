package hw_08_04_18.WhiteFile;

import java.io.*;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;


public class WriteFile {

    public static void main(String[] args) throws IOException {
        String site = "https://www.marketwatch.com/investing/stock/amzn";
        LocalDateTime startTime = LocalDateTime.now();
        File file1 = new File("D://Java//", "notes1.txt");
        file1.createNewFile();
        writeFile(file1, readSite(site));
        LocalDateTime finishTime = LocalDateTime.now();

        System.out.println(startTime.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(finishTime.get(ChronoField.MILLI_OF_SECOND));


        LocalDateTime startTime2 = LocalDateTime.now();
        File file2 = new File("D://Java//", "notes2.txt");
        file2.createNewFile();
        writeFile(file2,readSite(site));
        LocalDateTime finishTime2 = LocalDateTime.now();

        System.out.println(startTime2.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(finishTime2.get(ChronoField.MILLI_OF_SECOND));
    }

    private static String readSite(String site) throws IOException {
        InputStream in = new URL(site).openStream();
        String s = "";
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
        return s;
    }

    private static void writeFile(File file, String s) {
        System.out.println("I am write in new "+file.getName());
        try (FileWriter writer = new FileWriter(file, false)) {
            int sum = 0;
            for (int i = 0; i < 10000000; i++) {
                sum += i;
            }
            // запись всей строки
            writer.write(s);
            // запись по символам
            writer.append('\n');
            writer.append('E');
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

