package hw8_16_02_18.Enum;

import java.util.Arrays;

public class RunEnum {
    public static void main(String[] args) {
        System.out.println(Days.valueOf("MONDAY"));
        System.out.println(Arrays.toString(Days.values()));
        System.out.println(Days.FRIDAY.getAbbriviation());
        String str = "суббота";
        for (Days days : Days.values()) {
            if (str == days.getAbbriviation()){
                System.out.println(days.name());
                System.out.println(days.ordinal());
                System.out.println(days.toString());

            }
        }
    }
}
