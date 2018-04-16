package hw16_06_04_18;

import java.lang.reflect.Field;

public class Utils {

    public static void upStringFields(Object o) throws IllegalAccessException {
        System.out.println("Приводим к нижнему регистру ----------------------");
        Class cls = o.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) { // плдучили все поля
            Class fieldType = field.getType();
            if (fieldType.getName() == "java.lang.String") { // сравнили с типом
                field.set(o, field.get(o).toString().toUpperCase()); // положили новое значение
            }
        }
    }

    public static void downStringFields(Object o) throws IllegalAccessException {
        System.out.println("Приводим к нижнему регистру ---------------------- ");
        Class cls = o.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            if (fieldType.getName() == "java.lang.String") {
                field.set(o, field.get(o).toString().toLowerCase());
            }
        }
    }

    public static void showAllField(Object o) throws IllegalAccessException {
        System.out.println("Все поля данного класса ---------------------- ");
        Class cls = o.getClass();
        Field[] fields = cls.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.get(o));
        }
    }
}
