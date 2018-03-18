package hw_16_03_18.task1_dictionary;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static Dictionary[] dict = new Dictionary[20];

    public static void main(String[] args) {
        setDict();
       // listFor_9();//вывод 9 слов
        listFor_12();//вывод 12 слов


    }

    public static void setDict() {
        dict[0] = new Dictionary("one", "один", "[ван]");
        dict[1] = new Dictionary("two", "два", "[ту]");
        dict[2] = new Dictionary("three", "три", "[сры]");
        dict[3] = new Dictionary("four", "четыре", "[фо]");
        dict[4] = new Dictionary("five", "пять", "[файв]");
        dict[5] = new Dictionary("six", "шесть", "[сыкс]");
        dict[6] = new Dictionary("seven", "семь", "[сэвэн]");
        dict[7] = new Dictionary("eight", "восемь", "[ейт]");
        dict[8] = new Dictionary("nine", "девять", "[найн]");
        dict[9] = new Dictionary("ten", "десять", "[тэн]");
        dict[10] = new Dictionary("eleven", "одинадцать", "[илевен]");
        dict[11] = new Dictionary("twelve", "двенадцать", "[твелв]");
        dict[12] = new Dictionary("thirteen", "тринадцать", "[сортин]");
        dict[13] = new Dictionary("fourteen", "четырнадцать", "[фортин]");
        dict[14] = new Dictionary("fifteen", "пятнадцать", "[фифтин]");
        dict[15] = new Dictionary("sixteen", "шестнадцать", "[сикстин]");
        dict[16] = new Dictionary("seventeen", "семнадцать", "[сэвэнтин]");
        dict[17] = new Dictionary("eighteen", "восемнадцать", "[эйтин]");
        dict[18] = new Dictionary("nineteen", "девятнадцать", "[найнтин]");
        dict[19] = new Dictionary("twenty", "двадцать", "[твэнти]");
    }


    public static void listFor_9() {

        Scanner in = new Scanner(System.in);

        System.out.println("В каком виде вывести:\n" +
                "1. Слово + транскрипция + перевод\n" +
                "2. Слово + перевод");
        int n = in.nextInt();
        switch (n) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    int st1 = (int) (Math.random() * dict.length);
                    int st2 = (int) (Math.random() * dict.length);
                    int st3 = (int) (Math.random() * dict.length);
                    System.out.println(dict[st1].getWord() + "\t" + "\t" + dict[st2].getWord() + "\t" + "\t" + dict[st3].getWord());
                    System.out.println(dict[st1].getTranscription() + "\t" + "\t" + dict[st2].getTranscription() + "\t" + "\t" + dict[st3].getTranscription());
                    System.out.println(dict[st1].getTranslation() + "\t" + "\t" + dict[st2].getTranslation() + "\t" + "\t" + dict[st3].getTranslation());
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    int st1 = (int) (Math.random() * dict.length);
                    int st2 = (int) (Math.random() * dict.length);
                    int st3 = (int) (Math.random() * dict.length);
                    System.out.println(dict[st1].getWord() + "\t" + "\t" + dict[st2].getWord() + "\t" + "\t" + dict[st3].getWord());
                    System.out.println(dict[st1].getTranslation() + "\t" + "\t" + dict[st2].getTranslation() + "\t" + "\t" + dict[st3].getTranslation());
                    System.out.println();
                }
                break;

        }
    }
    public static void listFor_12() {

        Scanner in = new Scanner(System.in);

        System.out.println("В каком виде вывести:\n" +
                "1. Слово + транскрипция + перевод\n" +
                "2. Слово + перевод");
        int n = in.nextInt();
        switch (n) {
            case 1:
                for (int i = 0; i < 3; i++) {
                    int st1 = (int) (Math.random() * dict.length);
                    int st2 = (int) (Math.random() * dict.length);
                    int st3 = (int) (Math.random() * dict.length);
                    int st4 = (int) (Math.random() * dict.length);
                    System.out.println(dict[st1].getWord() + "\t" + "\t" + dict[st2].getWord() + "\t" + "\t" + dict[st3].getWord()+"\t"+"\t"+dict[st4].getWord());
                    System.out.println(dict[st1].getTranscription() + "\t" + "\t" + dict[st2].getTranscription() + "\t" + "\t" + dict[st3].getTranscription()+"\t"+"\t"+dict[st4].getTranscription());
                    System.out.println(dict[st1].getTranslation() + "\t" + "\t" + dict[st2].getTranslation() + "\t" + "\t" + dict[st3].getTranslation()+"\t"+"\t"+dict[st4].getTranslation());
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    int st1 = (int) (Math.random() * dict.length);
                    int st2 = (int) (Math.random() * dict.length);
                    int st3 = (int) (Math.random() * dict.length);
                    int st4 = (int) (Math.random() * dict.length);

                    System.out.println(dict[st1].getWord() + "\t" + "\t" + dict[st2].getWord() + "\t" + "\t" + dict[st3].getWord()+"\t"+"\t"+dict[st4].getWord());
                    System.out.println(dict[st1].getTranslation() + "\t" + "\t" + dict[st2].getTranslation() + "\t" + "\t" + dict[st3].getTranslation()+"\t"+"\t"+dict[st4].getTranslation());
                    System.out.println();
                }
                break;
        }
    }
}