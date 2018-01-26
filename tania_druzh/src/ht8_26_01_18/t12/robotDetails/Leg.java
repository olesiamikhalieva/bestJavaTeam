package ht8_26_01_18.t12.robotDetails;

public class Leg {
    private int countOfToes;
    private int shoeSize;

    public Leg() {
    }

    public Leg(int countOfToes, int shoeSize) {
        this.countOfToes = countOfToes;
        this.shoeSize = shoeSize;
    }

    public int getCountOfToes() {
        return countOfToes;
    }

    public void setCountOfToes(int countOfToes) {
        this.countOfToes = countOfToes;
    }

    public int getShoeSize() {
        return shoeSize;
    }

    public void setShoeSize(int shoeSize) {
        this.shoeSize = shoeSize;
    }
}
