package hw_04_02_18.task2;

public class Triangle extends Figure{

    public Triangle(int sideA, int sideB, int sideC) {
        super(sideA, sideB, sideC);
    }

    @Override
    void draw() {
        System.out.println("Треуголник рисует три стороны");
    }
    @Override
    void areaCalculation() {
       int p=(super.getSideA()+super.getSideB()+super.getSideC())/2;
       double areaTriangle=Math.sqrt(p*((p-super.getSideA())*(p-super.getSideB())*(p-super.getSideC())));
        System.out.println("Если сторона а = "+super.getSideA()+", b = "+super.getSideB()+", c = "+super.getSideC()+
        ", то площадь треугольника равна = "+areaTriangle);

    }
}
