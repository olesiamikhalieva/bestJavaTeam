package hw_09_02_18.Classes.Tea;

import hw_09_02_18.Classes.Beverage;
import hw_09_02_18.Classes.Ingredients.*;
import hw_09_02_18.Classes.Ingredients.LeavesBlackTea;

public class GreenTeaBergamot extends Beverage{
    private LeavesGreenTea leavesGreenTea;
    private Water water1;
    private Water water2;
    private Water water3;
    private Bergamot bergamot;

    public GreenTeaBergamot(String name, LeavesGreenTea leavesGreenTea, Water water1, Water water2, Water water3, Bergamot bergamot) {
        super(name);
        this.leavesGreenTea = leavesGreenTea;
        this.water1 = water1;
        this.water2 = water2;
        this.water3 = water3;
        this.bergamot = bergamot;
        super.setPrice(leavesGreenTea.getPrice() + water1.getPrice()+water2.getPrice()+water3.getPrice()+bergamot.getPrice());
    }

    public int getPriceGreenTeaBergamot() {

        return super.getPrice();
    }
}
