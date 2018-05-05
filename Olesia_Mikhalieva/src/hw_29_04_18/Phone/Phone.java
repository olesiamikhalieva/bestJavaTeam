package hw_29_04_18.Phone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
В случае, если номер телефона введен некорректно, отображается ошибка:
*/

public class Phone {
    int flag;
    String number;
    String language;

    public Phone(String number, String language) {
        this.language = language;
        this.number = number;
    }

    public void numberFormat() {
        number = number.replaceAll("\\s+","");
    }

    public void testNumber() {
        numberFormat();
        if ((ifBeginWithPlus() + ifSecondNumberIsNumber() + ifNumberIsPlusNumbersMax13() + ifNotBeginWithPlusNull() + allNumbers12() + allNumbers13() +
                allNumbersFrom12To14() + allNumbersFrom9To13() + allNumbersFrom11To13() + allNumbersFrom10To11() +
                allNumbersFrom11To12() + allNumbersFrom9To11() + allNumbersFrom9To12() + allNumbersFrom7To14()) != 0) {
            messageAfterTestNumber();
        }
    }



/*
Ошибка в зависимости от выбранного языка
● Рус.: Номер телефона введен не корректно.
● Укр.: Номер телефону введено не коректно.
 */

    private void messageAfterTestNumber() {
        if (language.matches("ru")) {
            System.out.println("Номер телефона введен не корректно.");
        } else if (language.matches("ukr")) {
            System.out.println("Номер телефону введено не коректно.");
        }
    }

    /*
● Номер должен начинаться с “+”.
*/

    public int ifBeginWithPlus() {
        Pattern p = Pattern.compile("^(\\+.+)$");
        Matcher m = p.matcher(number);
        if (m.matches()) {
            flag = 0;
        } else {
            flag = 1;
        }
        return flag;
    }


    /*
● После “+” НЕ может быть букв или каких либо других символов кроме цифр
от 0 до 9.*/

    public int ifSecondNumberIsNumber() {
        Pattern p = Pattern.compile("^.\\d*$");
        Matcher m = p.matcher(number);
        if (m.matches()) {
            flag = 0;
        } else {
            flag = 1;
        }
        return flag;
    }


    /*
● После “+” может быть максимум 13 цифр.
     */

    public int ifNumberIsPlusNumbersMax13() {
        Pattern p = Pattern.compile("^\\+\\d{2,13}$");
        Matcher m = p.matcher(number);
        if (m.matches()) {
            flag = 0;
        } else {
            flag = 1;
        }
        return flag;
    }

    /*
    ● Номер НЕ может начинаться с “+0”.
     */
    public int ifNotBeginWithPlusNull() {
        Pattern p = Pattern.compile("^(\\+0)(\\d*)$");
        Matcher m = p.matcher(number);
        if (m.matches()) {
            flag = 1;
        } else {
            flag = 0;
        }
        return flag;
    }

    /*
● Если номер начинается с “+7”, “+371”, “+357”, "+1", “+31”, “+27”, “+33”, “+41”,
“+48”, "+61" тогда количество всех символов в номере должно быть равно 12.
     */

    public int allNumbers12() {
        Boolean v1 = Pattern.compile("^((\\+)(7||371||357||1||31||27||33||41||48||61))(\\d*)$").matcher(number).find();
        if (v1) {
            Pattern p2 = Pattern.compile("^\\+(\\d{11})$");
            Matcher m2 = p2.matcher(number);
            if (m2.matches()) {
                flag = 0;
            } else {
                flag = 1;
            }
        } else flag = 0;
        return flag;
    }

    /*
● Если номер начинается с “+380”, “+351”, “+30”, "+966", "+420", "+375"
количество всех символов в номере должно быть ровно 13.
     */

    public int allNumbers13() {
        Boolean v1 = Pattern.compile("^(\\+)(380||351||30||966||420||375)(\\d*)$").matcher(number).find();
        if (v1) {
            Pattern p2 = Pattern.compile("^\\+(\\d{12})$");
            Matcher m2 = p2.matcher(number);
            if (m2.matches()) {
                flag = 0;
            } else {
                flag = 1;
            }
        } else flag = 0;
        return flag;
    }
    /*
● Если номер начинается с “+995” тогда в номере количество всех символов
должно быть от 12 до 14 включительно.
     */

    public int allNumbersFrom12To14() {
        Boolean v1 = Pattern.compile("^(\\+955)(\\d{8,10})$").matcher(number).find();
        if (v1) {
                flag = 0;
            } else {
                flag = 1;
            }
        return flag;
    }

    /*
● Если номер начинается с “+49”, "+353", “+358” тогда количество всех
символов в номере должно быть от 9 до 13 включительно.
     */

    public int allNumbersFrom9To13() {
        Boolean v1 = Pattern.compile("^(\\+)(49||353||358)(\\d*)$").matcher(number).find();
        if (v1) {
            Pattern p2 = Pattern.compile("^\\+(\\d{8,12})$");
            Matcher m2 = p2.matcher(number);
            if (m2.matches()) {
                flag = 0;
            } else {
                flag = 1;
            }
        } else flag = 0;
        return flag;
    }

        /*
● Если номер начинается с “+44” тогда количество всех символов в номере
должно быть от 11 до 13 включительно.
     */

    public int allNumbersFrom11To13() {
        Boolean v1 = Pattern.compile("^(\\+44)(\\d{8,10})$").matcher(number).find();
        if (v1) {
                flag = 0;
            } else {
                flag = 1;
            }
        return flag;
    }


 /*
● Если номер начинается с “+32”, “+36”, “+372” тогда количество всех
    символов в номере должно быть от 10 до 11 включительно.
  */

    public int allNumbersFrom10To11() {
        Boolean v1 = Pattern.compile("^(\\+)(32||36||372)(\\d*)$").matcher(number).find();
        if (v1) {
            Pattern p2 = Pattern.compile("^\\+(\\d{9,10})$");
            Matcher m2 = p2.matcher(number);
            if (m2.matches()) {
                flag = 0;
            } else {
                flag = 1;
            }
        } else flag = 0;
        return flag;
    }

    /*
● Если номер начинается с "+39" тогда количество всех символов в номере
должно быть от 11 до 12 включительно.
     */

    public int allNumbersFrom11To12() {
        Boolean v1 = Pattern.compile("^(\\+39)(\\d{8,9})$").matcher(number).find();
        if (v1) {
                flag = 0;
            } else {
                flag = 1;
            }
        return flag;
    }

    /*
● Если номер начинается с "+961" тогда количество всех символов в номере
должно быть от 9 до 11 включительно.
     */

    public int allNumbersFrom9To11() {
        Boolean v1 = Pattern.compile("^(\\+961)(\\d{5,7})$").matcher(number).find();
        if (v1) {
                flag = 0;
            } else {
                flag = 1;
            }
        return flag;
    }

   /*
● Если номер начинается с "+971" тогда количество всех символов в номере
    должно быть от 9 до 12 включительно.
    */

    public int allNumbersFrom9To12() {
        Boolean v1 = Pattern.compile("^(\\+971)(\\d{5,8})$").matcher(number).find();
        if (v1) {
                flag = 0;
            } else {
                flag = 1;
            }
        return flag;
    }

   /*
 ● Если номер начинается с “+43” количество всех символов в номере должно
    быть от 7 до 14 включительно.
    */

    public int allNumbersFrom7To14() {
        Boolean v1 = Pattern.compile("^(\\+43)(\\d{4,11})$").matcher(number).find();
        if (v1) {
            flag = 0;
        } else {
            flag = 1;
        }
        return flag;
    }


}
