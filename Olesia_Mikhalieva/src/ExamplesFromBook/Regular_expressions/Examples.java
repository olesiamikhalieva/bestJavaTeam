package ExamplesFromBook.Regular_expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Examples {
    public static void main(String[] args) {
        //поиск соответствий шаблону в тексте
        String input = "Hello";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(input);
        boolean found = matcher.matches();
        if (found)
            System.out.println("Найдено");
        else
            System.out.println("Не найдено");


        //нахождением отдельных совпадений в строке
        String input1 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern1 = Pattern.compile("Java(\\w*)");//after Java может находиться любое количество алфавитно-цифровых символов
        Matcher matcher1 = pattern1.matcher(input);
        while (matcher1.find())
            System.out.println(matcher1.group());

//разделение строки на массив подстрок по определенному разделителю
        String input2 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern2 = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");// without spaces. String split can make this too.
        String[] words = pattern2.split(input2);
        for(String word:words)
            System.out.println(word);
    }
}
