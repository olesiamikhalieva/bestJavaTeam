package hw_02_02_18.Figure;

public class MainFigure {
    public static void main(String[] args) {
        Figure square = new Square(5);
        square.draw();
        square.areaFigure();
        System.out.println();
        Figure triangle = new Triangle(5,6);
        triangle.draw();
        triangle.areaFigure();
        System.out.println();
        Figure circle= new Circle(5);
        circle.draw();
        circle.areaFigure();
        System.out.println();
        Figure rectangle = new Rectangle(5,3);
        rectangle.draw();
        rectangle.areaFigure();


    }
}
