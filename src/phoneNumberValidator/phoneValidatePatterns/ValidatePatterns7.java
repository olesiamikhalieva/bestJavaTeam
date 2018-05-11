package com.ab.api_pulsar.utils.phoneNumberValidator.phoneValidatePatterns;

/*Если номер начинается с "+961" тогда количество всех символов в номере
должно быть от 9 до 11 включительно.*/

import com.ab.api_pulsar.utils.phoneNumberValidator.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidatePatterns7 implements ValidatePhoneNumber {
    @Override
    public String validate(String number) {
        Pattern p = Pattern.compile("^\\+(961\\d{5,7})$");
        Matcher m = p.matcher(number);
        if (m.matches()) {
            return number;
        }
        return null;
    }
}
