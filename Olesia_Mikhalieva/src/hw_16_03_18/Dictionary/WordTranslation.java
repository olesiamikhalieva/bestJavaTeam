package hw_16_03_18.Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordTranslation {
    String word;
    String wordTranslation;
    private static Map<String,String> wordTranslationMap = new HashMap<>();


    public String getWordTranslation(String word) {
        this.word = word.toLowerCase();
        wordTranslation = getWordTranslationMap().get(this.word);
        return wordTranslation;
    }

    private static HashMap<String, String> getWordTranslationMap() {
     wordTranslationMap.put("animal","животное");
     wordTranslationMap.put("wood","лес");
     wordTranslationMap.put("mouse","мышь");

        wordTranslationMap.put("number", "число");
        wordTranslationMap.put("one", "один");
        wordTranslationMap.put("two", "два");
        wordTranslationMap.put("three", "три");
        wordTranslationMap.put("four", "четыри");
        wordTranslationMap.put("five", "пять");
        wordTranslationMap.put("six", "шесть");
        wordTranslationMap.put("seven", "сеиь");
        wordTranslationMap.put("eight", "восемь");
        wordTranslationMap.put("nine", "дявять");
        wordTranslationMap.put("ten", "десять");
        wordTranslationMap.put("thousand", "тысяча");
        wordTranslationMap.put("hundred", "сто");
        wordTranslationMap.put("tree", "дерево");
        wordTranslationMap.put("door", "дверь");
        wordTranslationMap.put("sun", "солнце");
        wordTranslationMap.put("green", "зеленый");
        wordTranslationMap.put("chocolate", "шоколад");
        wordTranslationMap.put("dream", "сон");
        wordTranslationMap.put("dog", "собака");
        wordTranslationMap.put("cat", "кот");
        wordTranslationMap.put("link", "ссылка");
        wordTranslationMap.put("laptop", "ноутбук");
        wordTranslationMap.put("course", "курс");
        wordTranslationMap.put("summer", "лето");
        wordTranslationMap.put("winter", "зима");
        wordTranslationMap.put("autumn", "осень");
        wordTranslationMap.put("spring", "весна");
        wordTranslationMap.put("water", "вода");
        wordTranslationMap.put("iron", "утюг");
        wordTranslationMap.put("bed", "кровать");
        wordTranslationMap.put("bad", "плохой");
        wordTranslationMap.put("good", "хороший");
        wordTranslationMap.put("in", "в");
        wordTranslationMap.put("mobile", "мобильный");
        wordTranslationMap.put("pen", "ручка");
        wordTranslationMap.put("window", "окно");

        return (HashMap<String, String>) wordTranslationMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordTranslation that = (WordTranslation) o;
        return Objects.equals(word.toLowerCase(), that.word.toLowerCase());
    }

    @Override
    public int hashCode() {

        return Objects.hash(word);
    }
}
