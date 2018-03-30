package hw14_27_03_18;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class checkCorrectText {
    public static void main(String[] args) throws Exception {
        File file = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//work");
        File[] files = file.listFiles();
//
//        BufferedReader br = new BufferedReader(new FileReader(files[2]));
//        if (!br.readLine().contains(" ")) {
//            files[2].renameTo(new File("---!!!HomeWork!!!---//src//hw14_27_03_18//error//" + files[2].getName()));
//        } else {
//            files[2].renameTo(new File("---!!!HomeWork!!!---//src//hw14_27_03_18//done//" + files[2].getName()));
//        }
//        br.close();
    }
}
