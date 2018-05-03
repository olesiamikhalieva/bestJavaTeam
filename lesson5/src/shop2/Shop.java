package shop2;

import shop2.goods.Booots;
import shop2.goods.Dress;

public class Shop {

  private Booots boot;

  private Dress dress;

//    public Shop(Booots boot, Dress dress) {
//        this.boot = boot;
//        this.dress = dress;
//    }

    public Booots getBoot() {
        return boot;
    }

    public void setBoot(Booots boot) {
        this.boot = boot;
    }

    public Dress getDress() {
        return this.dress;
    }

    public void setDress(Dress dress) {
        this.dress = dress;
    }
}
