package hw_02_02_18.task2;

import java.util.Objects;

public class Rectangle extends Figure {
    private double sideA;
    private double SideB;

    public Rectangle() {
    }

    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        SideB = sideB;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.sideA, sideA) == 0 &&
                Double.compare(rectangle.SideB, SideB) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(sideA, SideB);
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "sideA=" + sideA +
                ", SideB=" + SideB +
                '}';
    }

    public double areaRectangle() {
        return super.areaRectangle(this.sideA,this.SideB);
    }
}
