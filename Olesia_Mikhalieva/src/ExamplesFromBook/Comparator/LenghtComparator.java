package ExamplesFromBook.Comparator;

public class LenghtComparator implements java.util.Comparator<String> {
    @Override
    public int compare(String first, String second) {
        return first.length()-second.length();
    }
}
