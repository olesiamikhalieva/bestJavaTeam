package hw_02_03_18.Ferma;

import hw_02_03_18.Ferma.Behaviors.CreateEggs;
import hw_02_03_18.Ferma.Behaviors.Run;
import hw_02_03_18.Ferma.Behaviors.Speak;
import hw_02_03_18.Ferma.Birds.*;

import java.util.ArrayList;

public class Runner {

    private static Bird duck1;
    private static Bird duck2;
    private static Bird eagl1;
    private static Bird eagl2;
    private static Bird ostrich1;
    private static Bird ostrich2;
    private static Bird penguin1;
    private static Bird penguin2;
    private static Bird perrot1;
    private static Bird perrot2;
    private static Bird rubberDuck1;
    private static Bird rubberDuck12;

    private static ArrayList<Bird> massBirds;

    public static void main(String[] args) {


        createBirds();

        fillingInMassBirds();

        allBirds();

        knowsHowToRun();

        knowsHowToSpeak();

        knowsHowToCreateEggs();

    }

    public static void fillingInMassBirds() {

        massBirds=new ArrayList<>();
        massBirds.add(duck1);
        massBirds.add(duck2);
        massBirds.add(eagl1);
        massBirds.add(eagl2);
        massBirds.add(ostrich1);
        massBirds.add(ostrich2);
        massBirds.add(penguin1);
        massBirds.add(penguin2);
        massBirds.add(perrot1);
        massBirds.add(perrot2);
        massBirds.add(rubberDuck1);
        massBirds.add(rubberDuck12);


    }

    private static void createBirds() {

        duck1 = new Duck("Kachka");
        duck2 = new Duck("Kochka");
        eagl1 = new Eagl("Alik");
        eagl2 = new Eagl("Arnold");
        ostrich1 = new Ostrich("Emu");
        ostrich2 = new Ostrich("Kiko");
        penguin1 = new Penguin("Lola");
        penguin2 = new Penguin("Roni");
        perrot1 = new Perrot("Kesha");
        perrot2 = new Perrot("Kakadu");
        rubberDuck1 = new RubberDuck("Artificial");
        rubberDuck12 = new RubberDuck("Toy");

    }

    private static void knowsHowToRun() {
        System.out.println("Вывод птиц, которые быстро бегают:");
        for (Bird massBird : massBirds) {
            if(massBird instanceof Run){
                System.out.println(massBird.getName()+",боевой клич="+massBird.sound()+","+((Run)massBird).run());
            }
        }
        System.out.println("-------------------");
    }

    private static void knowsHowToSpeak() {
        System.out.println("Вывод птиц, которые умею говорить:");
        for (Bird massBird : massBirds) {
            if(massBird instanceof Speak){
                System.out.println(massBird.getName()+",боевой клич="+massBird.sound()+","+((Speak)massBird).speak());
            }
        }
        System.out.println("-------------------");
    }

    private static void knowsHowToCreateEggs() {
        System.out.println("Вывод птиц, которые умеют нести яйца:");
        for (Bird massBird : massBirds) {
            if(massBird instanceof CreateEggs){
                System.out.println(massBird.getName()+",боевой клич="+massBird.sound()+","+((CreateEggs)massBird).createEggs());
            }
        }
        System.out.println("-------------------");
    }
    private static void allBirds(){
        System.out.println("Вывод всех птиц:");
        for (Bird massBird : massBirds) {
            System.out.println(massBird.toString());
        }
        System.out.println("---------------------");

    }

}