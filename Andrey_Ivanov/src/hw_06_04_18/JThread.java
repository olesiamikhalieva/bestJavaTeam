package hw_06_04_18;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class JThread extends Thread {

     String s;
     File file;

    @Override
    public void run() {
        try {
            readFromWeb();
            writeToFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void readFromWeb() throws IOException {
        InputStream in = new URL("https://www.marketwatch.com/investing/stock/amzn").openStream();

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
        //System.out.println(s);

    }

    public void writeToFile() throws IOException {
        System.out.println("I am write in new file1");
        File file1 = new File("D:\\HW_06_04_18\\", "notes1.txt");
        file1.createNewFile();

        try(FileWriter writer = new FileWriter("D:\\HW_06_04_18\\notes1.txt", false))
        {
            // запись всей строки
            writer.write(s);
            // запись по символам
           // writer.append('\n');
           // writer.append('E');
           // writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

    }
}


