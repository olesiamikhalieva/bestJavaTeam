package hw_02_02_18.Figure;

public class Square extends Figure {
    int side;
    int area;

    public Square(int side) {
        this.side = side;
    }

    @Override
    public void draw() {
        System.out.println("Draw square.");
    }

    @Override
    public void areaFigure() {
        this.side = side;
        this.area = side*side;
        System.out.println("Area of square with side "+side+" is "+this.area);
    }

}
