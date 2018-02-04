package hw_04_02_18.task2;

public class Main {

    public static void main(String[] args) {
        Figure rectangle=new Rectangle(10,5);
        rectangle.areaCalculation();
        rectangle.draw();

        System.out.println("-----------------");

        Figure square=new Square(12);
        square.areaCalculation();
        square.draw();

        System.out.println("------------------");

        Figure triangle=new Triangle(3,4,5);
        triangle.areaCalculation();
        triangle.draw();

        System.out.println("-------------------");

        Figure circle=new Circle(8);
        circle.areaCalculation();
        circle.draw();
    }
}
