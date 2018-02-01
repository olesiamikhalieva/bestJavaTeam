package hw__26_01_18.task14.Robot.Robots;

import hw__26_01_18.task14.Robot.PartsOfRobots.Foot;
import hw__26_01_18.task14.Robot.PartsOfRobots.Hand;
import hw__26_01_18.task14.Robot.PartsOfRobots.Head;

import java.util.Objects;

public class Robot {
    private Hand hand;
    private Foot foot;
    private Head head;
    private String name;

    public Robot() {
    }

    public Robot(Head head, String name) {
        this.head = head;
        this.name = name;
    }

    public Robot(Hand hand, Foot foot, Head head, String name) {
        this.hand = hand;
        this.foot = foot;
        this.head = head;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Foot getFoot() {
        return foot;
    }

    public void setFoot(Foot foot) {
        this.foot = foot;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }



    public void setName(String name) {
        this.name = name;
    }

    public void infoRobot() {
        System.out.println("Кол-во рук у робота " + getName() + ":" + getHand().getCountOfHands());
        System.out.println("Кол-во ног у робота " + getName() + ":" + getFoot().getCountOfFoots());
        System.out.println("У робота " + getName() + " есть голова:" + getHead().isHead());
        System.out.println(getName() + " умеет писать:" + getHand().isWrite());
        System.out.println(getName() + " умеет ходить:" + getFoot().isWalk());
        System.out.println(getName() + " умеет говорить:" + getHead().isSpeak() + "\n");
        if (hand.getCountOfHands() == 2 && foot.getCountOfFoots() == 2 && getHead().isHead() == true)
            System.out.println("Робот " + name + " готов, я умею говорить,я умею ходить,я умею писать.");
        if (hand.getCountOfHands() != 2)
            System.out.println("Требуется доработка: могу писать только одной рукой.");
        if (foot.getCountOfFoots() != 2)
            System.out.println("Требуется доработка: могу только прыгать на одной ноге.");
        if (getHead().isHead() != true)
            System.out.println("Требуется доработка: не могу говорить.");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return Objects.equals(hand, robot.hand) &&
                Objects.equals(foot, robot.foot) &&
                Objects.equals(head, robot.head) &&
                Objects.equals(name, robot.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(hand, foot, head, name);
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
