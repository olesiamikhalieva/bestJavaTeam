package ht8_26_01_18.t12.robots;

import ht8_26_01_18.t12.robotDetails.Hand;
import ht8_26_01_18.t12.robotDetails.Head;
import ht8_26_01_18.t12.robotDetails.Leg;

import java.util.Objects;

public class BattleDroid extends Robot{
    private String weapon;

    public BattleDroid() {
    }

    public BattleDroid(String weapon) {
        this.weapon = weapon;
    }

    public BattleDroid(String name, String model, Leg[] legs, Hand[] hands, Head[] heads, String weapon) {
        super(name, model, legs, hands, heads);
        this.weapon = weapon;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BattleDroid))  return false; else System.out.println("brother");
        if (!super.equals(o)) return false;
        BattleDroid that = (BattleDroid) o;
        return Objects.equals(getWeapon(), that.getWeapon());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getWeapon());
    }

}
