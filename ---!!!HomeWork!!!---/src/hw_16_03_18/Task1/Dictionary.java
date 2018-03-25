package hw_16_03_18.Task1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Random;

public class Dictionary {
    private int bound = 70;
    private ArrayList<Word> wordArrayList = new ArrayList<>();

    public Dictionary() {
    }

    public ArrayList<Word> getWordArrayList() {
        return wordArrayList;
    }

    public Dictionary(ArrayList<Word> words) {
        this.wordArrayList = words;
    }

    public void setWord(Word word) {
        this.wordArrayList.add(word);
    }

    public void setCollectionWord(ArrayList<Word> wordList) {
        this.wordArrayList.addAll(wordList);
    }

    public int getBound() {
        return bound;
    }

    public void setBound(int bound) {
        this.bound = bound;
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
        for (int i = 0; i < 3; i++) {
            Word w1 = words.get(random.nextInt(bound));
            Word w2 = words.get(random.nextInt(bound));
            Word w3 = words.get(random.nextInt(bound));
            System.out.printf("%-40s%-40s%-40s%n", "Cлово: " + w1.getWord(), "слово: " + w2.getWord(), "слово: " + w3.getWord());
            System.out.printf("%-40s%-40s%-40s%n", "Транскрипция: " + w1.getTranscription(), "Транскрипция: " + w2.getTranscription(), "Транскрипция: " + w3.getTranscription());
            System.out.printf("%-40s%-40s%-40s%n", "Перевод: " + w1.getTranslate(), "Перевод: " + w2.getTranslate(), "Перевод: " + w3.getTranslate());
            System.out.println();
        }
    }

    public void showWord3x4() {
        ArrayList<Word> words = new ArrayList<>(wordArrayList);
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            Word w1 = words.get(random.nextInt(bound));
            Word w2 = words.get(random.nextInt(bound));
            Word w3 = words.get(random.nextInt(bound));
            Word w4 = words.get(random.nextInt(bound));
            System.out.printf("%-40s%-40s%-40s%-40s%n", "Cлово: " + w1.getWord(), "слово: " + w2.getWord(), "слово: " + w3.getWord(), "слово: " + w4.getWord());
            System.out.printf("%-40s%-40s%-40s%-40s%n", "Транскрипция: " + w1.getTranscription(), "Транскрипция: " + w2.getTranscription(), "Транскрипция: " + w3.getTranscription(), "Транскрипция: " + w4.getTranscription());
            System.out.printf("%-40s%-40s%-40s%-40s%n", "Перевод: " + w1.getTranslate(), "Перевод: " + w2.getTranslate(), "Перевод: " + w3.getTranslate(), "Перевод: " + w4.getTranslate());
            System.out.println();
        }
    }

    public void searchWordForEnglish(String word) {
        boolean check = false;
        flag:
        for (Word w : wordArrayList) {
            if (w.getWord().equals(word)) {
                System.out.println("Такое слово есть: " + w);
                check = true;
                break flag;
            }
        }
        if (check == false) {
            System.out.println("Такого слова здесь нет");
        }
    }

    public void searchWordForTranslate(String word) {
        boolean check = false;
        flag:
        for (Word w : wordArrayList) {
            if (w.getTranslate().equals(word)) {
                System.out.println("Такое слово есть: " + w);
                check = true;
                break flag;
            }
        }
        if (check == false) {
            System.out.println("Такого слова здесь нет");
        }
    }

    @Override
    public String toString() {
        return wordArrayList.toString();
    }
}
