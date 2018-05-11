package Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
    public static void main(String[] args) throws Exception {
        String input = "Hello world! Hello Java!";
        Pattern pattern = Pattern.compile("Hello");
        Matcher matcher = pattern.matcher(input);

        System.out.println(matcher.find()); // возвращает тру, если подстрока найдена
        System.out.println(matcher.group()); // если в строке найден кусок строки вернет єту подстроку
        String s = matcher.group();
        System.out.println(s.toUpperCase());

        System.out.println(matcher.start());
        System.out.println(matcher.end());

        String s1 = matcher.replaceAll("Bye");
        System.out.println(s1);
//---------------------------------------------------------------------------------------

        System.out.println("\n Второй пример \n");
        String input1 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern1 = Pattern.compile("Java(\\w*)"); // возвращает подстроку и все что после нее
        Matcher matcher1 = pattern1.matcher(input1);
        while (matcher1.find()) {
            System.out.println(matcher1.group());
        }

//---------------------------------------------------------------------------------------
        System.out.println("\nТретий пример\n");
        String input3 = "Hello Java! Hello JavaScript! JavaSE 8.";
        Pattern pattern3 = Pattern.compile("[ ,.!]"); // создает патерн по заданным символам
        //Pattern pattern3 = Pattern.compile("\\s*(\\s|,|!|\\.)\\s*");
        String[] words = pattern3.split(input3);
        for(String word:words)
            System.out.println(word);
    }


}

