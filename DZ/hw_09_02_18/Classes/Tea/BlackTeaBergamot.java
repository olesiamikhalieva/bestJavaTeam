package hw_09_02_18.Classes.Tea;

import hw_09_02_18.Classes.Beverage;
import hw_09_02_18.Classes.Ingredients.Bergamot;
import hw_09_02_18.Classes.Ingredients.LeavesBlackTea;
import hw_09_02_18.Classes.Ingredients.Water;

public class BlackTeaBergamot extends Beverage{

    private LeavesBlackTea leavesBlackTea;
    private Water water1;
    private Water water2;
    private Water water3;
    private Bergamot bergamot;

    public BlackTeaBergamot( String name, LeavesBlackTea leavesBlackTea, Water water1, Water water2, Water water3, Bergamot bergamot) {
        super(name);
        this.leavesBlackTea = leavesBlackTea;
        this.water1 = water1;
        this.water2 = water2;
        this.water3 = water3;
        this.bergamot = bergamot;
        super.setPrice(leavesBlackTea.getPrice()+water1.getPrice()+water2.getPrice()+water3.getPrice()+bergamot.getPrice());
    }

    public int getPriceBlackTeaBergamot() {

        return super.getPrice();
    }

    @Override
    public String showComponents() {
        return leavesBlackTea.getName() + ", " + water1.getName() + ", " + water2.getName() + ", " + water3.getName() + ", " + bergamot.getName();
    }
}
