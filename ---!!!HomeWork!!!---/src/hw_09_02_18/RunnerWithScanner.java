package hw_09_02_18;

import hw_09_02_18.Classes.Beverage;
import hw_09_02_18.Classes.Coffee.*;
import hw_09_02_18.Classes.Ingredients.*;
import hw_09_02_18.Classes.NewBeverage;
import hw_09_02_18.Classes.Tea.*;

import java.util.Scanner;

public class RunnerWithScanner {

    static NewBeverage newBeverage = new NewBeverage();//создаем пустой объект, в который мы будем ложить напиток либо ингридиенты.
    static Beverage[] beverageMass;
    static Beverage[] componentMass;

    public static void main(String[] args) {

        beverageMass = menu();//выводим меню и создание массива гарячих напитков

        //проверяем на коректность ввода и добавляем в объект готовый напиток из списка, либо пропускаем этот этап
        // и переходим к созданию своего варианта
        addBeverageForNewBeverage(checkCorrectnessInput());

        componentMass = menuComponents();//Вывод меню компонентов и создание массива компонентов

        showYourOrder();
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

        System.out.println("Для аказа введите соответствующее число: ");
        System.out.printf("%-15s%35s%44s%n", "Меню:", "Состав", "стоимость");
        for (int i = 0; i < beverageMass.length; i++) {
            System.out.printf("%-30s%-55s%-10s%n", i + 1 + ". " + beverageMass[i].getName(),beverageMass[i].showComponents() ,beverageMass[i].getPrice() + " грн.");
        }
        System.out.println("\n10. перейти к ингридиентам для составление своего напитка");
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
        Beverage coffee = new Coffee();
        Beverage[] componentsMass = {bergamot, chocolate, coffeeAndWater, leavesBlackTea, leavesGreenTea, milk, sugar, water, coffee};
        System.out.printf("%20s%34s%n", "Меню ингридиентов:", "стоимость");
        for (int i = 0; i < componentsMass.length; i++) {
            System.out.printf("%-40s%13s%n", i + 1 + ". " + componentsMass[i].getName(), componentsMass[i].getPrice() + " грн.");
        }
        System.out.println("10. Завершить");
        return componentsMass;
    }

    public static int checkCorrectnessInput() {
        int choice1 = 0;
        for (; ; ) {
            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if (i < 1 || i > 10) {
                System.out.println("Вы ввели неверный неверный символ, повторите");
            }
            if (i >= 1 && i <= 10) {
                choice1 = i;
                break;
            }
        }
        return choice1;
    }

    public static void addBeverageForNewBeverage(int choice1) {
        flag:
        switch (choice1) {
            case 1:
                newBeverage.setNewComponents(beverageMass[0]);
                System.out.println("Желаете что-нибудь добавить?");
                break flag;
            case 2:
                newBeverage.setNewComponents(beverageMass[1]);
                System.out.println("Желаете что-нибудь добавить?");
                break flag;
            case 3:
                newBeverage.setNewComponents(beverageMass[2]);
                System.out.println("Желаете что-нибудь добавить?");
                break flag;
            case 4:
                newBeverage.setNewComponents(beverageMass[3]);
                System.out.println("Желаете что-нибудь добавить?");
                break flag;
            case 5:
                newBeverage.setNewComponents(beverageMass[4]);
                System.out.println("Желаете что-нибудь добавить?");
                break flag;
            case 6:
                newBeverage.setNewComponents(beverageMass[5]);
                System.out.println("Желаете что-нибудь добавить?");
                break flag;
            case 7:
                newBeverage.setNewComponents(beverageMass[6]);
                System.out.println("Желаете что-нибудь добавить?");
                break flag;
            case 8:
                newBeverage.setNewComponents(beverageMass[7]);
                System.out.println("Желаете что-нибудь добавить?");
                break flag;
            case 9:
                newBeverage.setNewComponents(beverageMass[8]);
                System.out.println("Желаете что-нибудь добавить?");
                break flag;
            case 10:
                break flag;
        }
    }

    public static void showYourOrder() {
        int choice2 = 0;
        System.out.println("для завершение заказа введите число 10 либо продолжите составление заказа");
        while (choice2 != 10) {
            Scanner scanner1 = new Scanner(System.in);
            choice2 = scanner1.nextInt();
            if (choice2 >= 1 && choice2 <= 9) {
                newBeverage.setNewComponents(componentMass[choice2 - 1]);//добавляем в наш новый напиток ингридиент из componentMass
            }
            if (choice2 == 10) {
                newBeverage.showComponents(); //выводим заказ и его стоимость
            }
            if (choice2 < 1 || choice2 > 10) {
                System.out.println("Вы ввели неверный симаол, повторите ");
            }
        }
    }
}

