package hw15_06_04_18.Point3D;

import java.util.ArrayList;

public class PointsSet implements MethodsSet {

    private ArrayList<Point3D> pointMass;

    public PointsSet(ArrayList<Point3D> massE) {
        this.pointMass = massE;
    }

    public PointsSet() {
        pointMass = new ArrayList<>();
    }


    @Override
    public boolean addPoint(Point3D point3D) {
        pointMass.add(point3D);
        System.out.println("объект успешно добавлен");
        return true;
    }

    @Override
    public void distance() {
        try {
            for (int i = 0; i < pointMass.size(); i++) {
                for (int j = 0; j < pointMass.size(); j++) {
                    if (i == j) {
                        continue;
                    }
                    System.out.println("от точки номер " + i + " до точки номер " + j + " " + pointMass.get(i).distanceTo(pointMass.get(j)) + " условных единиц");
                }
                System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void move() {

    }

    @Override
    public String toString() {
        return "PointsSet{" +
                "pointMass=" + pointMass +
                '}';
    }
}
