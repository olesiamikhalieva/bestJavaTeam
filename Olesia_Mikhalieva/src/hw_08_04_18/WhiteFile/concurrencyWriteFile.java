package hw_08_04_18.WhiteFile;

import hw_08_04_18.WhiteFile.newThread;

import java.io.*;

public class concurrencyWriteFile {

    private static String s = "";
    private static String site = "https://www.marketwatch.com/investing/stock/amzn";
    public static void main(String[] args) throws IOException {


        File file1 = new File("D://Java//", "notes1.txt");
        file1.createNewFile();
        newThread oneThread = new newThread(file1, site);
        oneThread.start();



        File file2 = new File("D://Java//", "notes2.txt");
        file1.createNewFile();
        newThread twoThread = new newThread(file2, site);
        twoThread.start();
    }
}


