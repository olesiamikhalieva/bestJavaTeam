package ht18_16_03_18;

public class Dictionary {
    private String word;
    private String translate;
    private String transcript;

    public Dictionary(String word, String translate, String transcript) {
        this.word = word;
        this.translate = translate;
        this.transcript = transcript;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getTranscript() {
        return transcript;
    }

    public void setTranscript(String transcript) {
        this.transcript = transcript;
    }

    @Override
    public String toString() {
        return word + '\n' + transcript + '\n' + translate + '\t';
    }

    public String toShortString(){
        return word + '\n' + translate + '\t';
    }
}
