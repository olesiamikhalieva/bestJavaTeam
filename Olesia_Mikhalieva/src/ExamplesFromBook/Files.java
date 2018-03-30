package ExamplesFromBook;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class Files {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\Java\\Project\\HW\\", "file.txt" );
        file.createNewFile();
        File folder = new File("D:\\Java\\Project\\HW\\", "folder");
        folder.mkdir();
        //file.renameTo(new File(folder, file.getName()));
        java.nio.file.Files.move(file.toPath(), folder.toPath(),StandardCopyOption.REPLACE_EXISTING );

    }
}
