package hw_09_02_18;

import hw_09_02_18.Classes.Beverage;
import hw_09_02_18.Classes.Coffee.*;
import hw_09_02_18.Classes.Ingredients.*;
import hw_09_02_18.Classes.NewBeverage;
import hw_09_02_18.Classes.Tea.*;

import java.util.Scanner;

public class RunnerWithScanner {


    public static void main(String[] args) {
        Beverage[] beverageMass = menu();//выводим меню и создание массива гарячих напитков
  //      Beverage[] componentMass = menuComponents();//Вывод меню компонентов и создание массива компонентов
        NewBeverage newBeverage = new NewBeverage();


        System.out.println("Что желаете? ");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                newBeverage.setNewComponents(beverageMass[0]);
                System.out.println("Желаете что-нибудь еще?");
            case 2:
                newBeverage.setNewComponents(beverageMass[1]);
            case 3:
                newBeverage.setNewComponents(beverageMass[2]);
            case 4:
                newBeverage.setNewComponents(beverageMass[3]);
            case 5:
                newBeverage.setNewComponents(beverageMass[4]);
            case 6:
                newBeverage.setNewComponents(beverageMass[5]);
            case 7:
                newBeverage.setNewComponents(beverageMass[6]);
            case 8:
                newBeverage.setNewComponents(beverageMass[7]);
            case 9:
                newBeverage.setNewComponents(beverageMass[8]);
        }
    }

    public static Beverage[] menu() {

        Beverage americano = new Americano("Американо ", new CoffeeAndWater(), new Water(), new Water());
        Beverage cappuccino = new Cappuccino("Капучино", new CoffeeAndWater(), new Milk(), new Milk(), new Milk(), new Milk(), new Milk());
        Beverage coffeeMilk = new CoffeeMilk("Кофе с молоком", new CoffeeAndWater(), new Milk());
        Beverage espresso = new Espresso("Эспрессо", new CoffeeAndWater());
        Beverage mocaccino = new Mocaccino("Мокачино", new CoffeeAndWater(), new Chocolate(), new Milk(), new Milk());
        Beverage blackTea = new BlackTea("Черный чай", new Water(), new Water(), new Water(), new LeavesBlackTea());
        Beverage blackTeaBergamot = new BlackTeaBergamot("Черный чай с бергамотом", new LeavesBlackTea(), new Water(), new Water(), new Water(), new Bergamot());
        Beverage greenTea = new GreenTea("Зеленый чай", new LeavesGreenTea(), new Water(), new Water(), new Water());
        Beverage greenTeaBergamot = new GreenTeaBergamot("Зеленый чай с бергамотом", new LeavesGreenTea(), new Water(), new Water(), new Water(), new Bergamot());

        Beverage[] beverageMass = {americano, cappuccino, coffeeMilk, espresso, mocaccino, blackTea, blackTeaBergamot, greenTea, greenTeaBergamot};
        System.out.printf("%10s%44s%n", "Меню:", "стоимость");
        for (int i = 0; i < beverageMass.length; i++) {
            System.out.printf("%-40s%13s%n", i + 1 + ". " + beverageMass[i].getName(), beverageMass[i].getPrice() + " грн.");
        }
        return beverageMass;
    }

    public static Beverage[] menuComponents() {

        Beverage bergamot = new Bergamot();
        Beverage chocolate = new Chocolate();
        Beverage coffeeAndWater = new CoffeeAndWater();
        Beverage leavesBlackTea = new LeavesBlackTea();
        Beverage leavesGreenTea = new LeavesGreenTea();
        Beverage milk = new Milk();
        Beverage sugar = new Sugar();
        Beverage water = new Water();
        Beverage[] componentsMass = {bergamot, chocolate, coffeeAndWater, leavesBlackTea, leavesGreenTea, milk, sugar, water};
        System.out.printf("%20s%34s%n", "Меню ингридиентов:", "стоимость");
        for (int i = 0; i < componentsMass.length; i++) {
            System.out.printf("%-40s%13s%n", i + 1 + ". " + componentsMass[i].getName(), componentsMass[i].getPrice() + " грн.");
        }
        return componentsMass;
    }
}

