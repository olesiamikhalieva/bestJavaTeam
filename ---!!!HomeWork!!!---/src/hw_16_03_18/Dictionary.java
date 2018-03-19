package hw_16_03_18;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;

public class Dictionary {
    private HashSet<Word> wordHashSet = new HashSet<>();

    public Dictionary() {
    }

    public Dictionary(HashSet<Word> wordHashSet) {
        this.wordHashSet = wordHashSet;
    }

    public void setWord(Word word) {
        this.wordHashSet.add(word);
    }

    public void setCollectionWord(Collection wordList) {
        this.wordHashSet.addAll(wordList);
    }

    public Word getWord(String word) {
        for (Word w : wordHashSet) {
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
        int counter = 1;
        for (Word w : wordHashSet) {
            switch (counter) {
                case 1:
                    word1 = w;
                    counter++;
                    break;
                case 2:
                    word2 = w;
                    counter++;
                    break;
                case 3:
                    word3 = w;
                    counter++;
                    break;
                default:
                    System.out.println("бубух");
                    break;
            }
            if (counter == 4)
                System.out.printf(word1 + " " + word2 + " " + word3);
        }
    }

    public void showWord3x4() {

    }
}
