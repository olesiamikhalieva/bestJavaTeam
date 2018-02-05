package ht9_02_02_2018.t2.Figures;

import java.util.Objects;

public class Circle extends Figure {
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.getR(), getR()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(getR());
    }

    @Override
    public String toString() {
        return "Circle{" +
                "r=" + r +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Circle");
    }

    @Override
    public void area() {
        System.out.println("Circle's area = " + Math.pow(this.r,2) * Math.PI);
    }
}
