package hw_29_04_18.Phone;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PhoneTest {
    //language: ru, ukr
    String language = "ru";
    Phone phone;


    @Before
    public void setUp() throws Exception {
        phone = new Phone(null, language);
    }

    @After
    public void tearDown() throws Exception {
        phone = null;
    }


    @Test
    public void ifBeginWithPlus() {
        phone.number = "+h";
        assertEquals(0, phone.ifBeginWithPlus());
        phone.number = "a";
        assertEquals(1, phone.ifBeginWithPlus());
    }

    @Test
    public void ifSecondNumberIsNumber() {
        phone.number = "q8";
        assertEquals(0, phone.ifSecondNumberIsNumber());
        phone.number = "+r";
        assertEquals(1, phone.ifSecondNumberIsNumber());
    }

    @Test
    public void ifNumberIsPlusNumbersMax13() {
        phone.number = "+0000000000000";
        assertEquals(0, phone.ifNumberIsPlusNumbersMax13());
        phone.number = "+uhkj;k;k';l;456789";
        assertEquals(1, phone.ifNumberIsPlusNumbersMax13());
    }

    @Test
    public void ifNotBeginWithPlusNull() {
        phone.number = "+0";
        assertEquals(1, phone.ifNotBeginWithPlusNull());
        phone.number = "+9";
        assertEquals(0, phone.ifNotBeginWithPlusNull());
    }

    @Test
    public void allNumbers12() {
        phone.number = "+35799999999999";
        assertEquals(1, phone.allNumbers12());
        phone.number = "+35777777777";
        assertEquals(0, phone.allNumbers12());
    }

    @Test
    public void allNumbers13() {
        phone.number = "+38599999999999";
        assertEquals(1, phone.allNumbers13());
        phone.number = "+380777777777";
        assertEquals(0, phone.allNumbers13());
    }

    @Test
    public void allNumbersFrom12To14() {
        phone.number = "+9559999";
        assertEquals(1, phone.allNumbersFrom12To14());
        phone.number = "+955777777777";
        assertEquals(0, phone.allNumbersFrom12To14());
    }

    @Test
    public void allNumbersFrom9To13() {
        phone.number = "+49999";
        assertEquals(1, phone.allNumbersFrom9To13());
        phone.number = "+353909090";
        assertEquals(0, phone.allNumbersFrom9To13());
    }

    @Test
    public void allNumbersFrom11To13() {
        phone.number = "+44";
        assertEquals(1, phone.allNumbersFrom11To13());
        phone.number = "+440000000000";
        assertEquals(0, phone.allNumbersFrom11To13());
    }

    @Test
    public void allNumbersFrom10To11() {
        phone.number = "+32";
        assertEquals(1, phone.allNumbersFrom10To11());
        phone.number = "+3200000000";
        assertEquals(0, phone.allNumbersFrom10To11());
    }

    @Test
    public void allNumbersFrom11To12() {
        phone.number = "+39";
        assertEquals(1, phone.allNumbersFrom11To12());
        phone.number = "+39000000000";
        assertEquals(0, phone.allNumbersFrom11To12());
    }

    @Test
    public void allNumbersFrom9To11() {
        phone.number = "+961";
        assertEquals(1, phone.allNumbersFrom9To11());
        phone.number = "+9610000000";
        assertEquals(0, phone.allNumbersFrom9To11());
    }

    @Test
    public void allNumbersFrom9To12() {
        phone.number = "+971";
        assertEquals(1, phone.allNumbersFrom9To12());
        phone.number = "+971000000";
        assertEquals(0, phone.allNumbersFrom9To12());
    }

    @Test
    public void allNumbersFrom7To14() {
        phone.number = "+43";
        assertEquals(1, phone.allNumbersFrom7To14());
        phone.number = "+4300000000";
        assertEquals(0, phone.allNumbersFrom7To14());
    }
}