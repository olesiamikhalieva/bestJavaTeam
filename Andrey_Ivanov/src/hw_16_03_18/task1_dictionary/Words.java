package hw_16_03_18.task1_dictionary;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Words {

    String[] massWords = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
    Set<String> wordsList = new HashSet<>();

    Set<String> getWords() {
        wordsList.addAll(Arrays.asList(massWords));
        return wordsList;

    }

}
