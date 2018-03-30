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
    static File workdir = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//work");
    static File donedir = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//done");
    static File errordir = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//error");
    static File workf = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//work//work.txt");
    static File donef = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//done//done.txt");
    static File errorf = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//error//error.txt");
    public static void main(String[] args) throws IOException {

//        File work = new File("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\work");
//        work.mkdir();
//        File done = new File("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\done");
//        done.mkdir();
//        File error = new File("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\error");
//        error.mkdir();
//
//        FileWriter txt1 = new FileWriter("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\work\\1.txt");
//        FileWriter txt2 = new FileWriter("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\done\\2.txt");
//        FileWriter txt3 = new FileWriter("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\error\\3.txt");
//
//        for (File file : done.listFiles()) {
//            if (file.isFile()) {
//                System.out.println(file.renameTo(new File("D:/_aJavaBest Team/Project/student_home_works/0Lessons/src/les_27_03_18/work", file.getName())));
//            }
//        }
//
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
