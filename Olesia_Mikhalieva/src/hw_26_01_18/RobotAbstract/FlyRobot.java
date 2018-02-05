package hw_02_02_18.RobotAbstract;

import hw_02_02_18.RobotAbstract.PartsOfRobot.Body;
import hw_02_02_18.RobotAbstract.PartsOfRobot.Hand;
import hw_02_02_18.RobotAbstract.PartsOfRobot.Head;
import hw_02_02_18.RobotAbstract.PartsOfRobot.Leg;

import java.util.Objects;


public class FlyRobot extends Robot {
    String superSkill;
    String name;

    public FlyRobot() {
    }


    public FlyRobot(Head head, Body body, Leg leg, Hand hand, String superSkill) {
        super(head, body, leg, hand);
        this.superSkill = superSkill;
    }



    @Override
    public Head getHead() {
        return head;
    }

    @Override
    public Body getBody() {
        return body;
    }

    @Override
    public Leg getLeg() {
        return leg;
    }

    @Override
    public Hand getHand() {
        return hand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperSkill() {
        return superSkill;
    }

    public void setSuperSkill(String superSkill) {
        this.superSkill = superSkill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FlyRobot flyRobot = (FlyRobot) o;
        return Objects.equals(superSkill, flyRobot.superSkill);
    }

    @Override
    public int hashCode() {

        return Objects.hash(superSkill);
    }

    @Override
    public String toString() {
        return "FlyRobot "+ this.name;
    }
}
