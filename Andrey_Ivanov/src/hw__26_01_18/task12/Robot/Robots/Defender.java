package hw__26_01_18.task12.Robot.Robots;

import hw__26_01_18.task12.Robot.PartsOfRobots.Foot;
import hw__26_01_18.task12.Robot.PartsOfRobots.Hand;
import hw__26_01_18.task12.Robot.PartsOfRobots.Head;

public class Defender extends Robot {

    private String armor;

    public Defender() {
    }

    public Defender(Hand hand, Foot foot, Head head, String name, String armor) {
        super(hand, foot, head, name);
        this.armor = armor;
    }

    public String getArmor() {
        return armor;
    }

    public void setArmor(String armor) {
        this.armor = armor;
    }

    public void infoDefender() {
        System.out.println("Кол-во рук у робота " + this.getName() + ":" + getHand().getCountOfHands());
        System.out.println("Кол-во ног у робота " + this.getName() + ":" + getFoot().getCountOfFoots());
        System.out.println("У робота " + getName() + " есть голова:" + this.getHead().isHead());
        System.out.println(getName() + " умеет писать:" + this.getHand().isWrite());
        System.out.println(getName() + " умеет ходить:" + this.getFoot().isWalk());
        System.out.println(getName() + " умеет говорить:" + this.getHead().isSpeak() + "\n");

    }


}