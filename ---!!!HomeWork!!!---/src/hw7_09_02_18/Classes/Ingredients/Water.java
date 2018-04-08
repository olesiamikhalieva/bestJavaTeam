package hw7_09_02_18.Classes.Ingredients;


import hw7_09_02_18.Classes.Beverage;

public class Water extends Beverage{
    public Water() {
        super("Вода");
        super.setPrice(1);
    }
    @Override
    public int getPrice() {
        return super.getPrice();
    }
    @Override
    public String getName() {
        return super.getName();
    }
    @Override
    public String  showComponents() {
return"";
    }
}
