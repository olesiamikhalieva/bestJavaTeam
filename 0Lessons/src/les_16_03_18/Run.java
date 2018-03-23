package les_16_03_18;

import les_06_03_18.Employer;
import les_06_03_18.Manager;

/**
 * Created by java on 16.03.2018.
 */
public class Run {
    public static void main(String[] args) {
        Pair<Employer> stringPair = new Pair<>(new Employer("ergg", 55), new Employer("dfdf",98));

        Pair<Manager> pair = new Pair<>();

        pair.setFirst(new Manager("efg", 974));
        System.out.println(pair.getFirst().getName());
    }
}
