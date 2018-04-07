package hw_06_04_18;

import java.io.IOException;
import java.util.HashMap;
       /*Написать программу, которая берет информацию из нескольких источников( а именно существующего файла с набором
        произвольной информации и из веба, использовать любую ссылку).  Далее эта программа должна записывать
        информацию следующим образом :
        из веба в 5 разных файлов используя для этого 5 потоков.
        из файла мы записываем посимвольно в карту. Где ключ это наш символ преобразований в char,
        а значение дата в момент записи( при чем формат даты - часы, минуты, секунды и миллисекунды).
        после чего вывести карту в консоль. Минимальный размер карты не менее 100.8*/

public class Runner {

    public static void main(String[] args) throws IOException {

        JThread t = new JThread();

        HashMap<Character, String> hashMap = new HashMap<>();

        System.out.println("Запуск пяти потоков:");

        for (int i = 1; i <= 5; i++) {
            t = new JThread("JThread " + i);
            t.start();
            try {
                t.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        t.printMap();
    }
}
