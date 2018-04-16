package hw16_06_04_18;

public class RunReflection {
    public static void main(String[] args) throws Exception {

        Reflection reflection = new Reflection();

        Utils.showAllField(reflection);         // просмотрим все поля
        Utils.upStringFields(reflection);       // все стринговые поля в верхний регистр
        Utils.showAllField(reflection);         // просмотрим все поля
        Utils.downStringFields(reflection);     //все стринговые поля в нижний регистр
        Utils.showAllField(reflection);         // просмотрим все поля

    }
}

