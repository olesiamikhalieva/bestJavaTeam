package task14.ComponentsRobot;

import java.util.Objects;

public class Leg {

    private String typeLeg;

    public Leg() {
    }

    public Leg(String typeLeg) {

        this.typeLeg = typeLeg;
    }

    public String getTypeLeg() {
        return typeLeg;
    }

    public void setTypeLeg(String typeLeg) {
        this.typeLeg = typeLeg;
    }

    public void run(){
        System.out.println("Хожу");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Leg leg = (Leg) o;
        return Objects.equals(typeLeg, leg.typeLeg);
    }

    @Override
    public int hashCode() {

        return Objects.hash(typeLeg);
    }
}
