package hw_10_02_18;

import hw_10_02_18.Drinks.*;

public class Runner {

    public static void main(String[] args) {
       printMenu();
    }

    private static void printMenu(){

        Amerikano amerikano = new Amerikano();
        Capuchino capuchino = new Capuchino();
        CoffeWithMilk coffeWithMilk = new CoffeWithMilk();
        Mokachino mokachino = new Mokachino();
        BlackTea blackTea = new BlackTea();
        GreenTea greenTea = new GreenTea();
        BergamotTea bergamotTea = new BergamotTea();
        InterfaceDrinks [] mas = {amerikano,capuchino,coffeWithMilk,mokachino,blackTea,greenTea,bergamotTea};
        System.out.println("Drinks menu:");
        for (InterfaceDrinks drinks : mas) {
            System.out.println(drinks.getName()+"\t"+drinks.getPrice());
        }
    }

}
