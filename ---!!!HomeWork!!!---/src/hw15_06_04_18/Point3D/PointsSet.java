package hw15_06_04_18.Point3D;

import java.util.Arrays;

public class PointsSet<E> implements MethodsSet {

    private E[] massE;

    public PointsSet(E[] massE) {
        this.massE = massE;
    }

    public PointsSet() {
        massE = (E[])new Object[0];
    }


    @Override
    public boolean addPoint(Object point3D) {
        try {
            E[] temp = this.massE;
            this.massE = (E[]) new Object[temp.length+1];
            System.arraycopy(temp, 0, this.massE,0,temp.length);
            this.massE[this.massE.length-1] = (E)point3D;
            System.out.println("объект успешно добавлен");
            return true;
        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    @Override
    public void distance() {
        try {
            Point3D[] point3D = (Point3D[]) this.massE; // прикастовали массив, который здесь хранится к класу Point3D для того, что бы был доступен метод distanceTo
            for (int i = 0; i < point3D.length - 1; i++) {
                for (int j = 0; j < point3D.length - 1; j++) {
                    System.out.println("от точки номер " + i + "до точки номер" + j + point3D[i].distanceTo(point3D[j]) + "условных единиц");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Несоответствие типов");
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
