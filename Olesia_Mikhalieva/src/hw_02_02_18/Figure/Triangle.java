package hw_02_02_18.Figure;

public class Triangle extends Figure{
    int side;
    int height;
    int area;

    public Triangle(int height, int side) {
        this.height = height;
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw triangle.");
    }

    @Override
    public void areaFigure() {
        this.area = this.side*this.height*1/2;
        System.out.println("Area of triangle with side "+side+" and height "+height+" is "+this.area);
    }

}
