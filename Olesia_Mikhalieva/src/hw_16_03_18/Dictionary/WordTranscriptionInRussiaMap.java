package hw_16_03_18;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordTranscriptionInRussiaMap {
    String word;
    String wordTranscriptionInRussia;
    private static Map<String, String> wordTranscriptionInRussiaMap = new HashMap<>();


    public String getWordTranscriptionInRussia(String word) {
        this.word = word.toLowerCase();
        wordTranscriptionInRussia = getWordTranscriptionInRussiaMap().get(this.word);
        return wordTranscriptionInRussia;
    }


    private static HashMap<String, String> getWordTranscriptionInRussiaMap() {
        wordTranscriptionInRussiaMap.put("wood", "вуд");
        wordTranscriptionInRussiaMap.put("animal", "энимал");
        wordTranscriptionInRussiaMap.put("mouse", "маус");
        wordTranscriptionInRussiaMap.put("number", "маус");
        wordTranscriptionInRussiaMap.put("one", "ван");
        wordTranscriptionInRussiaMap.put("two", "ту");
        wordTranscriptionInRussiaMap.put("three", "сри");
        wordTranscriptionInRussiaMap.put("four", "фо");
        wordTranscriptionInRussiaMap.put("five", "фaйф");
        wordTranscriptionInRussiaMap.put("six", "сикс");
        wordTranscriptionInRussiaMap.put("seven", "сэвэн");
        wordTranscriptionInRussiaMap.put("eight", "эйт");
        wordTranscriptionInRussiaMap.put("nine", "найн");
        wordTranscriptionInRussiaMap.put("ten", "тэн");
        wordTranscriptionInRussiaMap.put("hundred", "хандрид");
        wordTranscriptionInRussiaMap.put("tree", "три");
        wordTranscriptionInRussiaMap.put("door", "до");
        wordTranscriptionInRussiaMap.put("sun", "сан");
        wordTranscriptionInRussiaMap.put("green", "грин");
        wordTranscriptionInRussiaMap.put("chocolate", "чоколэйт");
        wordTranscriptionInRussiaMap.put("dream", "дрим");
        wordTranscriptionInRussiaMap.put("dog", "дог");
        wordTranscriptionInRussiaMap.put("cat", "кэт");
        wordTranscriptionInRussiaMap.put("link", "линк");
        wordTranscriptionInRussiaMap.put("laptop", "лэптоп");
        wordTranscriptionInRussiaMap.put("course", "корс");
        wordTranscriptionInRussiaMap.put("summer", "винтер");
        wordTranscriptionInRussiaMap.put("winter", "файв");
        wordTranscriptionInRussiaMap.put("spring", "сприн");
        wordTranscriptionInRussiaMap.put("autumn", "отэм");
        wordTranscriptionInRussiaMap.put("water", "вотэр");
        wordTranscriptionInRussiaMap.put("iron", "айрон");
        wordTranscriptionInRussiaMap.put("bed", "бэд");
        wordTranscriptionInRussiaMap.put("bad", "бэд");
        wordTranscriptionInRussiaMap.put("good", "гуд");
        wordTranscriptionInRussiaMap.put("in", "ин");
        wordTranscriptionInRussiaMap.put("mobile", "мобайл");
        wordTranscriptionInRussiaMap.put("pen", "пен");
        wordTranscriptionInRussiaMap.put("window", "виндоу");
        return (HashMap<String, String>) wordTranscriptionInRussiaMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordTranscriptionInRussiaMap that = (WordTranscriptionInRussiaMap) o;
        return Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {

        return Objects.hash(word);
    }
}
