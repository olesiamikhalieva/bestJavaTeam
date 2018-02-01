package hw__26_01_18.task14.Robot.Robots;

import hw__26_01_18.task14.Robot.PartsOfRobots.Foot;
import hw__26_01_18.task14.Robot.PartsOfRobots.Hand;
import hw__26_01_18.task14.Robot.PartsOfRobots.Head;

import java.util.Objects;

public class Defender extends Robot {

    private int armor;

    public Defender() {
    }

    public Defender(Hand hand, Foot foot, Head head, String name, int armor) {
        super(hand, foot, head, name);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void infoDefender() {
        System.out.println("Кол-во рук у робота " + this.getName() + ":" + getHand().getCountOfHands());
        System.out.println("Кол-во ног у робота " + this.getName() + ":" + getFoot().getCountOfFoots());
        System.out.println("У робота " + getName() + " есть голова:" + this.getHead().isHead());
        System.out.println(getName() + " умеет писать:" + this.getHand().isWrite());
        System.out.println(getName() + " умеет ходить:" + this.getFoot().isWalk());
        System.out.println(getName() + " умеет говорить:" + this.getHead().isSpeak());
        System.out.println("Уникальный параметр робота "+getName()+":"+getArmor()+"\n");
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
        Defender defender = (Defender) o;
        return Objects.equals(armor, defender.armor);
    }

    @Override
    public int hashCode() {

        return Objects.hash(armor);
    }

    @Override
    public String toString() {
        return "Defender{" +
                "armor='" + armor + '\'' +
                '}';
    }
}