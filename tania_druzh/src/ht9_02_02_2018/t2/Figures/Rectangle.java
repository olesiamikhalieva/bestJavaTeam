package ht9_02_02_2018.t2.Figures;

import java.util.Objects;

public class Rectangle extends Square {
    private double b;

    public Rectangle() {
    }

    public Rectangle(double a, double b) {
        super(a);
        this.b = b;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rectangle)) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.getB(), getB()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getB());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + super.getA() +
                "b=" + b +
                '}';
    }


    @Override
    public void draw() {
        System.out.println("Rectangle");
    }

    @Override
    public void area() {
        System.out.println("Square's area = " + super.getA() * this.b);
    }
}
