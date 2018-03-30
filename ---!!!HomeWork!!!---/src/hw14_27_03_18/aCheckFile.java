package hw14_27_03_18;

import sun.text.normalizer.ReplaceableUCharacterIterator;

import java.io.File;
import java.io.*;
import java.nio.file.*;

import static java.nio.file.StandardCopyOption.ATOMIC_MOVE;
import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

/**
 * Created by java on 27.03.2018.
 */
public class aCheckFile {
    public static File workdir = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//work");
    public static File donedir = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//done");
    public static File errordir = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//error");
    public static File workf = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//work//work.txt");
    public static File donef = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//done//done.txt");
    public static File errorf = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//error//error.txt");

    public static void main(String[] args) throws IOException {

        workdir.mkdir();
        donedir.mkdir();
        errordir.mkdir();
        workf.createNewFile();
        donef.createNewFile();
        errorf.createNewFile();

        for (File file : donedir.listFiles()) {
            remaneFile(file);
        }

        for (File file : errordir.listFiles()) {
           remaneFile(file);
        }

    }
    public static void remaneFile(File file)throws IOException{
        if (!file.renameTo(new File(workdir + "//" + file.getName()))){
            BufferedReader br = new BufferedReader(new FileReader(file));
            BufferedWriter bw = new BufferedWriter(new FileWriter(new File(workdir + "//" + file.getName()),true));

            while (br.ready()){
                bw.write(br.readLine()+"\n");
            }

            br.close();
            bw.close();
            file.delete();
        }
    }
}
