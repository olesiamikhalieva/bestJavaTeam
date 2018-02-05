package ht9_02_02_2018.t2.Figures;

import java.util.Objects;

public class Square extends Figure{
    private double a;

    public Square() {
    }

    public Square(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Square)) return false;
        Square square = (Square) o;
        return Double.compare(square.getA(), getA()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getA());
    }

    @Override
    public String toString() {
        return "Square{" +
                "a=" + a +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Square");
    }

    @Override
    public void area() {
        System.out.println("Square's area = " + this.a * this.a);
    }
}
