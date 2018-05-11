package com.ab.api_pulsar.utils.phoneNumberValidator;

import com.ab.api_pulsar.utils.phoneNumberValidator.phoneValidatePatterns.*;

import java.util.HashMap;
import java.util.Map;


public class ValidatorRunner {

    private static HashMap<Enum, ValidatePhoneNumber> hashMap;

    static {
        hashMap = new HashMap<>();
        hashMap.put(NumberEnumVariable.CHECK1, new ValidatePatterns1());
        hashMap.put(NumberEnumVariable.CHECK2, new ValidatePatterns2());
        hashMap.put(NumberEnumVariable.CHECK3, new ValidatePatterns3());
        hashMap.put(NumberEnumVariable.CHECK4, new ValidatePatterns4());
        hashMap.put(NumberEnumVariable.CHECK5, new ValidatePatterns5());
        hashMap.put(NumberEnumVariable.CHECK6, new ValidatePatterns6());
        hashMap.put(NumberEnumVariable.CHECK7, new ValidatePatterns7());
        hashMap.put(NumberEnumVariable.CHECK8, new ValidatePatterns8());
        hashMap.put(NumberEnumVariable.CHECK9, new ValidatePatterns9());
    }

    public static void main(String[] args) {

        String number = "+380990797833";
        String checker = null;

        if (NumberEnumVariable.find(findPatternByNumberSubstring4sibmol(number)) != null) {
            checker = findPatternByNumberSubstring4sibmol(number);
        } else if (NumberEnumVariable.find(findPatternByNumberSubstring3sibmol(number)) != null) {
            checker = findPatternByNumberSubstring3sibmol(number);
        } else if (NumberEnumVariable.find(findPatternByNumberSubstring2sibmol(number)) != null) {
            checker = findPatternByNumberSubstring2sibmol(number);
        }

        System.out.println(checker);
        System.out.println("\n-->  " + phoneValidator(number, checker));
    }

    private static String findPatternByNumberSubstring4sibmol(String number) {
        return number.substring(0, 4);
    }

    private static String findPatternByNumberSubstring3sibmol(String number) {
        return number.substring(0, 3);
    }

    private static String findPatternByNumberSubstring2sibmol(String number) {
        return number.substring(0, 2);
    }

    private static String phoneValidator(String number, String np) {
        for (Map.Entry<Enum, ValidatePhoneNumber> entry : hashMap.entrySet()) {
            System.out.print("validate patterns: " + entry.getKey() + ", ");
            if (NumberEnumVariable.find(np) != null && entry.getKey().equals(NumberEnumVariable.find(np))) {
                System.out.println("\n use validator pattern ->" + entry.getKey());
                if (entry.getValue().validate(number) != null) {
                    return number;
                } else {
                    return null;
                }
            }
        }
        return null;
    }
}
