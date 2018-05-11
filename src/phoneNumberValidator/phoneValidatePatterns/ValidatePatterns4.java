package com.ab.api_pulsar.utils.phoneNumberValidator.phoneValidatePatterns;

import com.ab.api_pulsar.utils.phoneNumberValidator.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Если номер начинается с “+44” тогда количество всех символов в номере
должно быть от 11 до 13 включительно.*/
public class ValidatePatterns4 implements ValidatePhoneNumber {

    @Override
    public String validate(String number) {
        Pattern pattern = Pattern.compile("^\\+((32|36)\\d{7,8})?((372\\d{6,7})?)$");
        Matcher m = pattern.matcher(number);
        if (m.matches()) {
            return number;
        }
        return null;
    }
}
