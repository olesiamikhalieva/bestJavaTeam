package hw_09_02_18;

import hw_09_02_18.Classes.Coffee.*;
import hw_09_02_18.Classes.Ingredients.*;
import hw_09_02_18.Classes.Tea.BlackTea;
import hw_09_02_18.Classes.Tea.BlackTeaBergamot;
import hw_09_02_18.Classes.Tea.GreenTea;
import hw_09_02_18.Classes.Tea.GreenTeaBergamot;

public class Runner {
    public static Americano americano = new Americano(new CoffeeAndWater(), new Water(), new Water());
    public static Cappuccino cappuccino = new Cappuccino(new CoffeeAndWater(), new Milk(), new Milk(), new Milk(), new Milk(), new Milk());
    public static CoffeeMilk coffeeMilk = new CoffeeMilk(new CoffeeAndWater(), new Milk());
    public static Espresso espresso = new Espresso(new CoffeeAndWater());
    public static Mocaccino mocaccino = new Mocaccino(new CoffeeAndWater(), new Chocolate(), new Milk(), new Milk());
    public static BlackTea blackTea = new BlackTea(new Water(), new Water(), new Water(), new LeavesBlackTea());
    public static BlackTeaBergamot blackTeaBergamot = new BlackTeaBergamot(new LeavesBlackTea(), new Water(), new Water(), new Water(), new Bergamot());
    public static GreenTea greenTea = new GreenTea(new LeavesGreenTea(), new Water(), new Water(), new Water());
    public static GreenTeaBergamot greenTeaBergamot = new GreenTeaBergamot(new LeavesGreenTea(), new Water(), new Water(), new Water(), new Bergamot());

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        System.out.printf("%-40s%15s%n", "1. Меню:", "стоимость");
        System.out.printf("%-40s%13s%n", "2. Американо", americano.getPriceAmericano() + " грн.");
        System.out.printf("%-40s%13s%n", "3. Капучино", cappuccino.getPriceCappuccino() + " грн.");
        System.out.printf("%-40s%13s%n", "4. Кофе с молоком", coffeeMilk.getPriceCoffeeMilk() + " грн.");
        System.out.printf("%-40s%13s%n", "5. Эспрессо", espresso.getPriceEspresso() + " грн.");
        System.out.printf("%-40s%13s%n", "6. Мокачино", mocaccino.getPriceMocaccino() + " грн.");
        System.out.printf("%-40s%13s%n", "7. Черній чай", blackTea.getPriceBlackTea() + " грн.");
        System.out.printf("%-40s%13s%n", "8. Черный час с бергамотом", blackTeaBergamot.getPriceBlackTeaBergamot() + " грн.");
        System.out.printf("%-40s%13s%n", "9. Зеленый чай", greenTea.getPriceGreenTea() + " грн.");
        System.out.printf("%-40s%13s%n", "10. Зеленый чай с бергамотом", greenTeaBergamot.getPriceGreenTeaBergamot() + " грн.");
    }
}
