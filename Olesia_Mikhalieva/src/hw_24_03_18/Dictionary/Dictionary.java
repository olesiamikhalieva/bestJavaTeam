package hw_24_03_18.Dictionary;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

public class Dictionary {
    DictionaryWordsList dictionaryWordsList;

    public Dictionary() {
        dictionaryWordsList = new DictionaryWordsList();
    }

    public Dictionary(int q) {
        dictionaryWordsList = new DictionaryWordsList();
        if (q == 1) {
            Iterator<String> iterator = getWords().iterator();
            String a = iterator.next();
            System.out.print(a + "\t");
            String b = iterator.next();
            System.out.print(b + "\t");
            String c = iterator.next();
            System.out.print(c + "\t");
            String d = iterator.next();
            System.out.print(d + "\t");
            System.out.println();
            System.out.print(getWordTranscriptionInRussia(a) + "\t" + getWordTranscriptionInRussia(b) + "\t" + getWordTranscriptionInRussia(c) + "\t" + getWordTranscriptionInRussia(d));
            System.out.println();
            System.out.print(getWordTranslation(a) + "\t" + getWordTranslation(b) + "\t" + getWordTranslation(c) + "\t" + getWordTranslation(d));
            System.out.println();
            System.out.println();
        }
        if (q == 2) {
            Iterator<String> iterator = getWords().iterator();
            String a = iterator.next();
            System.out.print(a + "\t");
            String b = iterator.next();
            System.out.print(b + "\t");
            String c = iterator.next();
            System.out.print(c + "\t");
            System.out.println();
            System.out.print(getWordTranscriptionInRussia(a) + "\t" + getWordTranscriptionInRussia(b) + "\t" + getWordTranscriptionInRussia(c));
            System.out.println();
            System.out.print(getWordTranslation(a) + "\t" + getWordTranslation(b) + "\t" + getWordTranslation(c));
            System.out.println();
            System.out.println();
        }
    }

    private String getWordTranslation(String word) {
        return dictionaryWordsList.getWordTranslationMap().get(word);
    }

    private String getWordTranscriptionInRussia(String word) {
        return dictionaryWordsList.getWordTranscriptionInRussiaMap().get(word);
    }

    private ArrayList<String> getWords() {
        return dictionaryWordsList.getWords();

    }

    public void deleteWordFromDictionary(String word) {
        dictionaryWordsList.deleteWord(word);
    }


    public void showDictionary() {
        for (String s : getWords()) {
            System.out.println(s + "\t" + getWordTranscriptionInRussia(s) + "\t" + getWordTranslation(s));
        }

    }
}







