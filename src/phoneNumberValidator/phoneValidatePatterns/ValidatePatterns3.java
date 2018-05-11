package com.ab.api_pulsar.utils.phoneNumberValidator.phoneValidatePatterns;



import com.ab.api_pulsar.utils.phoneNumberValidator.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*Если номер начинается с “+49”, "+353", “+358” тогда количество всех
символов в номере должно быть от 9 до 13 включительно.*/
public class ValidatePatterns3 implements ValidatePhoneNumber {

    @Override
    public String validate(String number) {
        Pattern pattern = Pattern.compile("^\\+((49\\d{6,10})?((353|358)\\d{5,9})?)$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return number;
        }
        return null;
    }
}
