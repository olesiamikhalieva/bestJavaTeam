package com.ab.api_pulsar.utils.phoneNumberValidator.phoneValidatePatterns;

import com.ab.api_pulsar.utils.phoneNumberValidator.ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


/*Если номер начинается с “+7”, “+371”, “+357”, "+1", “+31”, “+27”, “+33”, “+41”,
    “+48”, "+61" тогда количество всех символов в номере должно быть ровно
    12.*/
public class ValidatePatterns1 implements ValidatePhoneNumber {

    @Override
    public String validate(String number) {
        Pattern pattern = Pattern.compile("^\\+(((1|7)\\d{10})?((27|31|33|41|48|61)\\d{9})?((371|357)\\d{8})?)$");
        Matcher matcher = pattern.matcher(number);
        if (matcher.matches()) {
            return number;
        }
        return null;
    }
}
