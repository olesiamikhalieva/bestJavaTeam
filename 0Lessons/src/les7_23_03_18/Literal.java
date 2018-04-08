package les7_23_03_18;

/**
 * Created by java on 23.03.2018.
 */
public class Literal {
    int number;
    String lit;

    public Literal(int number, String lit) {
        this.number = number;
        this.lit = lit;
    }

    public String getLit() {

        return lit;
    }

    public void setLit(String lit) {
        this.lit = lit;
    }

    public int getNumber() {

        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
