public class Shoper {

    private int moneyLimit;
    private String name;

    public Shoper() {
    }

    public Shoper(int moneyLimit, String name) {
        this.moneyLimit = moneyLimit;
        this.name = name;
    }

    public int getMoneyLimit() {
        return moneyLimit;
    }

    public void setMoneyLimit(int moneyLimit) {
        this.moneyLimit = moneyLimit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
