package hw7_09_02_18.Classes.Tea;

import hw7_09_02_18.Classes.Beverage;
import hw7_09_02_18.Classes.Ingredients.LeavesBlackTea;
import hw7_09_02_18.Classes.Ingredients.Water;

public class BlackTea extends Beverage{

    private Water water1;
    private Water water2;
    private Water water3;
    private LeavesBlackTea leavesBlackTea;

    public BlackTea(String name, Water water1, Water water2, Water water3, LeavesBlackTea leavesBlackTea) {
        super(name);
        this.water1 = water1;
        this.water2 = water2;
        this.water3 = water3;
        this.leavesBlackTea = leavesBlackTea;
        super.setPrice(water1.getPrice() + water2.getPrice() + water3.getPrice() + leavesBlackTea.getPrice());
    }

    public int getPriceBlackTea() {
        return super.getPrice();
    }

    @Override
    public String showComponents() {
        return leavesBlackTea.getName() + ", " + water1.getName() + ", " + water2.getName() + ", " + water3.getName();
    }
}
