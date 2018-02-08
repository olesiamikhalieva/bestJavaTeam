package hw_07_02_18.Ferma;

import java.sql.SQLOutput;

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

    private static Bird[] massBirds;

    public static void main(String[] args) {


        createBirds();

        fillingInMassBirds();

        allBirds();

        knowsHowToRun();

        knowsHowToSpeak();

        knowsHowToCreateEggs();

    }

    public static void fillingInMassBirds() {
        massBirds = new Bird[12];
        massBirds[0] = duck1;
        massBirds[1] = duck2;
        massBirds[2] = eagl1;
        massBirds[3] = eagl2;
        massBirds[4] = ostrich1;
        massBirds[5] = ostrich2;
        massBirds[6] = penguin1;
        massBirds[7] = penguin2;
        massBirds[8] = perrot1;
        massBirds[9] = perrot2;
        massBirds[10] = rubberDuck1;
        massBirds[11] = rubberDuck12;

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
        for (int i = 0; i < massBirds.length; i++) {
            if (massBirds[i] instanceof Run) {
                System.out.println(massBirds[i].getName()+",боевой клич="+massBirds[i].sound()+","+((Run)massBirds[i]).run());
            }
        }
        System.out.println("-------------------");
    }

    private static void knowsHowToSpeak() {
        System.out.println("Вывод птиц, которые умею говорить:");
        for (int i = 0; i < massBirds.length; i++) {
            if (massBirds[i] instanceof Speak) {
                System.out.println(massBirds[i].getName()+",боевой клич="+massBirds[i].sound()+","+((Speak)massBirds[i]).speak());

            }
        }
        System.out.println("-------------------");
    }

    private static void knowsHowToCreateEggs() {
        System.out.println("Вывод птиц, которые умеют нести яйца:");
        for (int i = 0; i < massBirds.length; i++) {
            if (massBirds[i] instanceof CreateEggs) {
                System.out.println(massBirds[i].getName()+",боевой клич="+massBirds[i].sound()+","+((CreateEggs)massBirds[i]).createEggs());
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