package hw_07_02_18;

import hw_07_02_18.Interfaces.CreateEggs;
import hw_07_02_18.Interfaces.Run;
import hw_07_02_18.Interfaces.Speak;
import hw_07_02_18.Interfaces.showAll;

public class Runner {

    public static void main(String[] args) {
        birdsRun();
        System.out.println();
        System.out.println();
        birdsSpeak();
        System.out.println();
        System.out.println();
        birdsCreateEggs();
        System.out.println();
        System.out.println();
        birdsSound();
        System.out.println();
        System.out.println();
        allShow();

    }

    private static void allShow() {

        showAll duck = new Duck();
        showAll eagle = new Eagle();
        showAll rubberDuck = new RubberDuck();
        showAll parrot = new Parrot();
        showAll ostrich = new Ostrich();
        showAll penguin = new Penguin();
        showAll[] masShow = {duck, eagle, ostrich, parrot, penguin, rubberDuck};
        for (showAll all : masShow) {
            all.show();
        }
    }


    private static void birdsRun() {
        System.out.println("Birds which can run:");
        Run ostrich1 = new Ostrich();
        Run[] masRun = {ostrich1};
        for (Run run : masRun) {
            run.run();
        }
    }


    public static void birdsSpeak() {
        System.out.println("Birds which can speak:");
        Speak parrot1 = new Parrot();
        Speak[] masSpeak = {parrot1};
        for (Speak speak : masSpeak) {
            speak.speak();
        }
    }

    private static void birdsCreateEggs() {
        System.out.println("Birds which can create eggs:");
        CreateEggs ostrich2 = new Ostrich();
        CreateEggs penguin = new Penguin();
        CreateEggs ducks = new Duck();
        CreateEggs parrot2 = new Parrot();
        CreateEggs eagle1 = new Eagle();

        CreateEggs[] mas = {ostrich2, penguin, ducks, parrot2, eagle1};

        for (CreateEggs ma : mas) {
            ma.createEggs();
            System.out.print("//");
        }
    }


    private static void birdsSound() {
        System.out.println("Birds sound:");
        Birds duckB = new Duck();
        Birds eagleB = new Eagle();
        Birds rubberDuckB = new RubberDuck();
        Birds parrotB = new Parrot();
        Birds ostrichB = new Ostrich();
        Birds[] birds = {duckB, eagleB, rubberDuckB, parrotB, ostrichB};
        for (Birds bird : birds) {
            bird.sound();
            System.out.print("//");
        }
    }


}


