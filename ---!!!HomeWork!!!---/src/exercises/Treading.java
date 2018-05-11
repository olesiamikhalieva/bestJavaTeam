package exercises;

import java.io.*;
import java.util.zip.*;

public class Treading {
    public static void main(String[] args) {

        String filename = "notes3.txt";
        try(ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("C:/Users/Евгений/IdeaProjects/student_home_works/out.zip"));
            FileInputStream fis= new FileInputStream(filename);)
        {
            ZipEntry entry1=new ZipEntry(filename);
            zout.putNextEntry(entry1);
            // считываем содержимое файла в массив byte
            byte[] buffer = new byte[fis.available()];
            fis.read(buffer);
            // добавляем содержимое к архиву
            zout.write(buffer);
            // закрываем текущую запись для новой записи
            zout.closeEntry();
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
    }
}

