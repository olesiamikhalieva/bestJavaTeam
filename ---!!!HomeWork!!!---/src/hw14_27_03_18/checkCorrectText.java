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
//            BufferedReader br = new BufferedReader(new FileReader(f));
//            if (br.readLine().contains(" ") == true) {
//                BufferedWriter bw = new BufferedWriter(new FileWriter(new File(donedir + "//" + f.getName())));
//                bw.write(br.readLine());
//            }else{
//                BufferedWriter bw = new BufferedWriter(new FileWriter(new File(errordir + "//" + f.getName())));
//                bw.write(br.readLine());
//            }

//            Files.move(f.toPath(),new File(donedir + "//" + f.getName()).toPath());

            BufferedReader br = new BufferedReader(new FileReader(f));
            if (br.readLine().contains(" ")){
                f.renameTo(new File(donedir + "//" + f.getName()));
            }else {
                f.renameTo(new File(errordir + "//" + f.getName()));
            }
            br.close();
        }
    }
}
