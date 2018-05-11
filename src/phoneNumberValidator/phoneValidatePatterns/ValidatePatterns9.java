package com.ab.api_pulsar.utils.phoneNumberValidator.phoneValidatePatterns;

import com.ab.api_pulsar.utils.phoneNumberValidator.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Если номер начинается с “+43” количество всех символов в номере должно
быть от 7 до 14 включительно.*/
public class ValidatePatterns9 implements ValidatePhoneNumber {
    @Override
    public String validate(String number) {
        Pattern p = Pattern.compile("^\\+(43\\d{4,11})$");
        Matcher m = p.matcher(number);
        if (m.matches()) {
            return number;
        }
        return null;
    }
}
