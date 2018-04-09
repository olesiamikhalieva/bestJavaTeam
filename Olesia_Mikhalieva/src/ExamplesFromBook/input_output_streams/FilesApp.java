package ExamplesFromBook.input_output_streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesApp {

    public static void main(String[] args) {

        try(FileInputStream fin=new FileInputStream("C://SomeDir//note.txt"))//read file
        {
            System.out.println("Размер файла: " + fin.available() + " байт(а)");
//массив byte
            byte[] buffer = new byte[fin.available()];
// считаем файл в буфер
            fin.read(buffer, 0, fin.available());

            System.out.println("Содержимое файла:");
            for(int i=0; i<buffer.length;i++){

                System.out.print((char)buffer[i]);
            }
//            int i=-1;
//            while((i=fin.read())!=-1){
//
//                System.out.print((char)i);
//            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }

        String text = "Hello world!"; // строка для записи
        try(FileOutputStream fos=new FileOutputStream("C://SomeDir//notes.txt"))//write file
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();

            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
