package hw14_27_03_18;

import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

import static hw14_27_03_18.aCheckFile.*;

public class checkCorrectText {
    public static void main(String[] args) throws Exception {
        File file = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//work");
        File[] files = file.listFiles();

        for (File f : files) {

            BufferedReader br = new BufferedReader(new FileReader(f));
            String str = br.readLine();
            br.close();
            if (str.contains(" ") == true){
                f.renameTo(new File(donedir + "//" + f.getName()));
            }else{
                f.renameTo(new File(errordir + "//" + f.getName()));
            }
        }
    }
}
