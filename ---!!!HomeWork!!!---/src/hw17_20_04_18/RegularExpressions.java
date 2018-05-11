package hw17_20_04_18;

import lombok.Data;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
@Data
public class RegularExpressions {
    public static void main(String[] args) throws Exception {

        System.out.println("Для выхода введите [Й,й,Q,q]");
        Pattern pattern = Pattern.compile("^\\+380\\d{9}$");    // зажаем шаблон... \\+380(должно начинаться с даной комбинации) \\d(ожидает любую цифру) {9}(в количестве 9 символов)
        Pattern pattern1 = Pattern.compile("^[QqйЙ]+$");        // для выхода по соответствующим буквам
        String str;

        while (true) {
            str = getNumber();          //считываем с консоли
            Matcher matcher1 = pattern1.matcher(str);
            if (matcher1.matches()) {   // если да, то завершаем программу
                break;
            }
            Matcher matcher = pattern.matcher(str);
            if (matcher.matches()){
                System.out.println("Вы ввели правильный номер");
            }else {
                System.out.println("Вы ввели неверный номер, повторите");
            }
        }
    }

    public static String getNumber() {

        System.out.println("Введите номер телефона: ");
        Scanner sc = new Scanner(System.in);    // считываем номер телефона с консоли
        String str = sc.nextLine();
        return str;                             // возвращаем строку с номером телефона

    }
}