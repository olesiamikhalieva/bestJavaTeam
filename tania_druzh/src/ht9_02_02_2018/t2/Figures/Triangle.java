package ht9_02_02_2018.t2.Figures;

import java.util.Objects;

public class Triangle extends Rectangle{
    private double c;

    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        super(a, b);
        this.c = c;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        if (!super.equals(o)) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.getC(), getC()) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getC());
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "a=" + super.getA() +
                "b=" + super.getB() +
                "c=" + c +
                '}';
    }

    @Override
    public void draw() {
        System.out.println("Triangle");
    }

    @Override
    public void area() {
        double p = (super.getA() + super.getB() + this.c)/ 2;
        double s = Math.sqrt(p * (p - super.getA()) * (p - super.getB())* (p - this.c));
        System.out.println("Triangle's area = " + s);
    }
}
