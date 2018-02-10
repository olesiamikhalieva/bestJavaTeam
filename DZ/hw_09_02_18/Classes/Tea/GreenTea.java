package hw_09_02_18.Classes.Tea;

import hw_09_02_18.Classes.Ingredients.*;

public class GreenTea {
    private LeavesGreenTea leavesGreenTea;
    private Water water1;
    private Water water2;
    private Water water3;
    private int priceGreenTea = 0;

    public GreenTea(LeavesGreenTea leavesGreenTea, Water water1, Water water2, Water water3) {
        this.leavesGreenTea = leavesGreenTea;
        this.water1 = water1;
        this.water2 = water2;
        this.water3 = water3;
    }

    public int getPriceGreenTea() {
        priceGreenTea = leavesGreenTea.getPrice()+water1.getPrice()+water2.getPrice()+water3.getPrice();
        return priceGreenTea;
    }
}
