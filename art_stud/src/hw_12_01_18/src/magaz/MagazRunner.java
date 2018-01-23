package hw_12_01_18.src.magaz;

import magaz.sport_goods.Booots;
import magaz.sport_goods.Dress;

public class MagazRunner {

    private static Booots booots;
    private static Booots boootsBig2;
    private static Dress dress;
    private static Shop shop;

    public static void main(String[] args) {
//      shop = new Shop();

        Booots atnotherBoots = new Booots();

        initGoods(atnotherBoots, dress);

//      System.out.println(booots.getBrend());

        addBootsToTheShop(shop, booots, dress);

    }

    private static void initGoods(Booots b, Dress dr) {
        b.setBrend("Carvalol");
        b.setPrice(100);
        booots = new Booots(23, "Nike", 100);
        dress = new Dress(15, " Bershka", 95);

    }

    private static void addBootsToTheShop(Shop shop, Booots booots, Dress dress) {
        if (shop != null) {
            if (booots != null && dress != null) {
                shop.setDress(dress);
                shop.setSportBoots(booots);
                System.out.println(shop.getSportBoots().getBrend());
            }
        }

    }
}
