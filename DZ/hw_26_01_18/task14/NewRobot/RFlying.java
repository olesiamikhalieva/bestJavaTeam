package hw_26_01_18.task14.NewRobot;

import Robot.ComponentsRobot.ArmWing;
import Robot.ComponentsRobot.Head;
import Robot.ComponentsRobot.Leg;
import Robot.ComponentsRobot.Torso;
import Robot.Robot;

import java.util.Objects;

public class RFlying extends Robot {
    private ArmWing armWing1;
    private ArmWing armWing2;

    public RFlying(String name, Head head, ArmWing armWing1, ArmWing armWing2, Leg leg1, Leg leg2, Torso torso) {
        super(name, head, leg1, leg2, torso);
        this.armWing1 = armWing1;
        this.armWing2 = armWing2;
    }

    public ArmWing getArmWing1() {
        return armWing1;
    }

    public void setArmWing1(ArmWing armWing1) {
        this.armWing1 = armWing1;
    }

    public ArmWing getArmWing2() {
        return armWing2;
    }

    public void setArmWing2(ArmWing armWing2) {
        this.armWing2 = armWing2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RFlying rFlying = (RFlying) o;
        return Objects.equals(armWing1, rFlying.armWing1) &&
                Objects.equals(armWing2, rFlying.armWing2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), armWing1, armWing2);
    }
}
