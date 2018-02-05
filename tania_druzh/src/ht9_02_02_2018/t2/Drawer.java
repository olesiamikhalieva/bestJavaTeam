package ht9_02_02_2018.t2;

import ht9_02_02_2018.t2.Figures.*;

public class Drawer {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Triangle triangle = new Triangle(5,8,10);
        Rectangle rectangle = new Rectangle(5,8);
        Square square = new Square(8);
        Figure [] figures = {circle,triangle,rectangle,square};

        for (Figure figure : figures) {
            figure.draw();
            System.out.println(figure.toString());
            figure.area();
        }
    }
}
