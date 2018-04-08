package hw8_16_02_18_Patern.PatternFactory.Ingridients;

public interface PizzaIngridientFactory {
    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Veggies[] createVeggies();
    public Pepperoni createPepperoni();
    public Clams createClams();

}
