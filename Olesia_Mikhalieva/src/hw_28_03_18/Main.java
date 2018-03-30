package hw_28_03_18;

import java.io.File;
import java.io.IOException;

public class Main {


    public static void main(String[] args) throws IOException {
        File work = new File("D:\\Java\\Project\\HW1\\", "work");
        File error = new File("D:\\Java\\Project\\HW1\\", "error");
        File done = new File("D:\\Java\\Project\\HW1\\", "done");
        Task_1 task_1 = new Task_1();
        Task_2 task_2 = new Task_2();
        Task_3 task_3 = new Task_3();
        task_1.newFolders(work, error, done);
        task_2.newFiles(work);
        task_3.replaceFiles(work,done,error);

    }
}
