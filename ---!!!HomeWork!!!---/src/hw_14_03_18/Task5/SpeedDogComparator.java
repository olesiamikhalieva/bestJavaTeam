package hw_14_03_18.Task5;

import java.util.Comparator;

public class SpeedDogComparator implements Comparator<Dog> {
    @Override
    public int compare(Dog o1, Dog o2) {
        return o2.getSpeed()-o1.getSpeed();
    }
}
