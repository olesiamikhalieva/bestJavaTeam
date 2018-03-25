package hw_24_03_18.Dictionary;

public class Runner {
    public static void main(String[] args) {
        Dictionary d1 = new Dictionary(1);
        System.out.println();
        Dictionary d2 = new Dictionary(2);
        System.out.println("__________________");
        Dictionary dictionary = new Dictionary();
        System.out.println("dictionary size: "+dictionary.dictionaryWordsList.dictionarySize());

        LearnedWords learnedWords = new LearnedWords();
        String learnedWord1 = "wood";
        String learnedWord2 = "one";
        String learnedWord3 = "two";
        learnedWords.addLearnedWordsToLIst(learnedWord1);
        learnedWords.addLearnedWordsToLIst(learnedWord2);
        learnedWords.addLearnedWordsToLIst(learnedWord3);
        dictionary.deleteWordFromDictionary(learnedWord1);
        dictionary.deleteWordFromDictionary(learnedWord2);
        dictionary.deleteWordFromDictionary(learnedWord3);
        System.out.println("Show learned words:");
        learnedWords.showLearnedWords();
        System.out.println("learnedWordsList size: "+learnedWords.learnedWordListSize());
        System.out.println("dictionary size: "+dictionary.dictionaryWordsList.dictionarySize());

        System.out.println();
        String wordToTranslateEngRus = "four";
        dictionary.dictionaryWordsList.translateEngRus(wordToTranslateEngRus);
        String wordToTranslateRusEng = "пять";
        dictionary.dictionaryWordsList.translateRusEng(wordToTranslateRusEng);
        learnedWords.translateEngRus("wood");
        learnedWords.translateRusEng("один");

    }

}
