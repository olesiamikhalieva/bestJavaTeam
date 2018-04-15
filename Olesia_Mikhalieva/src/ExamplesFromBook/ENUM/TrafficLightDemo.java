package ExamplesFromBook.ENUM;

import static ExamplesFromBook.ENUM.TrafficLightColor.GREEN;

public class TrafficLightDemo {

    public static void main(String args[]) {
        TrafficLightSimulator tl =
                new TrafficLightSimulator(GREEN);
        for (int i = 0; i < 9; i++) {
            System.out.println(tl.getColor());
            tl.waitForChange();
        }
        tl.cancel();
    }
}
