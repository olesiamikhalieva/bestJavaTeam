package hw_04_03_18;
import hw_04_03_18.hw_07_02_18.*;
import hw_04_03_18.hw_07_02_18.Interfaces.CreateEggs;
import hw_04_03_18.hw_07_02_18.Interfaces.Run;
import hw_04_03_18.hw_07_02_18.Interfaces.Speak;

import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        printBirdsRun(birdsList());
        System.out.println();
        System.out.println();
        printBirdsSpeak(birdsList());
        System.out.println();
        System.out.println();
        printBirdsCreateEggs(birdsList());
        System.out.println();
        System.out.println();
        printBirdsSound(birdsList());
        System.out.println();
        System.out.println();
        printList(birdsList());

    }

    private static List birdsList() {

        List birdsList = new ArrayList();
        birdsList.add(new Duck());
        birdsList.add(new Duck());
        birdsList.add(new Eagle());
        birdsList.add(new Eagle());
        birdsList.add(new RubberDuck());
        birdsList.add(new RubberDuck());
        birdsList.add(new Parrot());
        birdsList.add(new Parrot());
        birdsList.add(new Ostrich());
        birdsList.add(new Ostrich());
        birdsList.add(new Penguin());
        birdsList.add(new Penguin());
        return birdsList;
    }

    private static void printList(List birdsList) {
        for (Object o : birdsList) {
            if (o instanceof Birds) {
                System.out.print("I am " + ((Birds) o).getName() + ". " + ((Birds) o).sound());
            }
            if (o instanceof CreateEggs) {
                System.out.print(" " + ((CreateEggs) o).createEggs());
            }
            if (o instanceof Run) {
                System.out.print(" I am ostrich. " + ((Run) o).run());
            }
            if (o instanceof Speak) {
                System.out.print(" Vasya, Vasya! I am parrot! " + ((Speak) o).speak());
            }
            System.out.println();
        }
    }

    private static void printBirdsRun(List birdsList) {
        for (Object o : birdsList) {
            if (o instanceof Run) {
                System.out.println(" I am ostrich. " + ((Run) o).run());
            }
        }
    }

    private static void printBirdsSpeak(List birdsList) {
        for (Object o : birdsList) {
            if (o instanceof Speak) {
                System.out.println(" Vasya, Vasya! I am parrot! " + ((Speak) o).speak());
            }
        }
    }

    private static void printBirdsCreateEggs(List birdsList) {
        for (Object o : birdsList) {
            if (o instanceof CreateEggs) {
                if (o instanceof Birds) {
                    System.out.println(((Birds) o).getName()+" " + ((CreateEggs) o).createEggs());
                }
            }
        }
    }

    private static void printBirdsSound(List birdsList) {
        for (Object o : birdsList) {
            if (o instanceof Birds) {
                System.out.println("I am " + ((Birds) o).getName() + ". " + ((Birds) o).sound());
            }
        }
    }

}
