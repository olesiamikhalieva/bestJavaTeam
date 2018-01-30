package ht8_26_01_18.t12.robots;

import ht8_26_01_18.t12.robotDetails.Hand;
import ht8_26_01_18.t12.robotDetails.Head;
import ht8_26_01_18.t12.robotDetails.Leg;

import java.util.Objects;

public class AstromechanicsDroid extends Robot {
    private String knowledge;

    public AstromechanicsDroid() {
    }

    public AstromechanicsDroid(String name, String model, Leg[] legs, Hand[] hands, Head[] heads, String knowledge) {
        super(name, model, legs, hands, heads);
        this.knowledge = knowledge;
    }

    public AstromechanicsDroid(String knowledge) {
        this.knowledge = knowledge;
    }

    public String getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(String knowledge) {
        this.knowledge = knowledge;
    }

    @Override
    public String toString() {
        return super.toString() +
                "{knowledge='" + knowledge + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AstromechanicsDroid)) return false; else System.out.println("brother");
        if (!super.equals(o)) return false;
        AstromechanicsDroid that = (AstromechanicsDroid) o;
        return Objects.equals(getKnowledge(), that.getKnowledge());
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), getKnowledge());
    }

}
