package magaz;

import magaz.sport_goods.Booots;
import magaz.sport_goods.Dress;

public class Shop {

    private String name;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
