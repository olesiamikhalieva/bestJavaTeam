package hw__26_01_18.task14.Robot.Robots;

import hw__26_01_18.task14.Robot.PartsOfRobots.Foot;
import hw__26_01_18.task14.Robot.PartsOfRobots.Hand;
import hw__26_01_18.task14.Robot.PartsOfRobots.Head;

import java.util.Objects;

public class Fighter extends Robot {

    private int fight;

    public Fighter() {
    }

    public int getFight() {
        return fight;
    }

    public Fighter(Hand hand, Foot foot, Head head, String name, int fight) {
        super(hand, foot, head, name);
        this.fight = fight;
    }

    public void setFight(int fight) {
        this.fight = fight;
    }
    public void infoFighter() {
        System.out.println("Кол-во рук у робота " + this.getName() + ":" + getHand().getCountOfHands());
        System.out.println("Кол-во ног у робота " + this.getName() + ":" + getFoot().getCountOfFoots());
        System.out.println("У робота " + getName() + " есть голова:" + this.getHead().isHead());
        System.out.println(getName() + " умеет писать:" + this.getHand().isWrite());
        System.out.println(getName() + " умеет ходить:" + this.getFoot().isWalk());
        System.out.println(getName() + " умеет говорить:" + this.getHead().isSpeak());
        System.out.println("Уникальный параметр робота "+getName()+":"+getFight()+"\n");
        if (getHand().getCountOfHands() == 2 && getFoot().getCountOfFoots() == 2 && getHead().isHead() == true)
            System.out.println("Робот "+getName()+" готов, я умею говорить,я умею ходить,я умею писать.");
        if (getHand().getCountOfHands() != 2)
            System.out.println("Требуется доработка: могу писать только одной рукой.");
        if (getFoot().getCountOfFoots() != 2)
            System.out.println("Требуется доработка: могу только прыгать на одной ноге.");
        if (getHead().isHead() != true)
            System.out.println("Требуется доработка: не могу говорить.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fighter fighter = (Fighter) o;
        return Objects.equals(fight, fighter.fight);
    }

    @Override
    public int hashCode() {

        return Objects.hash(fight);
    }

    @Override
    public String toString() {
        return "Fighter{" +
                "fight='" + fight + '\'' +
                '}';
    }
}
