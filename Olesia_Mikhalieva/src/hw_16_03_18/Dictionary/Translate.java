//package hw_16_03_18;
//
//import java.util.ArrayList;
//import java.util.Iterator;
//
//public class Translate {
//    Words words = new Words();
//    WordTranslation wordTranslation = new WordTranslation();
//    WordTranscriptionInRussiaMap wordTranscriptionInRussiaMap = new WordTranscriptionInRussiaMap();
//    ArrayList<String> arrayList = new ArrayList<>();
//    public Translate() {
//        Iterator<String> iterator = words.getWords().iterator();
//        String word = iterator.next();
//        arrayList.add(word);
//        arrayList.add(wordTranscriptionInRussiaMap.getWordTranscriptionInRussia(word));
//        arrayList.add(wordTranslation.getWordTranslation(word));
//}
//public String getTranslate(){
//    Iterator<String> iterator = words.getWords().iterator();
//    String word = iterator.next();
//    arrayList.add(word);
//    arrayList.add();
//    arrayList.add();
//    String translate = word+"\n"+wordTranscriptionInRussiaMap.getWordTranscriptionInRussia(word)+"\n"+wordTranslation.getWordTranslation(word);
//        return translate;
//}
//}
