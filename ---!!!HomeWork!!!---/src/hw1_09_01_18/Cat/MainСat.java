package hw1_09_01_18.Cat;

public class MainСat {
    public static void main(String[] args) {

        Cat cat = new Cat("Timosha", 15, "Black", 20, 50);

        System.out.println("Кот по имени " + cat.getName()+ "\nЦвет: " +cat.getColor() +  "\nЕго вес: " + cat.getWeight() + "кг");
        System.out.println("Его рост: " + cat.getGrowth() + " cм");
        System.out.println("Его длинна: " + cat.getLonger() + " cм");
        double force = cat.getForce();
        if (force >= 17) System.out.println("Ваш кот сильный");
        if (force >= 13 && force < 17) System.out.println("Ваш кот достаточно сильный, но есть куда рости");
        if (force < 13) System.out.println("Ваш кот слабый");
    }
}
