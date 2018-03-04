package hw_04_03_18.hw_07_02_18;


import hw_04_03_18.hw_07_02_18.Interfaces.CreateEggs;
import hw_04_03_18.hw_07_02_18.Interfaces.Fly;

public class Eagle extends Birds implements Fly,CreateEggs {

        @Override
        public void fly() {
            System.out.print(" I am eagle. I fly in the sky.");
        }

        @Override
        public String sound() {
            return "I have sound: EEEE.";
        }

        @Override
        public String createEggs() {
            return "I can create eggs.";
        }

        @Override
        public String getName() {
           return "eagle";
        }
    }


