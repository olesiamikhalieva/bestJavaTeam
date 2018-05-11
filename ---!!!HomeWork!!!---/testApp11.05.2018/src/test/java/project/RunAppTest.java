package project;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunAppTest {

    //номер должен начинаться с +
    @Test
    public void test_check_number_of_start() {
        assertFalse(ValidationNumber.checkValidationNumber("380689021465"));
    }

    //номер не должен начинаться с +0
    @Test
    public void test_check_number_of_start_not_zero() {
        assertFalse(ValidationNumber.checkValidationNumber("+06541384775"));
    }

    //после + должно быть не более 13 цифр
    @Test
    public void test_after_plus_of_13_digit() {
        assertFalse(ValidationNumber.checkValidationNumber("+61234567891234")); //14 цифр
        assertFalse(ValidationNumber.checkValidationNumber("+123456")); //6 цифр
    }

    //Если номер начинается с “+7”, “+371”, “+357”, "+1", “+31”, “+27”, “+33”, “+41”,
    //“+48”, "+61" тогда количество всех символов в номере должно быть ровно
    //12.
    @Test
    public void test_number_has_12_digit() {
        assertTrue("error", ValidationNumber.checkValidationNumber("+71234567891"));
    }

    //Если номер начинается с “+380”, “+351”, “+30”, "+966", "+420", "+375"
//количество всех символов в номере должно быть ровно 13.
    @Test
    public void test_number_has_of_13_symbols_if_start_380() {
        assertTrue(ValidationNumber.checkValidationNumber("+380960456680"));
    }

    //если номер начинается с “+995” тогда в номере количество всех символов
//должно быть от 12 до 14 включительно.
    @Test
    public void test_number_has_of_12_to_14_symbols_if_start_995() {
        assertTrue(ValidationNumber.checkValidationNumber("+9951234567894"));
        assertTrue(ValidationNumber.checkValidationNumber("+99512345678"));
    }

    //Если номер начинается с “+49”, "+353", “+358” тогда количество всех
    //символов в номере должно быть от 9 до 13 включительно.
    @Test
    public void test_number_has_of_9_to_13_symbols_if_start_49() {
        assertTrue(ValidationNumber.checkValidationNumber("+49123456"));
        assertTrue(ValidationNumber.checkValidationNumber("+491234567894"));
    }

    //Если номер начинается с “+44” тогда количество всех символов в номере
    //должно быть от 11 до 13 включительно.
    @Test
    public void test_number_has_of_11_to_13_symbols_if_start_44() {
        assertTrue(ValidationNumber.checkValidationNumber("+4412345647"));
        assertTrue(ValidationNumber.checkValidationNumber("+441234567894"));
    }

    //Если номер начинается с “+32”, “+36”, “+372” тогда количество всех
//символов в номере должно быть от 10 до 11 включительно.
    @Test
    public void test_number_has_of_10_to_11_symbols_if_start_32() {
        assertTrue(ValidationNumber.checkValidationNumber("+324567810"));
        assertTrue(ValidationNumber.checkValidationNumber("+3634567811"));
    }

    //Если номер начинается с "+39" тогда количество всех символов в номере
    //должно быть от 11 до 12 включительно.
    @Test
    public void test_number_has_of_11_to_12_symbols_if_start_39() {
        assertTrue(ValidationNumber.checkValidationNumber("+3912345611"));
        assertTrue(ValidationNumber.checkValidationNumber("+39345678112"));
    }

    //Если номер начинается с "+961" тогда количество всех символов в номере
//должно быть от 9 до 11 включительно.
    @Test
    public void test_number_has_of_9_to_11_symbols_if_start_961() {
        assertTrue(ValidationNumber.checkValidationNumber("+96156789"));
        assertTrue(ValidationNumber.checkValidationNumber("+9615678911"));
    }

    //Если номер начинается с "+971" тогда количество всех символов в номере
//должно быть от 9 до 12 включительно.
    @Test
    public void test_number_has_of_9_to_12_symbols_if_start_971() {
        assertTrue(ValidationNumber.checkValidationNumber("+97156789"));
        assertTrue(ValidationNumber.checkValidationNumber("+97156789112"));
    }

    //Если номер начинается с “+43” количество всех символов в номере должно
    //быть от 7 до 14 включительно.
    @Test
    public void test_number_has_of_7_to_14_symbols_if_start_43() {
        assertTrue(ValidationNumber.checkValidationNumber("+434567"));
        assertTrue(ValidationNumber.checkValidationNumber("+4345678910114"));
    }
//проверим, пропустит ли символы.
    @Test
    public void est_number_has_of_7_to_14_symbols_if_start_43() {
        assertFalse(ValidationNumber.checkValidationNumber("+фыврмрге"));
        assertFalse(ValidationNumber.checkValidationNumber("+78weffd"));
    }
}