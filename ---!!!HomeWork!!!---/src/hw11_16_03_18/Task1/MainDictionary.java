package hw11_16_03_18.Task1;

import java.util.ArrayList;
import java.util.Random;

public class MainDictionary {
    public static void main(String[] args) {
        Random random = new Random();

        ArrayList<Word> words = new ArrayList<>();
        for (int i = 1; i <= 70; i++) {
            words.add(new Word("word" + i, "транскрипция" + i, "транскрипция на российском" + i, "перевод" + i));
        }

        Dictionary dictionary = new Dictionary(words);

        dictionary.showWord3x3();

        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");

        dictionary.showWord3x4();

//удаляем с словаря и добавляем в список изученых

        System.out.println("Удаляем с словаря и добавляем в список изученных");

        ListLernWord listLernWord = new ListLernWord();
        listLernWord.setWords(words.remove(random.nextInt(dictionary.getBound()) + 1));
        dictionary.setBound(dictionary.getBound() - 1); // из-за того, что я удаляю из словаря слово, приходиться и менять размер словаря для дальнейшего корректного поиска слов
        listLernWord.setWords(words.remove(random.nextInt(dictionary.getBound()) + 1));
        dictionary.setBound(dictionary.getBound() - 1);
        listLernWord.setWords(words.remove(random.nextInt(dictionary.getBound()) + 1));
        dictionary.setBound(dictionary.getBound() - 1);
        listLernWord.setWords(words.remove(random.nextInt(dictionary.getBound()) + 1));
        dictionary.setBound(dictionary.getBound() - 1);
        listLernWord.setWords(words.remove(random.nextInt(dictionary.getBound()) + 1));
        dictionary.setBound(dictionary.getBound() - 1);
        System.out.println("");

        System.out.println("Размер словаря " + dictionary.getWordArrayList().size()); // кол-во слов словаря
        System.out.println("Размер изученых слов " + listLernWord.getWords().size()); // кол-во изученых слов
        System.out.println("");

        System.out.println("Ищем слово \" word5 \" в Словаре -- ");
        System.out.println("По английскому слову \" word5 \" : ");
        dictionary.searchWordForEnglish("word5");
        System.out.println("По переводу \" перевод5 \" : ");
        dictionary.searchWordForTranslate("перевод5");
        System.out.println("");

        System.out.println("Ищем слово \" word5 \" в Изученных -- ");
        System.out.println("По английскому слову \" word5 \" : ");
        listLernWord.searchWordForEnglish("word5");
        System.out.println("По переводу \" перевод5 \" : ");
        listLernWord.searchWordForTranslate("перевод5");
        System.out.println("");

        System.out.println("Посмотрим на весь словарь: " + dictionary.toString());
        System.out.println("Посмотрим на все изученные: " + listLernWord.toString());
    }
}
