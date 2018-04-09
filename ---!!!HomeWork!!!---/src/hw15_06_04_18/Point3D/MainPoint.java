package hw15_06_04_18.Point3D;

public class MainPoint {
    public static void main(String[] args) {
        Point3D point3D1 = new Point3D(10,50,20);
        Point3D point3D2 = new Point3D(7,9,3);
        Point3D point3D3 = new Point3D(5,4,25);

        System.out.println(point3D1.distanceTo(point3D2));

        PointsSet pointsSet = new PointsSet();
        System.out.println(pointsSet.addPoint(point3D1));
        System.out.println(pointsSet.addPoint(point3D2));
        System.out.println(pointsSet.addPoint(point3D3));

        pointsSet.distance();
    }
}
