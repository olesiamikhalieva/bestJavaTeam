package Pattern.Factory.AbstractFactory;

public class ClamPizza extends Pizza {
PizzaIngridientFactory ingredientFactory;
    public ClamPizza(PizzaIngridientFactory ingridientFactory) {
        this.ingredientFactory = ingridientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+ name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
        clam = ingredientFactory.createClam();
    }
}
