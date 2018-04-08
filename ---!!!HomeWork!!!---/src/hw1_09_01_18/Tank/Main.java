package hw1_09_01_18.Tank;

public class Main {
    public static void main(String[] args) {

        Tank tank = new Tank(46.5,3,"T-90", 1990);

        System.out.println("Экипаж " + tank.getCrew() + " человека");
        System.out.println("Модель -- " + tank.getModel());
        System.out.println("Вес -- " + tank.getWeight());
        System.out.println("Год выпуска -- " + tank.getYearOfIssued());
    }
}
