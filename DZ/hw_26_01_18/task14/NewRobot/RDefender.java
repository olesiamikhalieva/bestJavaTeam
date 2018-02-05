package task14.NewRobot;

import task14.ComponentsRobot.Arm;
import task14.ComponentsRobot.Head;
import task14.ComponentsRobot.Leg;
import task14.ComponentsRobot.Torso;
import task14.Robot;

import java.util.Objects;

public class RDefender extends Robot{
     private String superParam;

    public RDefender(String name, Head head, Arm arm1, Arm arm2, Leg leg1, Leg leg2, Torso torso, String superParam) {
        super(name, head, arm1, arm2, leg1, leg2, torso);
        this.superParam = superParam;
    }

    public String getSuperParam() {
        return superParam;
    }

    public void setSuperParam(String superParam) {
        this.superParam = superParam;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RDefender rDefender = (RDefender) o;
        return Objects.equals(superParam, rDefender.superParam);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), superParam);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
