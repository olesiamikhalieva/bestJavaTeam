package hw_02_02_18.RobotAbstract;

import hw_02_02_18.RobotAbstract.PartsOfRobot.Body;
import hw_02_02_18.RobotAbstract.PartsOfRobot.Hand;
import hw_02_02_18.RobotAbstract.PartsOfRobot.Head;
import hw_02_02_18.RobotAbstract.PartsOfRobot.Leg;

import java.util.Objects;

public class FireRobot extends Robot{
    String superSkills;
    String name;


    public FireRobot() {
    }

    public FireRobot(Head head, Body body, Leg leg, Hand hand, String superSkills) {
        super(head, body, leg, hand);
        this.superSkills = superSkills;
    }


    public String getSuperSkills() {
        return superSkills;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSuperSkills(String superSkills) {
        this.superSkills = superSkills;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FireRobot fireRobot = (FireRobot) o;
        return Objects.equals(superSkills, fireRobot.superSkills);
    }

    @Override
    public int hashCode() {

        return Objects.hash(superSkills);
    }

    @Override
    public String toString() {
        return "FireRobot"+this.name;
    }
}
