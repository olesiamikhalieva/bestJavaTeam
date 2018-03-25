package hw3_23_01_18.Robot.NewRobot;

import hw3_23_01_18.Robot.Robot;
import hw3_23_01_18.Robot.ComponentsRobot.*;

import java.util.Objects;

public class RSwimming extends Robot {
    private ArmFin armFin1;
    private ArmFin armFin2;

    public RSwimming(String name, Head head, ArmFin armFin1, ArmFin armFin2, Leg leg1, Leg leg2, Torso torso) {
        super(name, head, leg1, leg2, torso);
        this.armFin1 = armFin1;
        this.armFin2 = armFin2;
    }

    public ArmFin getArmFin1() {
        return armFin1;
    }

    public void setArmFin1(ArmFin armFin1) {
        this.armFin1 = armFin1;
    }

    public ArmFin getArmFin2() {
        return armFin2;
    }

    public void setArmFin2(ArmFin armFin2) {
        this.armFin2 = armFin2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RSwimming rSwimming = (RSwimming) o;
        return Objects.equals(armFin1, rSwimming.armFin1) &&
                Objects.equals(armFin2, rSwimming.armFin2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), armFin1, armFin2);
    }
}
