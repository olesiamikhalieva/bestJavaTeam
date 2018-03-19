package hw_16_03_18;

import java.util.ArrayList;
import java.util.Collection;

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

    public void showWord3x3() {
        Word word1 = null;
        Word word2 = null;
        Word word3 = null;
        int countAll = 0;
        int counter = 1;
        for (Word w : wordArrayList) {
            switch (counter) {
                case 1:
                    word1 = w;
                    counter++;
                    countAll++;
                    break;
                case 2:
                    word2 = w;
                    counter++;
                    countAll++;
                    break;
                case 3:
                    word3 = w;
                    counter++;
                    countAll++;
                    break;
                default:
                    System.out.println("бубух");
                    break;
            }
            if (counter == 4) {
                System.out.printf("%-15s%-15s%-15s%n", word1.getWord(), word2.getWord(), word3.getWord());
                System.out.printf("%-15s%-15s%-15s%n", word1.getTranscription(), word2.getTranscription(), word3.getTranscription());
                System.out.printf("%-15s%-15s%-15s%n", word1.getTranslate(), word2.getTranslate(), word3.getTranslate());
                counter = 1;
            }
        }
    }

    public void showWord3x4() {

    }
}
