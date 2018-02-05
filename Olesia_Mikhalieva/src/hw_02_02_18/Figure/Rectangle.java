package hw_02_02_18.Figure;

public class Rectangle extends Figure{
    int area;
    int side1;
    int side2;

    public Rectangle(int side1, int side2) {
        this.side1 = side1;
        this.side2 = side2;
    }


    @Override
    public void draw() {
        System.out.println("Draw rectangle.");
    }

    @Override
    public void areaFigure() {
        this.area=this.side1*this.side2;
        System.out.println("Area of rectangle with sides "+side1+" and "+side2+" is "+this.area);
    }
}
