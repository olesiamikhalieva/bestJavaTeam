package hw_08_04_18.Task_3;
/*
Написать программу, которая берет информацию из нескольких источников( а именно существующего
файла с набором произвольной информации и из веба, использовать любую ссылку).
Далее эта программа должна записывать информацию следующим образом :
из веба в 5 разных файлов используя для этого 5 потоков.
из файла мы записываем посимвольно в карту. Где ключ это наш символ преобразований в char,
а значение дата в момент записи( при чем формат даты - часы, минуты, секунды и миллисекунды).
после чего вывести карту в консоль. Минимальный размер карты не менее 100.
 */


import java.io.*;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.util.HashMap;
import java.util.Map;


public class Runner {

    public static String pathFiles = "D:\\Java\\Files\\";
    public static Map<Character,String> map= new HashMap<>();
    public static File file;


    public static void main(String[] args) throws IOException{

        String site = "https://habrahabr.ru/post/164487/";
        for (int i = 1; i <= 5; i++) {
            file = createFile("file"+i+".txt");
            Thread thread = new Thread(new createThread(file,site),"Thread " + i);
            thread.start();
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        writeToMap(file);
        printMap();
    }


    private static void printMap() {
            System.out.println("MAP:");
            map.forEach((key,value)-> System.out.println(key+"-"+value));
    }


    private static File createFile(String name) throws IOException {
        file = new File(pathFiles, name);
        file.createNewFile();
        return file;
    }

    private static void writeToMap(File file){

        try(FileReader reader = new FileReader(file))
        {
            // читаем посимвольно
            int c, i=0;
            while((c=reader.read())!=-1){
                LocalDateTime timeWriteToMap = LocalDateTime.now();
                map.put(((char)c),timeWriteToMap.get(ChronoField.HOUR_OF_DAY) + "." + timeWriteToMap.get(ChronoField.MINUTE_OF_HOUR) + "." + timeWriteToMap.get(ChronoField.SECOND_OF_MINUTE) + "." + timeWriteToMap.get(ChronoField.MILLI_OF_SECOND));
            }
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }


}
