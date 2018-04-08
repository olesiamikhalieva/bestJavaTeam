package hw6_06_02_18;

import hw6_06_02_18.ClassesBird.*;
import hw6_06_02_18.Interface.CreateEggs;
import hw6_06_02_18.Interface.RunLikeAntelope;
import hw6_06_02_18.Interface.SpeakLikeMan;

import java.util.ArrayList;

public class RunColl {
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

        ArrayList<Bird> birdList = new ArrayList<>();

        birdList.add(eagle1);
        birdList.add(eagle2);
        birdList.add(duck1);
        birdList.add(duck2);
        birdList.add(rubberDuck1);
        birdList.add(rubberDuck2);
        birdList.add(ostrich1);
        birdList.add(ostrich2);
        birdList.add(parrot1);
        birdList.add(parrot2);
        birdList.add(penguin1);
        birdList.add(penguin2);

        for (Bird bird : birdList) {
            System.out.println(bird.toString());
        }

        System.out.println("----------------А кто у наст тут бегает?----------------------");

        //Вывод птичека по их особым характеристикам(задание 1)
        for (Bird bird : birdList) {
            if (bird instanceof RunLikeAntelope) {
                System.out.println(bird.getBirdName() + " Умеет бегать как Антилопа ");
            }
        }

        System.out.println("------------------А кто у нас тут говорит?--------------------");
        for (Bird bird : birdList) {
            if (bird instanceof SpeakLikeMan) {
                System.out.println(bird.getBirdName() + " Умеет говорить как Антилопа ");
            }
        }

        System.out.println("------------------А кто у нас тут яйцеклад?--------------------");
        for (Bird bird : birdList) {
            if (bird instanceof CreateEggs) {
                System.out.println(bird.getBirdName() + " Умеет нести яички ");
            }
        }

        System.out.println("------------------А кто как орёт?--------------------");
        for (Bird bird : birdList) {
            System.out.println(bird.getBirdName() + " орет так: " + bird.sound());
        }
    }
}
