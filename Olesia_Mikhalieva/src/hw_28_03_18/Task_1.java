package hw_28_03_18;

import java.io.File;
import java.io.IOException;

public class Task_1 {

    public void newFolders(File work, File error,File done) throws IOException {
        boolean createWork = work.mkdir();
        boolean createError = error.mkdir();
        boolean createDone = done.mkdir();
        if (createWork && createError && createDone) {
            System.out.println("Folders are made.");
        }
        isFilesInFolders(error, work);
        isFilesInFolders(done, work);
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
