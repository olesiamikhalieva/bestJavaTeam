package hw_09_02_18.MenuCoffee;

import hw_09_02_18.MenuCoffee.drinks.*;

public class MenuCoffee {


    private static DefaultDrink blackCoffee;
    private static DefaultDrink blackTea;
    private static DefaultDrink bergamotTea;
    private static DefaultDrink capuccino;
    private static DefaultDrink latte;
    private static DefaultDrink greenTea;
    private static DefaultDrink coffeeWithMilk;


    public static void main(String[] args) {
        System.out.println("\t\t\tМеню кофейни:");

        createBlackCoffee();
        createCappuccino();
        createLatte();
        createCoffeeWiyhMilk();
        createBlackTea();
        createBergamotTea();
        createGreenTea();

    }

    private static void createBlackCoffee() {
        int waterCount = 1;
        int coffeeCount = 2;
        int sugarCount = 3;
        blackCoffee = new BlackCoffee("Black coffee", waterCount, sugarCount, coffeeCount);
        System.out.print(blackCoffee.toString());
        System.out.println("\t(water=" + waterCount + ",coffee=" + coffeeCount + ",sugar=" + sugarCount + ")");
    }

    private static void createBlackTea() {
        int waterCount = 1;
        int blackTeaCount = 3;
        int sugarCount = 2;
        blackTea = new BlackCoffee("Black tea", waterCount,sugarCount,blackTeaCount);
        System.out.print(blackTea.toString());
        System.out.println("\t(water=" + waterCount + ",black tea=" + blackTeaCount + ",sugar=" + sugarCount + ")");
    }

    private static void createBergamotTea() {
        int waterCount = 1;
        int bergamotTeaCount = 2;
        int sugarCount = 2;
        bergamotTea = new BlackCoffee("Bergamot tea", waterCount,sugarCount,bergamotTeaCount);
        System.out.print(bergamotTea.toString());
        System.out.println("\t(water=" + waterCount + ",bergamot tea=" + bergamotTeaCount + ",sugar=" + sugarCount + ")");

    }
    private static void createCappuccino() {
        int hotMilkCount = 2;
        int coffeeCount = 2;
        int sugarCount = 3;
        capuccino = new Cappuccino("Cappuccino", hotMilkCount,sugarCount,coffeeCount);
        System.out.print(capuccino.toString());
        System.out.println("\t(hot milk=" + hotMilkCount + ",coffee=" + coffeeCount + ",sugar=" + sugarCount + ")");

    }
    private static void createLatte() {
        int hotMilkCount = 3;
        int coffeeCount = 1;
        int sugarCount = 3;
        latte = new Cappuccino("Latte", hotMilkCount,sugarCount,coffeeCount);
        System.out.print(latte.toString());
        System.out.println("\t(hot milk=" + hotMilkCount + ",coffee=" + coffeeCount + ",sugar=" + sugarCount + ")");

    }
    private static void createGreenTea() {
        int waterCount = 2;
        int greenTeaCount = 3;
        int sugarCount = 2;
        greenTea = new GreenTea("Green tea", waterCount,sugarCount,greenTeaCount);
        System.out.print(greenTea.toString());
        System.out.println("\t(water=" + waterCount + ",green tea=" + greenTeaCount + ",sugar=" + sugarCount + ")");
    }
    private static void createCoffeeWiyhMilk() {
        int waterCount = 1;
        int coffeeCount = 2;
        int sugarCount = 3;
        int milkCount=2;
        coffeeWithMilk = new CoffeeWithMilk("Coffee with milk", waterCount, sugarCount, coffeeCount,milkCount);
        System.out.print(coffeeWithMilk.toString());
        System.out.println("\t(water=" + waterCount + ",coffee=" + coffeeCount + ",sugar=" + sugarCount + ",milk=2"+milkCount+")");
    }
}