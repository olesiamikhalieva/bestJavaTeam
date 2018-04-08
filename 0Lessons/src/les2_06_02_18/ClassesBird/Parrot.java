package les2_06_02_18.ClassesBird;

import les2_06_02_18.Interface.CreateEggs;
import les2_06_02_18.Interface.Fly;
import les2_06_02_18.Interface.SpeakLikeMan;

public class Parrot extends Bird implements SpeakLikeMan,Fly,CreateEggs {
    public Parrot(String birdName) {
        super(birdName);
    }

    @Override
    public void sound() {
        System.out.println("cvir-cvir");
    }
    @Override
    public void createEggs() {
        System.out.println("I am a Parrot, i can create eggs");
    }
    @Override
    public void speakLikeMan() {
        System.out.println("I can speak like people");
    }



    @Override
    public void fly() {
        System.out.println("I am a Parrot, i can fly");
    }
}
