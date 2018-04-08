package hw6_06_02_18.ClassesBird;

import hw6_06_02_18.Interface.CreateEggs;
import hw6_06_02_18.Interface.Fly;
import hw6_06_02_18.Interface.SpeakLikeMan;

public class Parrot extends Bird implements SpeakLikeMan, Fly, CreateEggs {
    public Parrot(String birdName) {
        super(birdName);
    }

    @Override
    public String sound() {
        return " cvir-cvir ";
    }

    @Override
    public String createEggs() {
        return " I am a Parrot, i can create eggs ";
    }

    @Override
    public String speakLikeMan() {
        return " I can speak like people ";
    }

    @Override
    public String fly() {
        return " I am a Parrot, i can fly ";
    }

    @Override
    public String toString() {
        return "Bird{ " +
                " Имя птички= ' " + super.getBirdName() + '\'' +
                " Боевой клич= ' " + sound() + '\''+
                createEggs() + '\''+
                "Вась Вась Я ПОПУГАЙ ' " + speakLikeMan() + '\''+
                '}';
    }
}
