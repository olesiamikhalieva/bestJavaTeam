package hw_12_01_18.src.magaz;

import magaz.sport_goods.Booots;
import magaz.sport_goods.Dress;

/**
 * Created by java on 19.01.2018.
 */
public class Shop {

    private Booots sportBoots;

    private Dress dress;

    public Shop() {
    }

    public Shop(Booots sportBoots, Dress dress) {
        this.sportBoots = sportBoots;
        this.dress = dress;
    }

    public Booots getSportBoots() {
        return sportBoots;
    }

    public void setSportBoots(Booots sportBoots) {
        this.sportBoots = sportBoots;
    }

    public Dress getDress() {
        return dress;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }
}
