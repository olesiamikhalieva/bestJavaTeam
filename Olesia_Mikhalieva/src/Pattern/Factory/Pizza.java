package Pattern.Factory;

import java.util.ArrayList;

public abstract class Pizza {
    String name;
    String dough;
    String sause;
    ArrayList topping = new ArrayList();

    void prepare(){
        System.out.println("Preparing "+name);
        System.out.println("Tossing dough...");
        System.out.println("Adding sause...");
        for (int i = 0; i< topping.size(); i++){
            System.out.println("   "+topping.get(i));
        }
    }

    void bake(){
        System.out.println("Bake for 25 minutes at 350.");
    }

    void cut(){
        System.out.println("Cutting th pizza into diagonal slices.");
    }

    void box(){
        System.out.println("Place pizza in official PizzaStore box.");
    }

    public String getName(){
        return name;
    }

}
