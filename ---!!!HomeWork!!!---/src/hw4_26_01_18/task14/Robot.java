package hw4_26_01_18.task14;

import hw4_26_01_18.task14.ComponentsRobot.Arm;
import hw4_26_01_18.task14.ComponentsRobot.Head;
import hw4_26_01_18.task14.ComponentsRobot.Leg;
import hw4_26_01_18.task14.ComponentsRobot.Torso;

import java.util.Objects;

public class Robot {

    private String name;
    private Head head;
    private Arm arm1;
    private Arm arm2;
    private Leg leg1;
    private Leg leg2;
    private Torso torso;

    public Robot() {
    }

    public Robot(String name, Head head, Arm arm1, Arm arm2, Leg leg1, Leg leg2, Torso torso) {
        this.name = name;
        this.head = head;
        this.arm1 = arm1;
        this.arm2 = arm2;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.torso = torso;
        //System.out.println("\nРобот собран правильно\n");
    }

    public Robot(Head head, Arm arm1, Leg leg1, Leg leg2, Torso torso) {
        this.head = head;
        this.arm1 = arm1;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.torso = torso;
        System.out.println("могу писать только одной рукой");
    }

    public Robot(Head head, Arm arm1, Arm arm2, Leg leg1, Torso torso) {
        this.head = head;
        this.arm1 = arm1;
        this.arm2 = arm2;
        this.leg1 = leg1;
        this.torso = torso;
        System.out.println("могу прыгать на 1 ноге");
    }

    public Robot(Arm arm1, Arm arm2, Leg leg1, Leg leg2, Torso torso) {
        this.arm1 = arm1;
        this.arm2 = arm2;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.torso = torso;
        System.out.println("не могу говорить");
    }

    public Robot(String name, Head head, Leg leg1, Leg leg2, Torso torso) {
        this.name = name;
        this.head = head;
        this.leg1 = leg1;
        this.leg2 = leg2;
        this.torso = torso;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public Arm getArm1() {
        return arm1;
    }

    public void setArm1(Arm arm1) {
        this.arm1 = arm1;
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

    public Arm getArm2() {
        return arm2;
    }

    public void setArm2(Arm arm2) {
        this.arm2 = arm2;
    }

    public Leg getLeg2() {
        return leg2;
    }

    public void setLeg2(Leg leg2) {
        this.leg2 = leg2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Robot robot = (Robot) o;
        return Objects.equals(head, robot.head) &&
                Objects.equals(arm1, robot.arm1) &&
                Objects.equals(arm2, robot.arm2) &&
                Objects.equals(leg1, robot.leg1) &&
                Objects.equals(leg2, robot.leg2) &&
                Objects.equals(torso, robot.torso);
    }

    @Override
    public int hashCode() {

        return Objects.hash(head, arm1, arm2, leg1, leg2, torso);
    }

    @Override
    public String toString() {
        return "\nRobot{" +
                "name='" + name + '\'' +
                ", class=" + getClass() +
                '}';
    }
}
