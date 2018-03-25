package hw_16_03_18.Task1;

import java.util.ArrayList;
import java.util.Objects;

public class ListLernWord {
    private int bound = 0;
    ArrayList<Word> words = new ArrayList<>();

    public ListLernWord(ArrayList<Word> words) {
        this.words = words;
    }

    public ListLernWord() {
    }

    public ArrayList<Word> getWords() {
        return words;
    }

    public void setWords(ArrayList<Word> words) {
        this.words = words;
        this.bound += words.size();
    }

    public void setWords(Word word) {
        this.words.add(word);
        this.bound++;
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        this.bound = bound;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ListLernWord that = (ListLernWord) o;
        return bound == that.bound &&
                Objects.equals(words, that.words);
    }

    @Override
    public int hashCode() {

        return Objects.hash(bound, words);
    }

    public void searchWordForEnglish(String word) {
        boolean check = false;
        flag:
        for (Word w : words) {
            if (w.getWord().equals(word)) {
                System.out.println("Такое слово есть: " + w);
                check = true;
                break flag;
            }
        }
        if (check == false){
            System.out.println("Такого слова здесь нет");
        }
    }

    public void searchWordForTranslate(String word) {
        boolean check = false;
        flag:
        for (Word w : words) {
            if (w.getTranslate().equals(word)) {
                System.out.println("Такое слово есть: " + w);
                check = true;
                break flag;
            }
        }
        if (check == false){
            System.out.println("Такого слова здесь нет");
        }
    }

    @Override
    public String toString() {
        return words.toString();
    }
}
