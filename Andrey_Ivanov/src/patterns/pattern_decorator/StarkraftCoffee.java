package patterns.pattern_decorator;

import patterns.pattern_decorator.Drinks.Beverage;
import patterns.pattern_decorator.Drinks.BlackCoffee;
import patterns.pattern_decorator.Drinks.Cappuccino;
import patterns.pattern_decorator.Drinks.Espresso;
import patterns.pattern_decorator.Ingridients.Coffee;
import patterns.pattern_decorator.Ingridients.HotMilk;
import patterns.pattern_decorator.Ingridients.Sugar;
import patterns.pattern_decorator.Ingridients.Water;


public class StarkraftCoffee {

    public static void main(String[] args) {

        Beverage beverage1=new Espresso();
        beverage1=new Water(beverage1);
        beverage1=new Coffee(beverage1);
        System.out.println(beverage1.getDescription()+" $"+beverage1.cost());
        System.out.println("------------------------------------------------");

        Beverage beverage2=new BlackCoffee();
        beverage2=new Water(beverage2);
        beverage2=new Coffee(beverage2);
        beverage2=new Coffee(beverage2);
        System.out.println(beverage2.getDescription()+" $"+beverage2.cost());
        System.out.println("-------------------------------------------------");

        Beverage beverage3=new Cappuccino();
        beverage3=new HotMilk(beverage3);
        beverage3=new Coffee(beverage3);
        beverage3=new Sugar(beverage3);
        System.out.println(beverage3.getDescription()+" $"+beverage3.cost());
        System.out.println("-------------------------------------------------");
    }

}
