package task2;

public class Figure {

    private final double pi = 3.14;

    public void paint() {
        System.out.println("Рисую");
    }

    public double areaCircle(double radius) {
        return radius * radius * pi;
    }

    public double areaTriangle(double a, double b, double c) {
        double semiPerimeter = (a + b + c) / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - a) * (semiPerimeter - b) * (semiPerimeter - c));
    }

    public double areaSquare(double a) {
        return a * a;
    }

    public double areaRectangle(double a, double b) {
        return a * b;
    }

}
