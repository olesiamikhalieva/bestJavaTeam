package hw_16_03_18;

import java.util.*;

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
        }
//        через массив
// HashSet<String>hashSet = new HashSet<>(words.getWords());
//        Iterator<String> iterator = hashSet.iterator();
//        String[][] mass = new String[3][4];
//        while (iterator.hasNext()){
//        mass[0][0] = iterator.next();
//        mass[0][1] = iterator.next();
//        mass[0][2] = iterator.next();
//        mass[0][3] = iterator.next();
//        mass[1][0] = wordTranslation.getWordTranslation(mass[0][0]);
//        mass[1][1] = wordTranslation.getWordTranslation(mass[0][1]);
//        mass[1][2] = wordTranslation.getWordTranslation(mass[0][2]);
//        mass[1][3] = wordTranslation.getWordTranslation(mass[0][3]);
//        mass[2][0] = wordTranscriptionInRussia.getWordTranscriptionInRussia(mass[0][0]);
//        mass[2][1] = wordTranscriptionInRussia.getWordTranscriptionInRussia(mass[0][1]);
//        mass[2][2] = wordTranscriptionInRussia.getWordTranscriptionInRussia(mass[0][2]);
//        mass[2][3] = wordTranscriptionInRussia.getWordTranscriptionInRussia(mass[0][3]);}
//        for (int i = 0; i<3; i++){
//            for (int j =0; j<4; j++){
//                System.out.print("\t"+mass[i][j]+"\t");
//            }
//            System.out.println();
//        }
//
//    }
//        for (int i = 0; i < numberWords; i++) {
//            this.word = iterator.next();
//
//            if (a == 1) {
//                System.out.println(word + "\t-\t" + wordTranslation.getWordTranslation(word) + "\t-\t" + wordTranscriptionInRussia.getWordTranscriptionInRussia(word));
//            } else if (a == 2) {
//                System.out.println(word + "\t-\t" + wordTranslation.getWordTranslation(word));
//            } else {
//                System.out.println("You can choice 1 or 2.");
//                System.out.println("1 - word + russian transcription + translation;");
//                System.out.println("2 - word + translation.");
//            }
//        }


    }
    public String getWord() {
        return word;
    }

    public int getNumberWords() {
        return numberWords;
    }


}



