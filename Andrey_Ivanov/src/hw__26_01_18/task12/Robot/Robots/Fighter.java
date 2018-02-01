package hw__26_01_18.task12.Robot.Robots;

import hw__26_01_18.task12.Robot.PartsOfRobots.Foot;
import hw__26_01_18.task12.Robot.PartsOfRobots.Hand;
import hw__26_01_18.task12.Robot.PartsOfRobots.Head;

public class Fighter extends Robot {

    private String fight;

    public Fighter() {
    }

    public String getFight() {
        return fight;
    }

    public Fighter(Hand hand, Foot foot, Head head, String name, String fight) {
        super(hand, foot, head, name);
        this.fight = fight;
    }

    public void setFight(String fight) {
        this.fight = fight;
    }
    public void infoFighter() {
        System.out.println("Кол-во рук у робота " + this.getName() + ":" + getHand().getCountOfHands());
        System.out.println("Кол-во ног у робота " + this.getName() + ":" + getFoot().getCountOfFoots());
        System.out.println("У робота " + getName() + " есть голова:" + this.getHead().isHead());
        System.out.println(getName() + " умеет писать:" + this.getHand().isWrite());
        System.out.println(getName() + " умеет ходить:" + this.getFoot().isWalk());
        System.out.println(getName() + " умеет говорить:" + this.getHead().isSpeak() + "\n");

    }
}
