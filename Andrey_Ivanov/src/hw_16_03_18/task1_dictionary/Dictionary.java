package hw_16_03_18.task1_dictionary;
public class Dictionary {

    private String word;
    private String translation;
    private String transcription;

    public Dictionary() {
    }

    public Dictionary(String word, String translation, String transcription) {
        this.word = word;
        this.translation = translation;
        this.transcription = transcription;

    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public String getTranscription() {
        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

}
