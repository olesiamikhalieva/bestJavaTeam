package ht12_13_02_18.t1;

public class Enumerator {
    public enum Enum {
        FIRST("First element"),
        SECOND("Second element"),
        THIRD("Third element"),
        FOURTH("Fourth element"),
        FIFTH("Fifth element");

        private String description;

        private Enum(String description) {
            this.description = description;
        }

        public String getDescription() {return description;}
    };

    public static void main(String[] args) {
        for (Enum s : Enum.values())
            System.out.println(s + ": " + s.getDescription());
        for (Enum s : Enum.values())
            System.out.println(s.ordinal() + ". " + s.getDescription());
        System.out.println(Enum.FIFTH.ordinal() + " " + Enum.FIFTH.name() + " " + Enum.FIFTH.getDescription());
        System.out.println(Enum.valueOf("FIRST"));
    }
}
