package com.ab.api_pulsar.utils.phoneNumberValidator;

import java.util.Arrays;
import java.util.List;

public enum NumberEnumVariable {

    CHECK1("+7","+371","+357","+357","+1","+31","+27","+33","+41","+48","+61"),
    CHECK2("+995"),
    CHECK3("+49", "+353","+358"),
    CHECK4("+44"),
    CHECK5("+32", "+36","+372"),
    CHECK6("+39"),
    CHECK7("+961"),
    CHECK8("+971"),
    CHECK9("+43");

    private final List<String> values;

    NumberEnumVariable(String... values) {
        this.values = Arrays.asList(values);
    }

    public List<String> getValues() {
        return values;
    }

    public static NumberEnumVariable find(String name) {
        for (NumberEnumVariable fields : NumberEnumVariable.values()) {
            //В некоторых случая контейнс не подходит, Н-д: Вр шина.
            //может давать сбой, если в прайсе несколько ценовых столбцов,
            //с использованием контейнса может давать не корректный результат, учитывать этот момент
            if (fields.getValues().contains(name)) {
                return fields;
            }
        }
        return null;
    }

    public static String find2(String name) {
        for (NumberEnumVariable fields : NumberEnumVariable.values()) {
            //В некоторых случая контейнс не подходит, Н-д: Вр шина.
            //может давать сбой, если в прайсе несколько ценовых столбцов,
            //с использованием контейнса может давать не корректный результат, учитывать этот момент
            if (fields.getValues().contains(name)) {
                return fields.name();
            }
        }
        return null;
    }

}
