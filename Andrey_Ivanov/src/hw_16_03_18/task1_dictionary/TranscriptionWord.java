package hw_16_03_18.task1_dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TranscriptionWord {

    String word;
    String transcriptionWord;
    Map<String,String>transcriptionWordMap=new HashMap<>();

    public String getWordTranscription(String word) {
        this.word = word.toLowerCase();
        transcriptionWord = getTranscriptionWordMap().get(this.word);
        return transcriptionWord;
    }

    HashMap<String,String>getTranscriptionWordMap(){
        transcriptionWordMap.put("one","[ван]");
        transcriptionWordMap.put("two","[ту]");
        transcriptionWordMap.put("three","[сры]");
        transcriptionWordMap.put("four","[фо]");
        transcriptionWordMap.put("five","[файв]");
        transcriptionWordMap.put("six","[сыкс]");
        transcriptionWordMap.put("seven","[сэвэн]");
        transcriptionWordMap.put("eight","[ейт]");
        transcriptionWordMap.put("nine","[найн]");
        transcriptionWordMap.put("eleven","[илевен]");
        transcriptionWordMap.put("twelve","[твелв]");
        transcriptionWordMap.put("thirteen","[сортин]");
        transcriptionWordMap.put("fourteen","[фортин]");
        transcriptionWordMap.put("fifteen","[фифтин]");
        transcriptionWordMap.put("sixteen","[сикстин]");
        transcriptionWordMap.put("seventeen","[сэвэнтин]");
        transcriptionWordMap.put("eighteen","[эйтин]");
        transcriptionWordMap.put("nineteen","[найнтин]");
        transcriptionWordMap.put("twenty ","[твэнти]");
        return (HashMap<String, String>)transcriptionWordMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TranscriptionWord that = (TranscriptionWord) o;
        return Objects.equals(word, that.word) &&
                Objects.equals(transcriptionWord, that.transcriptionWord);
    }

    @Override
    public int hashCode() {

        return Objects.hash(word, transcriptionWord);
    }
}
