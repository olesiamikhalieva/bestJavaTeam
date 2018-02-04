package hw_04_02_18.task2;

public class Circle extends Figure {

    private int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public Circle(int radius) {
        this.radius=radius;
    }

    @Override
    void draw() {
        System.out.println("Круг рисует круг");

    }

    @Override
    void areaCalculation() {
        System.out.println("Если радиус = " + getRadius() + ", то площадь круга = " + (3.14 * Math.pow(getRadius(), 2)));

    }
}
