package task14.NewRobot;

import task14.ComponentsRobot.Arm;
import task14.ComponentsRobot.Head;
import task14.ComponentsRobot.Leg;
import task14.ComponentsRobot.Torso;
import task14.Robot;

import java.util.Objects;

public class RFly extends Robot {
    private String superParam;

    public RFly(String name, Head head, Arm arm1, Arm arm2, Leg leg1, Leg leg2, Torso torso, String superParam) {
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
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
