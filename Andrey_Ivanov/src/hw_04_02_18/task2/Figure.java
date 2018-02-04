package hw_04_02_18.task2;

abstract class Figure {

    private int sideA;
    private int sideB;
    private int sideC;

    public Figure() {
    }

    public Figure(int sideA, int sideB, int sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Figure(int sideA, int sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public Figure(int sideA) {
        this.sideA = sideA;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    abstract void draw();

   abstract void areaCalculation();


}
