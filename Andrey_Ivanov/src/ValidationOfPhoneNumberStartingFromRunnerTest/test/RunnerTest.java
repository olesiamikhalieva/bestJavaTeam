import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RunnerTest {

    static CheckTelNomerTest checkTelNomerTest;
    static CheckTelNomer checkTelNomer;

    public static void main(String[] args) {

        checkTelNomer = new CheckTelNomer();
        String nomerTest = "+12365874521";
        String nomer = checkTelNomer.numberFormatting(nomerTest);//форматирование входящего номера
        testSelection(nomer);
    }

    public static void testSelection(String nomer) {
        checkTelNomerTest = new CheckTelNomerTest();
        /*Если номер начинается с “+7”, “+371”, “+357”, "+1", “+31”, “+27”, “+33”, “+41”,
    “+48”, "+61" тогда количество всех символов в номере должно быть ровно
    12.*/
        if (nomer.substring(1, 4).equals("371") || (nomer.substring(1, 4).equals("357") ||
                nomer.substring(1, 3).equals("27") || nomer.substring(1, 3).equals("31") ||
                nomer.substring(1, 3).equals("33") || nomer.substring(1, 3).equals("41") ||
                nomer.substring(1, 3).equals("48") || nomer.substring(1, 3).equals("48") ||
                nomer.substring(1, 3).equals("61") || nomer.substring(1, 2).equals("1") ||
                nomer.substring(1, 2).equals("7"))) {
            checkTelNomerTest.checkNum1Test(nomer);

            /*Если номер начинается с “+995” тогда в номере количество всех символов
    должно быть от 12 до 14 включительно.*/
        } else if (nomer.substring(1, 4).equals("995")) {
            checkTelNomerTest.checkNum2Test(nomer);

            /*Если номер начинается с “+49”, "+353", “+358” тогда количество всех
символов в номере должно быть от 9 до 13 включительно.*/
        } else if (nomer.substring(1, 4).equals("353") || (nomer.substring(1, 4).equals("358") ||
                nomer.substring(1, 3).equals("49"))) {
            checkTelNomerTest.checkNum3Test(nomer);

            /*Если номер начинается с “+44” тогда количество всех символов в номере
должно быть от 11 до 13 включительно.*/
        } else if (nomer.substring(1, 3).equals("44")) {
            checkTelNomerTest.checkNum4Test(nomer);

            /*Если номер начинается с “+32”, “+36”, “+372” тогда количество всех
символов в номере должно быть от 10 до 11 включительно.*/
        } else if (nomer.substring(1, 4).equals("372") || (nomer.substring(1, 3).equals("36") ||
                nomer.substring(1, 3).equals("32"))) {
            checkTelNomerTest.checkNum5Test(nomer);

           /*Если номер начинается с "+39" тогда количество всех символов в номере
должно быть от 11 до 12 включительно.*/
        } else if (nomer.substring(1, 3).equals("39")) {
            checkTelNomerTest.checkNum6Test(nomer);

          /*Если номер начинается с "+961" тогда количество всех символов в номере
должно быть от 9 до 11 включительно.*/
        } else if (nomer.substring(1, 4).equals("961")) {
            checkTelNomerTest.checkNum7Test(nomer);

           /*Если номер начинается с "+971" тогда количество всех символов в номере
должно быть от 9 до 12 включительно.*/
        } else if (nomer.substring(1, 4).equals("971")) {
            checkTelNomerTest.checkNum8Test(nomer);

            /*Если номер начинается с “+43” количество всех символов в номере должно
быть от 7 до 14 включительно.*/
        } else if (nomer.substring(1, 3).equals("43")) {
            checkTelNomerTest.checkNum9Test(nomer);
        } else {
            System.out.println("Номер не соответствует никакому условию: " + nomer);
        }
    }
}