package ExamplesFromBook;

import java.util.*;

public class Q {

    private static ArrayList<String> wordsList;
    private static HashMap<String, String> wordTranslationMap;
    private static HashMap<String, String> wordTranscriptionInRussiaMap;

    public static void main(String[] args) {
        Q q = new Q();
        q.getWords();
        q.getWordTranslationMap();
        q.getWordTranscriptionInRussiaMap();
        System.out.println();
        q.deleteWord("wood");
        wordTranslationMap.forEach((s, s2) -> System.out.println(s+s2));

    }

    public ArrayList<String> getWords() {
        String[] mass = {"animal", "wood", "mouse"};
        wordsList = new ArrayList<>(Arrays.asList(mass));
        Collections.shuffle(wordsList);
        return wordsList;
    }

    public HashMap<String, String> getWordTranslationMap() {
        wordTranslationMap = new HashMap<>();
        wordTranslationMap.put("animal", "животное");
        wordTranslationMap.put("wood", "лес");
        wordTranslationMap.put("mouse", "мышь");

        return wordTranslationMap;
    }

    public HashMap<String, String> getWordTranscriptionInRussiaMap() {
        wordTranscriptionInRussiaMap = new HashMap<>();
        wordTranscriptionInRussiaMap.put("wood", "вуд");
        wordTranscriptionInRussiaMap.put("animal", "энимал");
        wordTranscriptionInRussiaMap.put("mouse", "маус");
        return wordTranscriptionInRussiaMap;
    }

    public void deleteWord(String word) {
        wordsList.remove(word);
        wordsList.forEach((s) -> System.out.println(s));
        System.out.println("_____________");
        for (Iterator<Map.Entry<String, String>> it = wordTranslationMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey().equals(word)) {
                it.remove();
            }
        }
        wordTranslationMap.forEach((s, s2) -> System.out.println(s+" "+s2));
        System.out.println(" ---------");
        for (Iterator<Map.Entry<String, String>> it = wordTranscriptionInRussiaMap.entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getKey().equals(word)) {
                it.remove();
            }
        }
        wordTranscriptionInRussiaMap.forEach((s, s2) -> System.out.println(s+" "+s2));
        System.out.println("_______________");

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}








