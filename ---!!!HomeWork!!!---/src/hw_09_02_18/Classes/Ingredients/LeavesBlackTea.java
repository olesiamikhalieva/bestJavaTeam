package hw_09_02_18.Classes.Ingredients;

import hw_09_02_18.Classes.Beverage;

public class LeavesBlackTea extends Beverage {
    public LeavesBlackTea() {
        super("Черный чай");
        super.setPrice(2);
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
return "";
    }
}
