package Pattern.Decorator;

public class DackRoast extends Beverage {

    public DackRoast() {
        description = "DackRoast";
    }

    @Override
    public double cost() {
        return 1.55;
    }
}
