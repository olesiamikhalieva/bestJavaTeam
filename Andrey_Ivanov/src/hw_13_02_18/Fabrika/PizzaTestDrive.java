package hw_13_02_18.Fabrika;

public class PizzaTestDrive {

    public static void main(String[] args) {
        PizzaStore nyStore=new NYPizzaStore();

        Pizza pizza=nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a "+pizza.getName()+"\n");
    }
}
