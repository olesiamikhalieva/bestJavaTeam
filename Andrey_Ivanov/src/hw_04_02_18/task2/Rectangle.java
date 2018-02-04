package hw_04_02_18.task2;

public class Rectangle extends Figure {


    public Rectangle(int sideA, int sideB) {
        super(sideA, sideB);
    }

    @Override
    void draw() {
        System.out.println("Прямоугольник рисует прямые углы)");
    }

    @Override
    void areaCalculation() {
        System.out.println("Если сторона а="+super.getSideA()+", а сторона b="+super.getSideB()+
                ", то площадь прямоугольника = "+super.getSideA()*super.getSideB());

    }
}
