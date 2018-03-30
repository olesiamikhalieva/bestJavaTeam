package hw14_27_03_18;

import java.io.*;

public class bCreateThreeFile {
    static File file1 = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//work//1.txt");
    static File file2 = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//work//2.txt");
    static File file3 = new File("---!!!HomeWork!!!---//src//hw14_27_03_18//work//3.txt");

    public static void main(String[] args) throws IOException {
        file1.createNewFile();
        file2.createNewFile();
        file3.createNewFile();

        String str = "В небе такая луна,\n" +
                "Словно дерево спилено под корень:\n" +
                "Белеетсвежийсрез.";

        String[] strings = new String[3];
        strings = str.split("\n");

        for (int i = 0; i < strings.length; i++) {
            switch (i) {
                case 0:
                    BufferedWriter bw = new BufferedWriter(new FileWriter(file1));
                    bw.write(strings[i]);
                    bw.close();
                    break;
                case 1:
                    BufferedWriter bw2 = new BufferedWriter(new FileWriter(file2));
                    bw2.write(strings[i]);
                    bw2.close();
                    break;
                case 2:
                    BufferedWriter bw3 = new BufferedWriter(new FileWriter(file3));
                    bw3.write(strings[i]);
                    bw3.close();
                    break;
            }
        }
    }
}
