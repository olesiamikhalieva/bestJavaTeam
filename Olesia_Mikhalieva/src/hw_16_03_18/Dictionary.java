package hw_16_03_18;

import java.util.Iterator;

public class Dictionary {
    String word;
    int numberWords;
    private static WordTranslation wordTranslation = new WordTranslation();
    private static WordTranscriptionMap wordTranscription = new WordTranscriptionMap();
    private static WordTranscriptionInRussiaMap wordTranscriptionInRussia = new WordTranscriptionInRussiaMap();
    private static Words words = new Words();

   //a - way to show
    public Dictionary(String word, int a) {
        this.word = word;
        if (a == 1) {
            System.out.println(word + "\t" + wordTranscriptionInRussia.getWordTranscriptionInRussia(word) + "\t" +wordTranscription.getWordTranscription(word)+ "\t"+wordTranslation.getWordTranslation(word));
        } else if (a == 2) {
            System.out.println(word + "\t" +wordTranscription.getWordTranscription(word)+"\t"+ wordTranslation.getWordTranslation(word));
        } else if (a != 1 && a != 2) {
            System.out.println("You can choice 1 or 2.");
            System.out.println("1 - word + russian transcription + translation;");
            System.out.println("2 - word + translation.");
        } else {
            System.out.println("Sorry...No such word in the dictionary.");
        }
    }


    public Dictionary(int numberWords, int a) {
        Iterator<String> iterator = words.getWords().iterator();
        for (int i = 0; i < numberWords; i++) {
            this.word = iterator.next();
            if (a == 1) {
                System.out.println(word + "\t-\t" + wordTranslation.getWordTranslation(word) + "\t-\t" + wordTranscriptionInRussia.getWordTranscriptionInRussia(word));
            } else if (a == 2) {
                System.out.println(word + "\t-\t" + wordTranslation.getWordTranslation(word));
            } else {
                System.out.println("You can choice 1 or 2.");
                System.out.println("1 - word + russian transcription + translation;");
                System.out.println("2 - word + translation.");
            }
        }
    }



    public String getWord() {
        return word;
    }

    public int getNumberWords() {
        return numberWords;
    }


}



