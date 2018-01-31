package Animal;

/**
 * Created by java on 30.01.2018.
 */
public class AnimalsMain {
    public static void main(String[] args) {
        Cat cat = new Cat("oval","Vaska");

        Dog dog = new Dog("oval","Vaska");
//
//        Dog [] dogMass = new Dog[3];
//        dogMass[0] = dog;
//        dogMass[1] = cat;
//
//        Animals cat1 = new Cat("oval","Vaska");
//        Animals dog1 = new Dog("oval","Vaska");
//
        Animals [] animMass = new Animals[2];

        animMass[0] = cat;
        animMass[1] = dog;

        for (Animals animMas : animMass) {
            if( animMas instanceof Dog){
                animMas.sayMyNameAndWhatICan();
            }


        }


        System.out.println(cat.getName().equals(dog.getName()));
        if (cat.getName() == dog.getName()){
            System.out.println("trueee");
        }

        System.out.println( cat instanceof Cat);

        System.out.println(cat.equals(dog));
        System.out.println(cat.hashCode());
        System.out.println(dog.hashCode());
    }
}
