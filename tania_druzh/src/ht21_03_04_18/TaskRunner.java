package ht21_03_04_18;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by java on 13.04.2018.
 */
public class TaskRunner {

    public static File file1;
    public static File file2;
    public static File file3;
    public static File file4;
    public static File file5;

    public static void main(String[] args) throws IOException {
        String workDir = "D:\\_aJavaBestTeam\\project\\untitled2\\student_home_works\\tania_druzh\\src\\ht21_03_04_18";
        file1 = new File(workDir,"text1.txt");
        file2 = new File(workDir,"text2.txt");
        file3 = new File(workDir,"text3.txt");
        file4 = new File(workDir,"text4.txt");
        file5 = new File(workDir,"text5.txt");
        String s = readerURL("https://www.marketwatch.com/investing/stock/amzn");
        createFiles(file1, s);
    }

    synchronized public static void createFiles(File file, String str){
        try(FileOutputStream fos=new FileOutputStream(file))
        {
            // перевод строки в байты
            byte[] buffer = str.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }

    public static String readerURL(String url) throws IOException {
        InputStream in = new URL(url).openStream();
        String s = "";
        try {
            InputStreamReader inR = new InputStreamReader(in);
            BufferedReader buf = new BufferedReader(inR);
            String line;
            while ((line = buf.readLine()) != null) {
                s += line;
//                System.out.println(line);
            }
        } finally {
            in.close();
        }

//        System.out.println(s);
        return s;
    }
}
