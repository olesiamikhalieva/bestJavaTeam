package les_27_03_18;

import java.io.File;
import java.io.*;

/**
 * Created by java on 27.03.2018.
 */
public class Potok {
    public static void main(String[] args) throws IOException {

        File work = new File("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\work");
        work.mkdir();
        File done = new File("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\done");
        done.mkdir();
        File error = new File("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\error");
        error.mkdir();

        FileWriter txt1 = new FileWriter("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\work\\1.txt");
        FileWriter txt2 = new FileWriter("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\done\\2.txt");
        FileWriter txt3 = new FileWriter("D:\\_aJavaBest Team\\Project\\student_home_works\\0Lessons\\src\\les_27_03_18\\error\\3.txt");

        for (File file : done.listFiles()) {
            if (file.isFile()) {
                System.out.println(file.renameTo(new File("D:/_aJavaBest Team/Project/student_home_works/0Lessons/src/les_27_03_18/work", file.getName())));
            }
        }
    }
}
