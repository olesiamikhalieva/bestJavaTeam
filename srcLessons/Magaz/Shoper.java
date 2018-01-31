package Magaz;

/**
 * Created by java on 19.01.2018.
 */
public class Shoper {
    private int name;
    int shoperMoneyLimit;

    public Shoper(int name, int shoperMoneyLimit) {
        this.name = name;
        this.shoperMoneyLimit = shoperMoneyLimit;
    }

    public Shoper() {
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public int getShoperMoneyLimit() {
        return shoperMoneyLimit;
    }

    public void setShoperMoneyLimit(int shoperMoneyLimit) {
        this.shoperMoneyLimit = shoperMoneyLimit;
    }
}
