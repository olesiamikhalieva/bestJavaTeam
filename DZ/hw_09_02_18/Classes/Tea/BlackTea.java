package hw_09_02_18.Classes.Tea;

import hw_09_02_18.Classes.Ingredients.LeavesBlackTea;
import hw_09_02_18.Classes.Ingredients.Water;
import org.omg.CORBA.TypeCodePackage.BadKind;

public class BlackTea {
    private Water water1;
    private Water water2;
    private Water water3;
    private LeavesBlackTea leavesBlackTea;
    private int priceBlackTea = 0;

    public BlackTea(Water water1, Water water2, Water water3, LeavesBlackTea leavesBlackTea) {
        this.water1 = water1;
        this.water2 = water2;
        this.water3 = water3;
        this.leavesBlackTea = leavesBlackTea;
    }

    public int getPriceBlackTea() {
        priceBlackTea = water1.getPrice() + water2.getPrice() + water3.getPrice() + leavesBlackTea.getPrice();
        return priceBlackTea;
    }
}
