import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckTelNomerTest {


    private CheckTelNomer checkTelNomer;

    @Before
    public void initTest() {
        checkTelNomer = new CheckTelNomer();
    }

    /*Если номер начинается с “+7”, “+371”, “+357”, "+1", “+31”, “+27”, “+33”, “+41”,
    “+48”, "+61" тогда количество всех символов в номере должно быть ровно
    12.*/
    @Test
    public void checkNum1Test(String nomer) {
        initTest();
        int actual = checkTelNomer.checkNum1(nomer);
        System.out.println("Number to check conditions: " + nomer + " - " + nomer.length() + " symbols");
        assertTrue("Номер телефона введен не корректно.", actual == 12);
    }

    /*Если номер начинается с “+995” тогда в номере количество всех символов
    должно быть от 12 до 14 включительно.*/
    @Test
    public void checkNum2Test(String nom) {
        initTest();
        int actual = checkTelNomer.checkNum2(nom);
        System.out.println("Number to check conditions: " + nom + " - " + nom.length() + " symbols");
        assertTrue("Номер телефона введен не корректно.", actual > 0);
    }

    /*Если номер начинается с “+49”, "+353", “+358” тогда количество всех
символов в номере должно быть от 9 до 13 включительно.*/
    @Test
    public void checkNum3Test(String nom) {
        initTest();
        int actual = checkTelNomer.checkNum3(nom);
        System.out.println("Number to check conditions: " + nom + " - " + nom.length() + " symbols");
        assertTrue("Номер телефона введен не корректно.", actual > 0);
    }

    /*Если номер начинается с “+44” тогда количество всех символов в номере
должно быть от 11 до 13 включительно.*/
    @Test
    public void checkNum4Test(String nom) {
        initTest();
        int actual = checkTelNomer.checkNum4(nom);
        System.out.println("Number to check conditions: " + nom + " - " + nom.length() + " symbols");
        assertTrue("Номер телефона введен не корректно.", actual > 0);
    }

    /*Если номер начинается с “+32”, “+36”, “+372” тогда количество всех
символов в номере должно быть от 10 до 11 включительно.*/
    @Test
    public void checkNum5Test(String nom) {
        initTest();
        int actual = checkTelNomer.checkNum5(nom);
        System.out.println("Number to check conditions: " + nom + " - " + nom.length() + " symbols");
        assertTrue("Номер телефона введен не корректно.", actual > 0);
    }

    /*Если номер начинается с "+39" тогда количество всех символов в номере
должно быть от 11 до 12 включительно.*/
    @Test
    public void checkNum6Test(String nom) {
        initTest();
        int actual = checkTelNomer.checkNum6(nom);
        System.out.println("Number to check conditions: " + nom + " - " + nom.length() + " symbols");
        assertTrue("Номер телефона введен не корректно.", actual > 0);
    }

    /*Если номер начинается с "+961" тогда количество всех символов в номере
должно быть от 9 до 11 включительно.*/
    @Test
    public void checkNum7Test(String nom) {
        initTest();
        int actual = checkTelNomer.checkNum7(nom);
        System.out.println("Number to check conditions: " + nom + " - " + nom.length() + " symbols");
        assertTrue("Номер телефона введен не корректно.", actual > 0);
    }

    /*Если номер начинается с "+971" тогда количество всех символов в номере
должно быть от 9 до 12 включительно.*/
    @Test
    public void checkNum8Test(String nom) {
        initTest();
        int actual = checkTelNomer.checkNum8(nom);
        System.out.println("Number to check conditions: " + nom + " - " + nom.length() + " symbols");
        assertTrue("Номер телефона введен не корректно.", actual > 0);
    }

    /*Если номер начинается с “+43” количество всех символов в номере должно
быть от 7 до 14 включительно.*/
    @Test
    public void checkNum9Test(String nom) {
        initTest();
        int actual = checkTelNomer.checkNum9(nom);
        System.out.println("Number to check conditions: " + nom + " - " + nom.length() + " symbols");
        assertTrue("Номер телефона введен не корректно.", actual > 0);
    }
}