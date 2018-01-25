package ht7_23_01_18.Robot;

public class Head {
    private int countOfEyes;
    private String hairColor;

    public Head() {
    }

    public Head(int countOfEyes, String hairColor) {
        this.countOfEyes = countOfEyes;
        this.hairColor = hairColor;
    }

    public int getCountOfEyes() {
        return countOfEyes;
    }

    public void setCountOfEyes(int countOfEyes) {
        this.countOfEyes = countOfEyes;
    }

    public String getHairColor() {
        return hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
}
