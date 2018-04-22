package hw_20_04_18;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Runner {
    public static void main(String[] args) {
        String num1 = "+380671254789";
        String num2 = "1212+380961235478";
        String num3 = "+38068df2345787";
        String num4 = "+38067977461687899";
        String num5 = "+380501487592";
        String num6 = "+938050217979754";
        Pattern p = Pattern.compile("^\\+380(67|97|50|63|93|68|98)\\d{7}$");
        String[] massNumber = {num1, num2, num3, num4, num5, num6};
        for (int i = 0; i < massNumber.length; i++) {
            Matcher m = p.matcher(massNumber[i]);
            if (m.find()) {
                System.out.println("Строка " + "num" + (i + 1) + "-номер украинского оператора связи:" + m.group());
            } else {
                System.out.println("Строка " + "num" + (i + 1) + " НЕВЕРНЫЙ формат номера:" + massNumber[i]);
            }
        }
    }
}