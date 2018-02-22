package ExamplesFromBook.Comparator;

import java.util.Arrays;

public class MainComparator {
    public static void main(String[] args) {
        String [] friends = {"Peter", "Paul", "Mary"};
        Arrays.sort(friends, new LenghtComparator());
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
