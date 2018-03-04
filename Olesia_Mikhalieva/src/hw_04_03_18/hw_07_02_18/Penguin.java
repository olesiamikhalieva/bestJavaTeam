package hw_04_03_18.hw_07_02_18;

import hw_04_03_18.hw_07_02_18.Interfaces.CreateEggs;


public class Penguin extends Birds implements CreateEggs {
    @Override
    public String sound() {
        return "I say gui gui.";
    }


    @Override
    public String createEggs() {
        return "I can create eggs.";
    }

    @Override
    public String getName(){
       return "penguin";
    }
}
