package magaz;

import magaz.sport_goods.Booots;
import magaz.sport_goods.Dress;
import magaz.sport_goods.Info;

public class MagazRunner {


    public static void main(String[] args) {

        MostCity mostCity = new MostCity();

        Shop shop = new Shop();
        shop.setName("Bootic");
        Info info = new Info();
        info.setAdr("district");
        Booots booots = new Booots(15, "Nike", 50);
        booots.setInfo(info);
        Dress dress = new Dress();
        shop.setSportBoots(booots);
        shop.setDress(dress);
//        System.out.println(shop.getSportBoots().getInfo().getAdr());

        mostCity.addShopToShopMass(shop);

        Shop shop1 = new Shop();
        shop1.setName("good shop");

        mostCity.addShopToShopMass(shop1);

//        mostCity.showAllShops();

        mostCity.showOneShop("good shop");

    }


}
