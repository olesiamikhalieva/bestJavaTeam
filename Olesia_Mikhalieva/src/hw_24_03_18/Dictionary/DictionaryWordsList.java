package hw_24_03_18.Dictionary;

import java.util.*;

public class DictionaryWordsList {
    private static ArrayList<String> wordsList;
    private static HashMap<String, String> wordTranslationMap;
    private static HashMap<String, String> wordTranscriptionInRussiaMap;


    public ArrayList<String> getWords() {
        String[] mass = {"animal", "wood", "mouse", "number", "one", "two", "three", "four", "five", "six", "seven", "eight",
                "nine", "ten", "thousand", "hundred", "tree", "door", "sun", "green", "chocolate", "dream", "dog", "cat", "link", "laptop", "course",
                "summer", "winter", "spring", "autumn", "water", "iron", "bed", "bad", "good", "in", "mobile", "pen", "window",};
        wordsList = new ArrayList<>(Arrays.asList(mass));
        Collections.shuffle(wordsList);
        return wordsList;
    }

    public HashMap<String, String> getWordTranslationMap() {
        wordTranslationMap = new HashMap<>();
        wordTranslationMap.put("animal", "животное");
        wordTranslationMap.put("wood", "лес");
        wordTranslationMap.put("mouse", "мышь");
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
        return wordTranslationMap;
    }

    public HashMap<String, String> getWordTranscriptionInRussiaMap() {
        wordTranscriptionInRussiaMap = new HashMap<>();
        wordTranscriptionInRussiaMap.put("wood", "вуд");
        wordTranscriptionInRussiaMap.put("animal", "энимал");
        wordTranscriptionInRussiaMap.put("mouse", "маус");
        wordTranscriptionInRussiaMap.put("number", "намбер");
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
        wordTranscriptionInRussiaMap.put("thousand", "саузэнд");
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
        return wordTranscriptionInRussiaMap;
    }

    public void deleteWord(String word) {
        wordsList.remove(word);
        for (Iterator<Map.Entry<String, String>> it = wordTranslationMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey().equals(word)) {
                it.remove();
            }
        }

        for (Iterator<Map.Entry<String, String>> it = wordTranscriptionInRussiaMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey().equals(word)) {
                it.remove();
            }
        }
    }

    public int dictionarySize() {
        return wordsList.size();
    }

    public void translateEngRus(String word) {
        for (String s : getWords()) {
            if (s.equals(word)) {
                System.out.println(s + "\t" + wordTranslationMap.get(s));
            }
        }
    }

    public void translateRusEng(String word) {
        for (Iterator<Map.Entry<String, String>> it = wordTranslationMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getValue().equals(word)) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
        }
    }
}
