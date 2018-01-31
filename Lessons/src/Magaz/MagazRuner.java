package Magaz;

import Magaz.sportGoods.Boots;
import Magaz.sportGoods.Dress;
import Magaz.sportGoods.Info;

public class MagazRuner {

    private static Boots boots;
    private static Boots bootsBig2;
    private static Dress dress;
    private static Shop shop;
    private static Info info;
    private MostCity mostCity;

    public static void main(String[] args) {

        MostCity mostCity = new MostCity();

        shop = new Shop();
        shop.setName("Butick");
        info = new Info("sdfsdf street", "@gmail.com", 49000);
        boots = new Boots(15, "Nike", 50, 10, info);
        dress = new Dress();
        shop.setSportBoots(boots);
        shop.setDress(dress);
        //System.out.println(shop.getSportBoots().getInfo().getAddress());

        mostCity.addShopToShopMass(shop);

        Shop shop1 = new Shop();
        shop1.setName("good shop");

        mostCity.addShopToShopMass(shop1);

        // mostCity.showAllShops();

        mostCity.showOneShop("good shop");
    }

}
