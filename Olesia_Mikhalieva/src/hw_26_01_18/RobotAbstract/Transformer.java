package hw_26_01_18.RobotAbstract;

import hw_26_01_18.RobotAbstract.PartsOfRobot.Body;
import hw_26_01_18.RobotAbstract.PartsOfRobot.Hand;
import hw_26_01_18.RobotAbstract.PartsOfRobot.Head;
import hw_26_01_18.RobotAbstract.PartsOfRobot.Leg;

import java.util.Objects;

public class Transformer extends Robot{
    String superSkill;
    String name;


    public Transformer() {
    }

    public Transformer(Head head, Body body, Leg leg, Hand hand, String superSkill) {
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
        Transformer transformer = (Transformer) o;
        return Objects.equals(superSkill, transformer.superSkill);
    }

    @Override

    public int hashCode() {

        return Objects.hash(superSkill);
    }

    @Override
    public String toString() {
        return "Transformer "+this.name;
    }
}
