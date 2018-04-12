package hw4_26_01_18.task14.ComponentsRobot;

import java.util.Objects;

public class Arm {

    private String typeArm;

    public Arm() {
    }

    public Arm(String typeArm) {
        this.typeArm = typeArm;
    }

    public String getTypeArm() {
        return typeArm;
    }

    public void setTypeArm(String typeArm) {
        this.typeArm = typeArm;
    }

    public void write() {
        System.out.println("Пишу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Arm arm = (Arm) o;
        return Objects.equals(typeArm, arm.typeArm);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeArm);
    }
}

