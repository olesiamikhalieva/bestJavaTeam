package hw_28_03_18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


public class Task_3 {

    public void replaceFiles(File work, File done, File error) {

        File[] files = work.listFiles();
        changeFile(files[0]);
        for (int i = 0; i < files.length; i++) {
            try (BufferedReader reader = new BufferedReader(
                    new FileReader(files[i]))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    if (line.contains(" ")) {
                        File newFile = new File(done, files[i].getName());
                        Path from = Paths.get(files[i].getPath());
                        Path to = Paths.get(newFile.getPath());
                        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
                        break;
                    } else {
                        File newFile = new File(error, files[i].getName());
                        Path from = Paths.get(files[i].getPath());
                        Path to = Paths.get(newFile.getPath());
                        Files.copy(from, to, StandardCopyOption.REPLACE_EXISTING);
                        break;
                    }
                }
            } catch (IOException e) {
               e.printStackTrace();
            }
            files[i].delete();

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

}
