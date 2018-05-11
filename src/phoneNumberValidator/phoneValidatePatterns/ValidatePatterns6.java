package com.ab.api_pulsar.utils.phoneNumberValidator.phoneValidatePatterns;

/*Если номер начинается с "+39" тогда количество всех символов в номере
должно быть от 11 до 12 включительно.*/

import com.ab.api_pulsar.utils.phoneNumberValidator.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePatterns6 implements ValidatePhoneNumber {
    @Override
    public String validate(String number) {
        Pattern p = Pattern.compile("^\\+(39\\d{8,9})$");
        Matcher m = p.matcher(number);
        if (m.matches()) {
            return number;
        }
        return null;
    }
}
