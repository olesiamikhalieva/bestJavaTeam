package hw6_06_02_18;
import hw6_06_02_18.ClassesBird.*;
import hw6_06_02_18.Interface.*;

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

        Bird[] birdMass = {eagle1, eagle2, duck1, duck2, rubberDuck1, rubberDuck2, ostrich1,
                ostrich2, parrot1, parrot2, penguin1, penguin2};

        //вывод всех птиц и их способностей (задание 2)

        for (Bird bird : birdMass) {
            System.out.println(bird.toString());
        }

        System.out.println("----------------А кто у наст тут бегает?----------------------");

        //Вывод птичека по их особым характеристикам(задание 1)
        for (Bird bird : birdMass) {
            if (bird instanceof RunLikeAntelope) {
                System.out.println(bird.getBirdName() + " Умеет бегать как Антилопа ");
            }
        }

        System.out.println("------------------А кто у нас тут говорит?--------------------");
        for (Bird bird : birdMass) {
            if (bird instanceof SpeakLikeMan) {
                System.out.println(bird.getBirdName() + " Умеет говорить как Антилопа ");
            }
        }

        System.out.println("------------------А кто у нас тут яйцеклад?--------------------");
        for (Bird bird : birdMass) {
            if (bird instanceof CreateEggs) {
                System.out.println(bird.getBirdName() + " Умеет нести яички ");
            }
        }

        System.out.println("------------------А кто как орёт?--------------------");
        for (Bird bird : birdMass) {
            System.out.println(bird.getBirdName() + " орет так: " + bird.sound());
        }
    }
}

