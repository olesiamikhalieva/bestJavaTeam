package hw_24_03_18.Dictionary;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;


public class LearnedWords {
    ArrayList<String> learnedWordsList;
    DictionaryWordsList dictionaryWordsList;


    public LearnedWords() {
        learnedWordsList = new ArrayList<>();
    }

    public void addLearnedWordsToLIst(String word){
        learnedWordsList.add(word);
    }

    public int learnedWordListSize(){
        return learnedWordsList.size();
    }

    public void showLearnedWords(){
        learnedWordsList.forEach(s -> System.out.println(s));
    }

    public void translateEngRus(String word) {
        dictionaryWordsList = new DictionaryWordsList();
        for (String s : learnedWordsList) {
            if (s.equals(word)) {
                System.out.println(word + "\t" + dictionaryWordsList.getWordTranslationMap().get(word));
            }
        }
    }

    public void translateRusEng(String word) {
        dictionaryWordsList = new DictionaryWordsList();
        for (Iterator<Map.Entry<String, String>> it = dictionaryWordsList.getWordTranslationMap().entrySet().iterator(); it.hasNext(); ) {
            Map.Entry<String, String> entry = it.next();
            if (entry.getValue().equals(word)) {
                System.out.println(entry.getKey() + "\t" + entry.getValue());
            }
        }
    }
}
