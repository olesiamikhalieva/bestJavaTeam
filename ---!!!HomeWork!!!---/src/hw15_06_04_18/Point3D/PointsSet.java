package hw15_06_04_18.Point3D;

import java.util.Arrays;

public class PointsSet<E> implements MethodsSet {

    private E[] massE;

    public PointsSet(E[] massE) {
        this.massE = massE;
    }

    public PointsSet() {
    }

    @Override
    public boolean addPoint(Object point3D) {
        try {

            E[] massPoint = (E[])new Object[0];
            massPoint = Arrays.copyOf(this.massE, this.massE.length + 1);
            massPoint[massPoint.length - 1] = (E)point3D;
            this.massE = massPoint;
            return true;

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    @Override
    public void distance() {
        for (int i = 0; i < this.massE.length - 1; i++) {
            for (int j = 0; j < this.massE.length - 1; j++) {
              //  System.out.println("от точки номер " + i + "до точки номер" + j + this.massE[i].distanceTo(this.massE[j]) + "условных единиц");
            }
            System.out.println();
        }
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "PointsSet{" +
                "massE=" + Arrays.toString(massE) +
                '}';
    }
}
