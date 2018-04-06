package practice;

import java.io.*;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;


public class writeFile {

    public static void main(String[] args) throws IOException {
        InputStream in = new URL("https://www.marketwatch.com/investing/stock/amzn").openStream();
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

        LocalDateTime startTime = LocalDateTime.now();

        System.out.println("I am write in new file1");
        File file1 = new File("D://javaThreadFile", "notes1.txt");
        file1.createNewFile();
        try(FileWriter writer = new FileWriter("D:\\javaThreadFile\\notes1.txt", false))
        {
            int sum =0;
            for (int i =0; i<10000000;i++){
                sum+= i;
            }
            // запись всей строки
            writer.write(s);
            // запись по символам
            writer.append('\n');
            writer.append('E');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        LocalDateTime finishTime = LocalDateTime.now();
        System.out.println(startTime.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(finishTime.get(ChronoField.MILLI_OF_SECOND));


        System.out.println("I am write new file2");
        LocalDateTime startTime2 = LocalDateTime.now();
        File file2 = new File("D://javaThreadFile", "notes2.txt");
        file2.createNewFile();
        try(FileWriter writer = new FileWriter("D:\\javaThreadFile\\notes2.txt", false))
        {
            int sum =0;
            for (int i =0; i<1000000;i++){
                sum+= i;
            }
            // запись всей строки
            writer.write(s);
            // запись по символам
            writer.append('\n');
            writer.append('E');
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        LocalDateTime finishTime2 = LocalDateTime.now();

        System.out.println(startTime2.get(ChronoField.MILLI_OF_SECOND));
        System.out.println(finishTime2.get(ChronoField.MILLI_OF_SECOND));




    }
}

