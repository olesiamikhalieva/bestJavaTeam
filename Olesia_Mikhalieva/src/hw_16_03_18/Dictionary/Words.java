package hw_16_03_18;

import java.util.HashSet;
import java.util.Set;

public class Words {

    private static Set<String> wordsList = new HashSet<>(40);


    public HashSet<String> getWords() {
        wordsList.add("animal");
        wordsList.add("wood");
        wordsList.add("mouse");
        wordsList.add("number");
        wordsList.add("one");
        wordsList.add("two");
        wordsList.add("three");
        wordsList.add("four");
        wordsList.add("five");
        wordsList.add("six");
        wordsList.add("seven");
        wordsList.add("eight");
        wordsList.add("nine");
        wordsList.add("ten");
        wordsList.add("thousand");
        wordsList.add("hundred");
        wordsList.add("tree");
        wordsList.add("door");
        wordsList.add("sun");
        wordsList.add("green");
        wordsList.add("chocolate");
        wordsList.add("dream");
        wordsList.add("dog");
        wordsList.add("cat");
        wordsList.add("link");
        wordsList.add("laptop");
        wordsList.add("course");
        wordsList.add("summer");
        wordsList.add("winter");
        wordsList.add("spring");
        wordsList.add("autumn");
        wordsList.add("water");
        wordsList.add("iron");
        wordsList.add("bed");
        wordsList.add("bad");
        wordsList.add("good");
        wordsList.add("in");
        wordsList.add("mobile");
        wordsList.add("pen");
        wordsList.add("window");
        return (HashSet<String>) wordsList;
    }
}
