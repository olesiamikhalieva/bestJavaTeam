package hw_23_03_18.dictionary;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static ArrayList<Dictionary> dict = new ArrayList<>();
    public static ArrayList<Dictionary> myWords = new ArrayList<>();


    public static void main(String[] args) {
        setDict();//заполнение словаря словами
        //listFor_9();//вывод 9 слов
        // listFor_12();//вывод 12 слов
        addLearnedWordsAndRemove(5);   //метод для добавлений слов в список выученных и удаления из словаря
        addLearnedWordsAndRemove(7);
        addLearnedWordsAndRemove(9);
        addLearnedWordsAndRemove(15);
        //printDictionaryAndMyWords();        //метод для вывода выученных слов и слов в словаре
        search("one");                    //метод поиска по слову или переводу или транскрипции


    }

    public static void setDict() {
        dict.add(new Dictionary("one", "один", "[ван]"));//0
        dict.add(new Dictionary("two", "два", "[ту]"));//1
        dict.add(new Dictionary("three", "три", "[сры]"));//2
        dict.add(new Dictionary("four", "четыре", "[фо]"));//3
        dict.add(new Dictionary("five", "пять", "[файв]"));//4
        dict.add(new Dictionary("six", "шесть", "[сыкс]"));//5
        dict.add(new Dictionary("seven", "семь", "[сэвэн]"));//6
        dict.add(new Dictionary("eight", "восемь", "[ейт]"));//7
        dict.add(new Dictionary("nine", "девять", "[найн]"));//8
        dict.add(new Dictionary("ten", "десять", "[тэн]"));//9
        dict.add(new Dictionary("eleven", "одинадцать", "[илевен]"));//10
        dict.add(new Dictionary("twelve", "двенадцать", "[твелв]"));//11
        dict.add(new Dictionary("thirteen", "тринадцать", "[сортин]"));//12
        dict.add(new Dictionary("fourteen", "четырнадцать", "[фортин]"));//13
        dict.add(new Dictionary("fifteen", "пятнадцать", "[фифтин]"));//14
        dict.add(new Dictionary("sixteen", "шестнадцать", "[сикстин]"));//15
        dict.add(new Dictionary("seventeen", "семнадцать", "[сэвэнтин]"));//16
        dict.add(new Dictionary("eighteen", "восемнадцать", "[эйтин]"));//17
        dict.add(new Dictionary("nineteen", "девятнадцать", "[найнтин]"));//18
        dict.add(new Dictionary("twenty", "двадцать", "[твэнти]"));//19
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
                    System.out.println(dict.get(st1).getWord() + "\t" + "\t" + dict.get(st2).getWord() + "\t" + "\t" + dict.get(st3).getWord() + "\t" + "\t" + dict.get(st4).getWord());
                    System.out.println(dict.get(st1).getTranscription() + "\t" + "\t" + dict.get(st2).getTranscription() + "\t" + "\t" + dict.get(st3).getTranscription() + "\t" + "\t" + dict.get(st4).getTranscription());
                    System.out.println(dict.get(st1).getTranslation() + "\t" + "\t" + dict.get(st2).getTranslation() + "\t" + "\t" + dict.get(st3).getTranslation() + "\t" + "\t" + dict.get(st4).getTranslation());
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 3; i++) {
                    int st1 = (int) (Math.random() * dict.size());
                    int st2 = (int) (Math.random() * dict.size());
                    int st3 = (int) (Math.random() * dict.size());
                    int st4 = (int) (Math.random() * dict.size());

                    System.out.println(dict.get(st1).getWord() + "\t" + "\t" + dict.get(st2).getWord() + "\t" + "\t" + dict.get(st3).getWord() + "\t" + "\t" + dict.get(st4).getWord());
                    System.out.println(dict.get(st1).getTranslation() + "\t" + "\t" + dict.get(st2).getTranslation() + "\t" + "\t" + dict.get(st3).getTranslation() + "\t" + "\t" + dict.get(st4).getTranslation());
                    System.out.println();
                }
                break;
        }
    }

    public static void addLearnedWordsAndRemove(int index) {
        myWords.add(dict.get(index));
        dict.remove(index);
    }

    public static void printDictionaryAndMyWords() {
        System.out.println("Всего в словаре " + dict.size() + " слов:" + "\n");
        dict.forEach(K -> System.out.println(K.getWord() + "-" + K.getTranslation() + "-" + K.getTranscription()));
        System.out.println();
        System.out.println("Всего слов выучил " + myWords.size() + ":\n");
        myWords.forEach(K -> System.out.println(K.getWord() + "-" + K.getTranslation() + "-" + K.getTranscription()));
    }

    public static void search(String s) {
        for (int i = 0; i < dict.size(); i++) {
            if (dict.get(i).getWord() == s || dict.get(i).getTranslation() == s || dict.get(i).getTranscription() == s) {
                System.out.println(dict.get(i).getWord() + "-" + dict.get(i).getTranslation() + "-" + dict.get(i).getTranscription());
            }
        }
        for (int i = 0; i < myWords.size(); i++) {
            if (myWords.get(i).getWord() == s || myWords.get(i).getTranslation() == s || myWords.get(i).getTranscription() == s) {
                System.out.println(myWords.get(i).getWord() + "-" + myWords.get(i).getTranslation() + "-" + myWords.get(i).getTranscription());
            }
        }
    }
}