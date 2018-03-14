package Pattern.Factory.AbstractFactory;

public class CheesePIzzza extends Pizza {
    PizzaIngridientFactory ingredientFactory;

    public CheesePIzzza(PizzaIngridientFactory ingridientFactory) {
        this.ingredientFactory = ingridientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing "+ name);
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}
