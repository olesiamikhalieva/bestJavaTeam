package hw_02_02_18.task2;

public class MainFigure {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(3 ,6);
        Square square = new Square(3);
        Triangle triangle = new Triangle(9,5,6);

        System.out.println("Площадь крука: " + circle.areaCircle());
        System.out.println("Площадь прямоугольника: " + rectangle.areaRectangle());
        System.out.println("Площадь квадрата: " + square.areaSquare());
        System.out.println("Площадь треугольника: " + triangle.areaTriangle());
    }
}
