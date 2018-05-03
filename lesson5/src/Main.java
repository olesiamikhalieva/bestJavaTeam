import shop2.Shop;
import shop2.goods.Booots;
import shop2.goods.Dress;

public class Main {

    private static Booots boots;
    private static Dress dress;
    private static Shop shop;
    public static void main(String[] args) {
         shop = new Shop();

        iniGoods(boots, dress);

        addDoodsToTheShop(shop, boots, dress);

    }


    private static void addDoodsToTheShop(Shop shop, Booots boots, Dress dress) {
        if(shop!=null){
            if(boots!=null && dress!=null){
                shop.setDress(dress);
                shop.setBoot(boots);
                System.out.println(boots.getBrand()+"price"+boots.getPrice());
                System.out.println(dress.getBrand()+" price"+dress.getPrice());
            }

        }

    }

    public static void iniGoods(Booots bt, Dress dr){
        boots = new Booots(15, "Nike", 95);
        dress = new Dress(23, "Bershka", 100);
    }
}
