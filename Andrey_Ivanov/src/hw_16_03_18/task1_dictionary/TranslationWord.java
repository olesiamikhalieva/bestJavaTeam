package hw_16_03_18.task1_dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TranslationWord {

    String word;
    String translationWord;
    Map<String,String>translationWordMap=new HashMap<>();

    public String getWordTranslation(String word) {
        this.word = word.toLowerCase();
        translationWord = getTranslationWordMap().get(this.word);
        return translationWord;
    }


    HashMap<String,String>getTranslationWordMap(){
        translationWordMap.put("one","один");
        translationWordMap.put("two","два");
        translationWordMap.put("three","три");
        translationWordMap.put("four","четыре");
        translationWordMap.put("five","пять");
        translationWordMap.put("six","шесть");
        translationWordMap.put("seven","семь");
        translationWordMap.put("eight","восемь");
        translationWordMap.put("nine","девять");
        translationWordMap.put("ten","десять");
        translationWordMap.put("eleven","одинадцать");
        translationWordMap.put("twelve","двенадцать");
        translationWordMap.put("thirteen","тринадцать");
        translationWordMap.put("fourteen","четырнадцать");
        translationWordMap.put("fifteen","пятнадцать");
        translationWordMap.put("sixteen","шестнадцать");
        translationWordMap.put("seventeen ","семнадцать");
        translationWordMap.put("eighteen","восемнадцать");
        translationWordMap.put("nineteen","девятнадцать");
        translationWordMap.put("twenty","двадцать");

        return (HashMap<String,String>)translationWordMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TranslationWord that = (TranslationWord) o;
        return Objects.equals(word, that.word) &&
                Objects.equals(translationWord, that.translationWord);
    }

    @Override
    public int hashCode() {

        return Objects.hash(word, translationWord);
    }


}
