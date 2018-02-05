package hw_02_02_18.Figure;

public class Circle extends Figure{
    int radius;
    int area;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        System.out.println("Draw circle");
    }

    @Override
    public void areaFigure() {
        this.area = (int)(this.radius*this.radius*Math.PI);
        System.out.println("Area of circle with radius "+radius+" is "+this.area);
    }

}
