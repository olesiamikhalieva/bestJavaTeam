package hw_16_03_18;

import java.util.Objects;

public class Word {
    private String word;
    private String transcription;
    private String transcriptionRus;
    private String translate;

    public Word(String word, String translate) {
        this.word = word;
        this.translate = translate;
    }

    public Word(String word, String transcription, String translate) {

        this.word = word;
        this.transcription = transcription;
        this.translate = translate;
    }

    public Word(String word, String transcription, String transcriptionRus, String translate) {

        this.word = word;
        this.transcription = transcription;
        this.transcriptionRus = transcriptionRus;
        this.translate = translate;
    }

    public String getTranscription() {

        return transcription;
    }

    public void setTranscription(String transcription) {
        this.transcription = transcription;
    }

    public String getTranscriptionRus() {
        return transcriptionRus;
    }

    public void setTranscriptionRus(String transcriptionRus) {
        this.transcriptionRus = transcriptionRus;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }

    public String getWord() {

        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Word word1 = (Word) o;
        return Objects.equals(word, word1.word) &&
                Objects.equals(transcription, word1.transcription) &&
                Objects.equals(transcriptionRus, word1.transcriptionRus) &&
                Objects.equals(translate, word1.translate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(word, transcription, transcriptionRus, translate);
    }

    @Override
    public String toString() {
        return "\nСлово: " + word + "\nТранскрипция: " + transcription + "\nНа русском: " + transcriptionRus + "\nПеревод: " + translate;
}
}
