package hw16_06_04_18;

public class Reflection {

    String string1 = "Строка 1";
    String string2 = "Строка 2";
    String string3 = "Строка 3";

    public Reflection() {
    }

    public Reflection(String str) {
        string1 = str;
    }

    public Reflection(String string1, String string2, String string3) {
        this.string1 = string1;
        this.string2 = string2;
        this.string3 = string3;
    }

    int i = 5;
    char с = 'C';

    public void str() {
        System.out.println(string1 + " " + string2 + " " + string3);
    }

    public String getString1() {
        return string1;
    }

    public void setString1(String string1) {
        this.string1 = string1;
    }

    public String getString2() {
        return string2;
    }

    public void setString2(String string2) {
        this.string2 = string2;
    }

    public String getString3() {
        return string3;
    }

    public void setString3(String string3) {
        this.string3 = string3;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public char getС() {
        return с;
    }

    public void setС(char с) {
        this.с = с;
    }
}