package hw3_23_01_18.Robot.NewRobot;

import hw3_23_01_18.Robot.Robot;

import java.util.Objects;
import hw3_23_01_18.Robot.ComponentsRobot.*;

public class RWar extends Robot {
    private ArmWeapon armWeapon1;
    private ArmWeapon armWeapon2;

    public RWar(String name, Head head, ArmWeapon armWeapon1, ArmWeapon armWeapon2, Leg leg1, Leg leg2, Torso torso) {
        super(name, head, leg1, leg2, torso);
        this.armWeapon1 = armWeapon1;
        this.armWeapon2 = armWeapon2;
    }

    public ArmWeapon getArmWeapon1() {
        return armWeapon1;
    }

    public void setArmWeapon1(ArmWeapon armWeapon1) {
        this.armWeapon1 = armWeapon1;
    }

    public ArmWeapon getArmWeapon2() {
        return armWeapon2;
    }

    public void setArmWeapon2(ArmWeapon armWeapon2) {
        this.armWeapon2 = armWeapon2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        RWar rWar = (RWar) o;
        return Objects.equals(armWeapon1, rWar.armWeapon1) &&
                Objects.equals(armWeapon2, rWar.armWeapon2);
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), armWeapon1, armWeapon2);
    }
}
