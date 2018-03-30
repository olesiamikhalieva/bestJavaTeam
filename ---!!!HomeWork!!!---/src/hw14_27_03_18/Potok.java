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
public class Potok {
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

        File workdir = new File("---!!!HomeWork!!!---/src/hw14_27_03_18/work");
        workdir.mkdir();
        File donedir = new File("---!!!HomeWork!!!---/src/hw14_27_03_18/done");
        donedir.mkdir();
        File errordir = new File("---!!!HomeWork!!!---/src/hw14_27_03_18/error");
        errordir.mkdir();

        File workf = new File("---!!!HomeWork!!!---/src/hw14_27_03_18/work/work.txt");
        workf.createNewFile();
        File donef = new File("---!!!HomeWork!!!---/src/hw14_27_03_18/done/done.txt");
        donef.createNewFile();
        File errorf = new File("---!!!HomeWork!!!---/src/hw14_27_03_18/error/error.txt");
        errorf.createNewFile();

        File[] strings = donedir.listFiles();

        System.out.println(strings[0].renameTo(new File(String.valueOf(donedir))));

        Files.move(donef, workf, ATOMIC_MOVE)

    }
}
