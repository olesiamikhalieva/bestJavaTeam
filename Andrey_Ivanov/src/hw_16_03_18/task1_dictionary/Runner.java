package hw_16_03_18.task1_dictionary;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {

    public static ArrayList<Dictionary> dict = new ArrayList<>();

    public static void main(String[] args) {
        setDict();
        listFor_9();//вывод 9 слов
       // listFor_12();//вывод 12 слов


    }

    public static void setDict() {
        dict.add(new Dictionary("one", "один", "[ван]"));
        dict.add(new Dictionary("two", "два", "[ту]"));
        dict.add(new Dictionary("three", "три", "[сры]"));
        dict.add(new Dictionary("four", "четыре", "[фо]"));
        dict.add(new Dictionary("five", "пять", "[файв]"));
        dict.add(new Dictionary("six", "шесть", "[сыкс]"));
        dict.add(new Dictionary("seven", "семь", "[сэвэн]"));
        dict.add(new Dictionary("eight", "восемь", "[ейт]"));
        dict.add(new Dictionary("nine", "девять", "[найн]"));
        dict.add(new Dictionary("ten", "десять", "[тэн]"));
        dict.add(new Dictionary("eleven", "одинадцать", "[илевен]"));
        dict.add(new Dictionary("twelve", "двенадцать", "[твелв]"));
        dict.add(new Dictionary("thirteen", "тринадцать", "[сортин]"));
        dict.add(new Dictionary("fourteen", "четырнадцать", "[фортин]"));
        dict.add(new Dictionary("fifteen", "пятнадцать", "[фифтин]"));
        dict.add(new Dictionary("sixteen", "шестнадцать", "[сикстин]"));
        dict.add(new Dictionary("seventeen", "семнадцать", "[сэвэнтин]"));
        dict.add(new Dictionary("eighteen", "восемнадцать", "[эйтин]"));
        dict.add(new Dictionary("nineteen", "девятнадцать", "[найнтин]"));
        dict.add(new Dictionary("twenty", "двадцать", "[твэнти]"));
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
                    int st1 = (int) (Math.random() * dict.size());
                    int st2 = (int) (Math.random() * dict.size());
                    int st3 = (int) (Math.random() * dict.size());
                    System.out.println(dict.get(st1).getWord() + "\t" + "\t" + dict.get(st2).getWord() + "\t" + "\t" + dict.get(st3).getWord());
                    System.out.println(dict.get(st1).getTranscription() + "\t" + "\t" + dict.get(st2).getTranscription() + "\t" + "\t" + dict.get(st3).getTranscription());
                    System.out.println(dict.get(st1).getTranslation() + "\t" + "\t" + dict.get(st2).getTranslation() + "\t" + "\t" + dict.get(st3).getTranslation());
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    int st1 = (int) (Math.random() * dict.size());
                    int st2 = (int) (Math.random() * dict.size());
                    int st3 = (int) (Math.random() * dict.size());
                    System.out.println(dict.get(st1).getWord() + "\t" + "\t" + dict.get(st2).getWord() + "\t" + "\t" + dict.get(st3).getWord());
                    System.out.println(dict.get(st1).getTranslation() + "\t" + "\t" + dict.get(st2).getTranslation() + "\t" + "\t" + dict.get(st3).getTranslation());
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
                    int st1 = (int) (Math.random() * dict.size());
                    int st2 = (int) (Math.random() * dict.size());
                    int st3 = (int) (Math.random() * dict.size());
                    int st4 = (int) (Math.random() * dict.size());
                    System.out.println(dict.get(st1).getWord() + "\t" + "\t" + dict.get(st2).getWord() + "\t" + "\t" + dict.get(st3).getWord()+"\t"+"\t"+dict.get(st4).getWord());
                    System.out.println(dict.get(st1).getTranscription() + "\t" + "\t" + dict.get(st2).getTranscription() + "\t" + "\t" + dict.get(st3).getTranscription()+"\t"+"\t"+dict.get(st4).getTranscription());
                    System.out.println(dict.get(st1).getTranslation() + "\t" + "\t" + dict.get(st2).getTranslation() + "\t" + "\t" + dict.get(st3).getTranslation()+"\t"+"\t"+dict.get(st4).getTranslation());
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    int st1 = (int) (Math.random() * dict.size());
                    int st2 = (int) (Math.random() * dict.size());
                    int st3 = (int) (Math.random() * dict.size());
                    int st4 = (int) (Math.random() * dict.size());

                    System.out.println(dict.get(st1).getWord() + "\t" + "\t" + dict.get(st2).getWord() + "\t" + "\t" + dict.get(st3).getWord()+"\t"+"\t"+dict.get(st4).getWord());
                    System.out.println(dict.get(st1).getTranslation() + "\t" + "\t" + dict.get(st2).getTranslation() + "\t" + "\t" + dict.get(st3).getTranslation()+"\t"+"\t"+dict.get(st4).getTranslation());
                    System.out.println();
                }
                break;
        }
    }
}