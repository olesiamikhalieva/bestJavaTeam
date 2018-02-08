import ClassesBird.*;

/**
 * Created by java on 06.02.2018.
 */
public class Runner {
    public static void main(String[] args) {
        Bird eagle1 = new Eagle("Орел Бкргут");
        Bird eagle2 = new Eagle("Орел Ястребиный");
        Bird duck1 = new Duck("Утка Машка");
        Bird duck2 = new Duck("Утка Дашка");
        Bird rubberDuck1 = new RubberDuck("резиновая утка 1");
        Bird rubberDuck2 = new RubberDuck("резиновая утка 2");
        Bird ostrich1 = new Ostrich("Страус голова_в_песок");
        Bird ostrich2 = new Ostrich("Страус Василий");
        Bird parrot1 = new Parrot("Попугай Кеша");
        Bird parrot2 = new Parrot("Попугай Генадий");
        Bird penguin1 = new Penguin("Пенгвин Ло-ло");
        Bird penguin2 = new Penguin("Пенгвин Пе-пе");

        Bird[] birdMass = {eagle1,eagle2,duck1,duck2,rubberDuck1,rubberDuck2,ostrich1,
                ostrich2,parrot1,parrot2,penguin1,penguin2};
        for (Bird bird : birdMass) {
            System.out.println(bird.toString());
        }
//        Bird[] birdMass = {eagle,duck,rubberDuck};
//        for (Bird b:birdMass) {
//            b.sound();
//        }

//        CreateEggs penguin = new Penguin();
//        CreateEggs ducks = new Duck();
//
//        CreateEggs [] mass = new CreateEggs[2];
//        mass[0] = penguin;
//        mass[1] = ducks;
//
//        for (CreateEggs mas: mass) {
//            mas.createEggs();
//        }
//
    }
}
