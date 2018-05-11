package com.ab.api_pulsar.utils.phoneNumberValidator.phoneValidatePatterns;

import com.ab.api_pulsar.utils.phoneNumberValidator.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Если номер начинается с “+995” тогда в номере количество всех символов
    должно быть от 12 до 14 включительно.*/
public class ValidatePatterns2 implements ValidatePhoneNumber {

    public String validate(String number) {
        Pattern pattern = Pattern.compile("^\\+((995\\d{8,10}))$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return number;
        }
        return null;
    }


}
