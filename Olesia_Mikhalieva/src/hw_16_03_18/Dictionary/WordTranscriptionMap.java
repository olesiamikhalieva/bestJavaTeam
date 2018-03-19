package hw_16_03_18.Dictionary;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WordTranscriptionMap {

    String word;
    String wordTranscription;
    private static Words words = new Words();
    private static Map<String, String> wordTranscriptionMap = new HashMap<>();


    public String getWordTranscription(String word) {
        this.word = word.toLowerCase();
        wordTranscription = getWordTranscriptionMap().get(this.word);
        return wordTranscription;
    }

    private static HashMap<String, String> getWordTranscriptionMap() {
        wordTranscriptionMap.put("animal", "[animal]");
        wordTranscriptionMap.put("wood", "[wood]");
        wordTranscriptionMap.put("mouse", "[mouse]");
        wordTranscriptionMap.put("number", "[number]");
        wordTranscriptionMap.put("one", "[one]");
        wordTranscriptionMap.put("two", "[two]");
        wordTranscriptionMap.put("three", "[three]");
        wordTranscriptionMap.put("four", "[four]");
        wordTranscriptionMap.put("five", "[five]");
        wordTranscriptionMap.put("six", "[six]");
        wordTranscriptionMap.put("seven", "[seven]");
        wordTranscriptionMap.put("eight", "[eight]");
        wordTranscriptionMap.put("nine", "[nine]");
        wordTranscriptionMap.put("ten", "[ten]");
        wordTranscriptionMap.put("thousand", "[thousand]");
        wordTranscriptionMap.put("hundred", "[hundred]");
        wordTranscriptionMap.put("tree", "[tree]");
        wordTranscriptionMap.put("door", "[door]");
        wordTranscriptionMap.put("sun", "[sun]");
        wordTranscriptionMap.put("green", "[green]");
        wordTranscriptionMap.put("chocolate", "[chocolate]");
        wordTranscriptionMap.put("dream", "[dream]");
        wordTranscriptionMap.put("dog", "[dog]");
        wordTranscriptionMap.put("cat", "[cat]");
        wordTranscriptionMap.put("link", "[link]");
        wordTranscriptionMap.put("laptop", "[laptop]");
        wordTranscriptionMap.put("course", "[course]");
        wordTranscriptionMap.put("summer", "[summer]");
        wordTranscriptionMap.put("winter", "[winter]");
        wordTranscriptionMap.put("autumn", "[autumn]");
        wordTranscriptionMap.put("spring", "[spring]");
        wordTranscriptionMap.put("water", "[water]");
        wordTranscriptionMap.put("iron", "[iron]");
        wordTranscriptionMap.put("bed", "[bed]");
        wordTranscriptionMap.put("bad", "[bad]");
        wordTranscriptionMap.put("good", "[good]");
        wordTranscriptionMap.put("in", "[in]");
        wordTranscriptionMap.put("mobile", "[mobile]");
        wordTranscriptionMap.put("pen", "[pen]");
        wordTranscriptionMap.put("window", "[window]");
        return (HashMap<String, String>) wordTranscriptionMap;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WordTranscriptionMap that = (WordTranscriptionMap) o;
        return Objects.equals(word, that.word);
    }

    @Override
    public int hashCode() {

        return Objects.hash(word);
    }
}



