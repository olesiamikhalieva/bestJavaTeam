package hw_08_04_18.WhiteFile;

import java.io.*;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class newThread extends Thread {
    File file;
    String site;
    private static String s = "";

    public newThread(File file, String site) {
        this.file = file;
        this.site = site;
    }

    @Override
    public void run() {
        LocalDateTime startTime = LocalDateTime.now();
        try {
            readSite(site);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("I am write in new " + file.getName());
        writeFile();
        LocalDateTime finishTime = LocalDateTime.now();

        System.out.println(startTime.get(ChronoField.MILLI_OF_SECOND) + " start write " + file.getName());
        System.out.println(finishTime.get(ChronoField.MILLI_OF_SECOND) + " finish write " + file.getName());
    }

    private void writeFile() {
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

    private static String readSite(String site) throws IOException {
        InputStream in = new URL(site).openStream();
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
}
