package hw_07_02_18;


import hw_07_02_18.Interfaces.CreateEggs;
import hw_07_02_18.Interfaces.Fly;
import hw_07_02_18.Interfaces.showAll;

public class Eagle extends Birds implements Fly,CreateEggs, showAll {

        @Override
        public void fly() {
            System.out.print(" I am eagle. I fly in the sky.");
        }

        @Override
        public void sound() {
            System.out.print("I am eagle. EEEE.");
        }

        @Override
        public void createEggs() {
            System.out.print("I am eagle. I can create eggs.");
        }

        @Override
        public void show() {
            System.out.println();
            System.out.println("____________");
            System.out.print("Eagle: ");
            sound();
            System.out.print("+");
            createEggs();
            System.out.print("+");
            fly();
        }
    }


