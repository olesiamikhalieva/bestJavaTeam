package hw_04_02_18.task2;

public class Square extends Figure {


    public Square(int sideA) {

        super(sideA);
    }

    @Override
    void draw() {
        System.out.println("Квадрат рисует четыре одинаковых стороны");

    }

    @Override
    void areaCalculation() {
        System.out.println("Если сторона а="+super.getSideA()+", то площадь квадрата = "+Math.pow(super.getSideA(),2));

    }
}
