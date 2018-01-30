package ht8_26_01_18.t12.robots;

import ht8_26_01_18.t12.robotDetails.Hand;
import ht8_26_01_18.t12.robotDetails.Head;
import ht8_26_01_18.t12.robotDetails.Leg;

import java.util.Objects;

public class MedicalDroid extends Robot {
    private String medicine;

    public MedicalDroid() {
    }

    public MedicalDroid(String name, String model, Leg[] legs, Hand[] hands, Head[] heads, String medicine) {
        super(name, model, legs, hands, heads);
        this.medicine = medicine;
    }

    public MedicalDroid(String medicine) {
        this.medicine = medicine;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{medicine='" + medicine + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MedicalDroid))  return false; else System.out.println("brother");
        if (!super.equals(o)) return false;
        MedicalDroid that = (MedicalDroid) o;
        return Objects.equals(getMedicine(), that.getMedicine());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getMedicine());
    }

}
