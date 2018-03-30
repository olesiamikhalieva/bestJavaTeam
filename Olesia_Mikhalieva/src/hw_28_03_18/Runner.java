package hw_28_03_18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Runner {
    public static void main(String[] args) throws IOException {
        File work = new File("D:\\Java\\Project\\HW1\\", "work");
        File error = new File("D:\\Java\\Project\\HW1\\", "error");
        File done = new File("D:\\Java\\Project\\HW1\\", "done");
        boolean createWork = work.mkdir();
        boolean createError = error.mkdir();
        boolean createDone = done.mkdir();
        if (createWork && createError && createDone) {
            System.out.println("Folders are made.");
        }
        isFilesInFolders(error, work);
        isFilesInFolders(done, work);

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
        writeFiles(file1, linesStih[0]);
        writeFiles(file2, linesStih[1]);
        writeFiles(file3, linesStih[2]);

        File[] files = work.listFiles();
        changeFile(files[0]);
        for (int i = 0; i < files.length; i++) {
            try (BufferedReader reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream(files[i]), StandardCharsets.UTF_8))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(" ")) {
                        File newFile = new File(done, files[i].getName());
                        Path from = Paths.get(files[i].getPath());
                        Path to = Paths.get(newFile.getPath());
                        Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
                        break;
                    } else {
                        File newFile = new File(error, files[i].getName());
                        Path from = Paths.get(files[i].getPath());
                        Path to = Paths.get(newFile.getPath());
                        Files.move(from, to, StandardCopyOption.REPLACE_EXISTING);
                        break;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }

    private static void changeFile(File file) {
        String line = "";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(file), StandardCharsets.UTF_8))) {
            while ((line = reader.readLine()) != null) {
                line = line.replaceAll(" ", "");
                break;
            }
        } catch (IOException e) {
        }
        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(line);
            writer.flush();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }


    private static void writeFiles(File file, String text) throws IOException {
        FileWriter writer = new FileWriter(file, false);
        writer.write(text);
        writer.flush();
        writer.close();
    }

    private static void isFilesInFolders(File fromFolder, File toFolder) {
        File[] listOfFilesError = fromFolder.listFiles();
        for (int i = 0; i < listOfFilesError.length; i++) {
            if (listOfFilesError[i].isFile()) {
                listOfFilesError[i].renameTo(new File(toFolder, listOfFilesError[i].getName()));
            }
        }
    }

}

