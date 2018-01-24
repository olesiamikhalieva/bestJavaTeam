package Robot;

import Robot.ComponentsRobot.Hand;
import Robot.ComponentsRobot.Head;
import Robot.ComponentsRobot.Leg;
import Robot.ComponentsRobot.Torso;

public class Robot {

    private Head head;
    private Hand hand1;
    private Hand hand2;
    private Leg leg1;
    private Leg leg2;
    private Torso torso;

    public Robot() {
    }

    public Robot(Head head, Hand hand1, Hand hand2, Leg leg1, Leg leg2, Torso torso) {
        this.head = head;
        this.hand1 = hand1;
        this.hand2 = hand2;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.torso = torso;
        System.out.println("\nРобот собран правильно\n");
    }

    public Robot(Head head, Hand hand1, Leg leg1, Leg leg2, Torso torso) {
        this.head = head;
        this.hand1 = hand1;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.torso = torso;
        System.out.println("могу писать только одной рокой");
    }

    public Robot(Head head, Hand hand1, Hand hand2, Leg leg1, Torso torso) {
        this.head = head;
        this.hand1 = hand1;
        this.hand2 = hand2;
        this.leg1 = leg1;
        this.torso = torso;
        System.out.println("могу прыгать на 1 ноге");
    }

    public Robot(Hand hand1, Hand hand2, Leg leg1, Leg leg2, Torso torso) {
        this.hand1 = hand1;
        this.hand2 = hand2;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.torso = torso;
        System.out.println("не могу говорить");
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Hand getHand1() {
        return hand1;
    }

    public void setHand1(Hand hand1) {
        this.hand1 = hand1;
    }

    public Leg getLeg1() {
        return leg1;
    }

    public void setLeg1(Leg leg1) {
        this.leg1 = leg1;
    }

    public Torso getTorso() {
        return torso;
    }

    public void setTorso(Torso torso) {
        this.torso = torso;
    }

    public Hand getHand2() {
        return hand2;
    }

    public void setHand2(Hand hand2) {
        this.hand2 = hand2;
    }

    public Leg getLeg2() {
        return leg2;
    }

    public void setLeg2(Leg leg2) {
        this.leg2 = leg2;
    }
}
