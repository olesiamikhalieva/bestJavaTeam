package hw_08_04_18.Task_3;

import java.io.*;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Map;


public class createThread implements Runnable {


    public static String site;
    public static File file;
    public static Map<Character,String> map= new HashMap<>();

    public createThread(File file, String site) {
        this.file = file;
        this.site = site;
    }


    @Override
    public void run() {
        try {
            writeFiles(readSite(site), file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        writeToMap(file);
    }


    public synchronized void writeFiles(String s, File file) {
        System.out.println("I am write in new " + file.getName());
        try (FileWriter writer = new FileWriter(file, false)) {
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


    public static String readSite(String site) throws IOException {
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

    private static void writeToMap(File file){
        LocalDateTime timeWriteToMap = LocalDateTime.now();
        try(FileReader reader = new FileReader(file))
        {
            // читаем посимвольно
            int c;
            while((c=reader.read())!=-1){
                map.put(((char)c),timeWriteToMap.get(ChronoField.HOUR_OF_DAY) + "." + timeWriteToMap.get(ChronoField.MINUTE_OF_HOUR) + "." + timeWriteToMap.get(ChronoField.SECOND_OF_MINUTE) + "." + timeWriteToMap.get(ChronoField.MILLI_OF_SECOND));
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

