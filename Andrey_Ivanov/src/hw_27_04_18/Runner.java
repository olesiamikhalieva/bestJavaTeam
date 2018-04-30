package hw_27_04_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {

        String number = "+436541789852";

        Pattern p = Pattern.compile("^\\++(((1|7)\\d{11})?((27|31|33|41|48|61)\\d{10})?" +
                "((371|357)\\d{9})?(30\\d{11})?((380|351|966|420|375)\\d{10})?" +
                "(995\\d{9,11})?(49\\d{7,11})?((353|358)\\d{8,12})?(44\\d{9,11})?" +
                "((32|36)\\d{8,9})?(372\\d{7,8})?(39\\d{9,10})?(961\\d{6,8})?(971\\d{6,9})?(43\\d{5,12})?)$");
        Matcher m = p.matcher(number);
        if (m.find()) {
            System.out.println("Номер введен верно:" + m.group());
        } else {
            System.out.println("Рус.: Номер телефона введен не корректно.");
            System.out.println("Укр.: Номер телефону введено не коректно.");
        }
    }
}

