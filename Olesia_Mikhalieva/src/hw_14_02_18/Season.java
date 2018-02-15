package hw_14_02_18;

public enum Season {
        WINTER("зима"),
        SPRING("весна"),
        SUMMER("лето"),
        AUTUMN("осень");

        private String translation;


    Season(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }
}



