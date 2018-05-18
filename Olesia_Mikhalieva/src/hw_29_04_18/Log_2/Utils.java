package hw_29_04_18.Log_2;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Utils {
    public static String currentDate() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return now.format(formatter);
    }
}
