package les_02_03_18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by java on 02.03.2018.
 */
public class Main {

    public static void main(String[] args) {
        Cat muric = new Cat("muric", 2);
        Cat matilda = new Cat("matilda", 1);

        Dog dog = new Dog("gav", 3 );
        Dog dogic = new Dog("naida", 1 );
//
//        Dog[] dogMass = {dog,dogic};
//        System.out.println(dogMass.length);
//        System.out.println(dogMass.toString());
//        System.out.println(dogMass.hashCode());
//
//        dogMass[1] = null;
//        for (Dog dog1 : dogMass){
//            System.out.println(dog1);
//        }

        ArrayList<Dog> dogisList= new ArrayList<Dog>();
        dogisList.add(dog);
        dogisList.add(dogic);
        dogisList.add(new Dog("volic", 8));
        dogisList.add(new Dog("tomara",15));

//        for (Dog dog1: dogisList) {
//            System.out.println(dog1.getName());
//        }
//        System.out.println("-------------");
//        System.out.println(dogisList.contains(dogic));
//        System.out.println(dogisList.isEmpty());

        Collection newList = new ArrayList<>();
        newList.add(dog);
        newList.add(muric);

        for (Object o : newList) {
            if (o instanceof Cat){
                System.out.println(((Cat) o).getName());
            }
        }
    }
}
