package hw_16_03_18.Dictionary;

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
            System.out.println(word + "\t" + wordTranscriptionInRussia.getWordTranscriptionInRussia(word) + "\t" + wordTranscription.getWordTranscription(word) + "\t" + wordTranslation.getWordTranslation(word));
        } else if (a == 2) {
            System.out.println(word + "\t" + wordTranscription.getWordTranscription(word) + "\t" + wordTranslation.getWordTranslation(word));
        } else if (a != 1 && a != 2) {
            System.out.println("You can choice 1 or 2.");
            System.out.println("1 - word + russian transcription + translation;");
            System.out.println("2 - word + translation.");
        } else {
            System.out.println("Sorry...No such word in the dictionary.");
        }
    }


    public Dictionary() {
        Iterator<String>iterator = words.getWords().iterator();
        String a = iterator.next();
        System.out.print(a+"\t");
        String b = iterator.next();
        System.out.print(b+"\t");
        String c = iterator.next();
        System.out.print(c+"\t");
        String d = iterator.next();
        System.out.print(d+"\t");
        System.out.println();
        System.out.print(wordTranscriptionInRussia.getWordTranscriptionInRussia(a)+"\t"+
                wordTranscriptionInRussia.getWordTranscriptionInRussia(b)+"\t"+
                wordTranscriptionInRussia.getWordTranscriptionInRussia(c)+"\t"+
                wordTranscriptionInRussia.getWordTranscriptionInRussia(d));
        System.out.println();
        System.out.print(wordTranslation.getWordTranslation(a)+"\t"+
                wordTranslation.getWordTranslation(b)+"\t"+
                wordTranslation.getWordTranslation(c)+"\t"+
                wordTranslation.getWordTranslation(d));
            System.out.println();
        System.out.println();
        }



    public String getWord() {
        return word;
    }

    public int getNumberWords() {
        return numberWords;
    }


}



