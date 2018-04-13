package les1304;

/**
 * Created by java on 13.04.2018.
 */
public class RunnerFarm {
    public static void main(String[] args) {

        Farm farm = new Farm();
        new Farmer(farm).start();
        new Mediator(farm).start();
    }
}
