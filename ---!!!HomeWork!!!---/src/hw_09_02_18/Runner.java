package hw_09_02_18;

import hw_09_02_18.Classes.Beverage;
import hw_09_02_18.Classes.Coffee.*;
import hw_09_02_18.Classes.Ingredients.*;
import hw_09_02_18.Classes.NewBeverage;
import hw_09_02_18.Classes.Tea.BlackTea;
import hw_09_02_18.Classes.Tea.BlackTeaBergamot;
import hw_09_02_18.Classes.Tea.GreenTea;
import hw_09_02_18.Classes.Tea.GreenTeaBergamot;

public class Runner {
    public static Americano americano = new Americano("Американо ", new CoffeeAndWater(), new Water(), new Water());
    public static Cappuccino cappuccino = new Cappuccino("Капучино", new CoffeeAndWater(), new Milk(), new Milk(), new Milk(), new Milk(), new Milk());
    public static CoffeeMilk coffeeMilk = new CoffeeMilk("Кофе с молоком", new CoffeeAndWater(), new Milk());
    public static Espresso espresso = new Espresso("Эспрессо", new CoffeeAndWater());
    public static Mocaccino mocaccino = new Mocaccino("Мокачино", new CoffeeAndWater(), new Chocolate(), new Milk(), new Milk());
    public static BlackTea blackTea = new BlackTea("Черный чай", new Water(), new Water(), new Water(), new LeavesBlackTea());
    public static BlackTeaBergamot blackTeaBergamot = new BlackTeaBergamot("Черный чай с бергамотом", new LeavesBlackTea(), new Water(), new Water(), new Water(), new Bergamot());
    public static GreenTea greenTea = new GreenTea("Зеленый чай", new LeavesGreenTea(), new Water(), new Water(), new Water());
    public static GreenTeaBergamot greenTeaBergamot = new GreenTeaBergamot("Зеленый чай с бергамотом", new LeavesGreenTea(), new Water(), new Water(), new Water(), new Bergamot());

    public static void main(String[] args) {

        Beverage[] beverageMass = {americano, cappuccino, coffeeMilk, espresso, mocaccino, blackTea, blackTeaBergamot, greenTea, greenTeaBergamot};

        menu(beverageMass);

        NewBeverage newBeverage = new NewBeverage(); // Составление своего напитка.

        newBeverage.setNewComponents(new Bergamot());//добавляем порцию бергамота
        newBeverage.setNewComponents(new Chocolate());//добавляем порцию шоколада
        newBeverage.setNewComponents(new Water());//добавляем порцию воды
        newBeverage.setNewComponents(new Water());//добавляем порцию воды
        newBeverage.setNewComponents(new CoffeeAndWater());// добавляем порцию воды с порцией кофе

        newBeverage.showComponents();// Вывод цены нового напитка

        //Можем сделать напиток на основе существующих:

        NewBeverage newBeverage1 = new NewBeverage();

        newBeverage1.setNewComponents(mocaccino);
        newBeverage1.setNewComponents(new Milk());

        newBeverage1.showComponents();

    }

    public static void menu(Beverage[] beverageMass) {
        System.out.printf("%-15s%35s%44s%n", "Меню:", "Состав", "стоимость");
        for (int i = 0; i < beverageMass.length; i++) {
            System.out.printf("%-30s%-55s%-10s%n", i + 1 + ". " + beverageMass[i].getName(),beverageMass[i].showComponents() ,beverageMass[i].getPrice() + " грн.");
        }
    }
}
