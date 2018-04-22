package hw_22_04_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Написать регулярное выражение которое проверяет корректность номера.
Он правильный только если записан в формате +38 0..... и содержит правильное количество цифр украинского оператора связи.
 */
public class Phone {
    public static void main(String[] args) {
        System.out.println(isNumberCorrect("+380982646025"));
        System.out.println(isNumberCorrect("380982646025"));
        System.out.println(isNumberCorrect("+38098264o025"));
    }
    private static boolean isNumberCorrect(String number){
        Pattern p = Pattern.compile("^(\\+380)\\d\\d\\d\\d\\d\\d\\d\\d\\d$");
        Matcher m = p.matcher(number);
        return m.matches();
    }
}
