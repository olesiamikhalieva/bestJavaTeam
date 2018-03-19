package hw_16_03_18;

import java.util.ArrayList;
import java.util.HashSet;

public class MainDictionary {
    public static void main(String[] args) {

        HashSet<Word> words = new HashSet<>();
        words.add(new Word("dictionary", "ˈdikSHəˌnerē", "дикшенери", "словарь"));
        words.add(new Word("duck2","dək2", "дак2", "утка2"));
        words.add(new Word("duck3","dək3", "дак3", "утка3"));
        words.add(new Word("duck4","dək4", "дак4", "утка4"));
        words.add(new Word("duck5","dək5", "дак5", "утка5"));
        words.add(new Word("duck6","dək6", "дак6", "утка6"));
        words.add(new Word("duck7","dək7", "дак7", "утка7"));
        words.add(new Word("duck8","dək8", "дак8", "утка8"));
        words.add(new Word("duck9","dək9", "дак9", "утка9"));
        words.add(new Word("duck10","dək10", "дак10", "утка10"));
        words.add(new Word("duck11","dək11", "дак11", "утка11"));
        words.add(new Word("duck12","dək12", "дак12", "утка12"));

        Dictionary dictionary = new Dictionary(words);

        dictionary.showWord3x3();
    }
}
