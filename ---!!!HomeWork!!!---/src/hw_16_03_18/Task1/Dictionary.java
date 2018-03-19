package hw_16_03_18.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Dictionary {
    private ArrayList<Word> wordArrayList = new ArrayList<>();

    public Dictionary() {
    }

    public Dictionary(ArrayList<Word> words) {
        this.wordArrayList = words;
    }

    public void setWord(Word word) {
        this.wordArrayList.add(word);
    }

    public void setCollectionWord(Collection wordList) {
        this.wordArrayList.addAll(wordList);
    }

    public Word getWord(String word) {
        for (Word w : wordArrayList) {
            if (w.getWord().equals(word)) {
                return w;
            } else {
                System.out.println("такого слова нету");
            }
        }
        return null;
    }

    public Word getWord(int index) {
        return wordArrayList.get(index);
    }

    public void showWord3x3() {
        ArrayList<Word> words = new ArrayList<>(wordArrayList);
        Random random = new Random();
        int bound = 70;
        for (int i = 0; i < 9; i++) {
            Word w1 = words.remove(random.nextInt(bound--));
            Word w2 = words.remove(random.nextInt(bound--));
            Word w3 = words.remove(random.nextInt(bound--));
            System.out.printf("%-25s%-25s%-25s%n", "слово: " + w1.getWord(), "слово: " + w2.getWord(), "слово: " + w3.getWord());
            System.out.printf("%-25s%-25s%-25s%n", "Транскрипция: " + w1.getTranscription(), "Транскрипция: " + w2.getTranscription(), "Транскрипция: " + w3.getTranscription());
            System.out.printf("%-25s%-25s%-25s%n", "Перевод: " + w1.getTranslate(), "Перевод: " + w2.getTranslate(), "Перевод: " + w3.getTranslate());
            System.out.println();
        }
    }

    public void showWord3x4() {
        ArrayList<Word> words = new ArrayList<>(wordArrayList);
        Random random = new Random();
        int bound = 70;
        for (int i = 0; i < 12; i++) {
            Word w1 = words.remove(random.nextInt(bound--));
            Word w2 = words.remove(random.nextInt(bound--));
            Word w3 = words.remove(random.nextInt(bound--));
            Word w4 = words.remove(random.nextInt(bound--));
            System.out.printf("%-25s%-25s%-25s%-25s%n", "слово: " + w1.getWord(), "слово: " + w2.getWord(), "слово: " + w3.getWord(), "слово: " + w4.getWord());
            System.out.printf("%-25s%-25s%-25s%-25s%n", "Транскрипция: " + w1.getTranscription(), "Транскрипция: " + w2.getTranscription(), "Транскрипция: " + w3.getTranscription(),"Транскрипция: " + w4.getTranscription());
            System.out.printf("%-25s%-25s%-25s%-25s%n", "Перевод: " + w1.getTranslate(), "Перевод: " + w2.getTranslate(), "Перевод: " +  w3.getTranslate(), "Перевод: " + w4.getTranslate());
            System.out.println();
        }
    }
}
