package hw_10_02_18;

import hw_10_02_18.Drinks.*;
import hw_10_02_18.Products.Products;
import hw_10_02_18.Products.SetProductPrice;

public class Runner {

    private static SetProductPrice setProductPrice = new SetProductPrice();
    private static DrinkMenu drinksMenu = new DrinkMenu();

    public static void main(String[] args) {

        printMenu();
        addProductsToDrinks(drinksMenu.getAmerikano(), setProductPrice.getMilk());
        addProductsToDrinks(drinksMenu.getCoffeWithMilk(), setProductPrice.getChocolate());

    }

    private static void printMenu() {
        System.out.println("Drinks menu:");
        for (InterfaceDrinks drinks : drinksMenu.getDrinksMass()) {
            System.out.println(drinks.getName() + "\t" + drinks.getPrice());
        }
    }


    private static void addProductsToDrinks(InterfaceDrinks drinks, Products xxx) {
        int price = (int) xxx.getPrice() + (int) drinks.getPrice();
        System.out.println(drinks.getName() + " + " + xxx.getName() +"\t"+ price);
    }


}



