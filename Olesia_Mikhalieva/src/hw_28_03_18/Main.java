package hw_28_03_18;

import java.io.File;
import java.io.IOException;

public class Main {
    private static File work = new File("D:\\Java\\Project\\HW1\\", "work");
    private static File error = new File("D:\\Java\\Project\\HW1\\", "error");
    private static File done = new File("D:\\Java\\Project\\HW1\\", "done");

    public static void main(String[] args) throws IOException {
        Task_1 task_1 = new Task_1();
        Task_2 task_2 = new Task_2();
        Task_3 task_3 = new Task_3();
        task_1.newFolders(work, error, done);
        task_2.newFiles(work);
        task_3.replaceFiles(work,done,error);

    }
}
