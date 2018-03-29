package hw_28_03_18;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Task_2 {
    public void newFiles(File work) throws IOException {
        File file1 = new File(work, "file_1.txt");
        File file2 = new File(work, "file_2.txt");
        File file3 = new File(work, "file_3.txt");
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();
        String stih = "У лукоморья дуб зелёный;\n" +
                "Златая цепь на дубе том:\n" +
                "И днём и ночью кот учёный\n" +
                "Всё ходит по цепи кругом;\n" +
                "Идёт направо - песнь заводит,\n" +
                "Налево - сказку говорит.";
        String[] linesStih = stih.split("\n");
        writeFiles(file1,linesStih[0]);
        writeFiles(file2,linesStih[1]);
        writeFiles(file3,linesStih[2]);
    }

    private static void writeFiles(File file, String text) throws IOException {
        FileWriter writer = new FileWriter(file, false);
        writer.write(text);
        writer.flush();
    }
}
