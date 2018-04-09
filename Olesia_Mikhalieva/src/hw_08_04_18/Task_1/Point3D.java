package hw_08_04_18.Task_1;

public class Point3D {
    Double x;
    Double y;
    Double z;

    public double distanceTo(Coordinate a, Coordinate b) {
        double x1 = a.getX();
        double x2 = b.getX();
        double y1 = a.getY();
        double y2 = b.getY();
        double z1 = a.getZ();
        double z2 = b.getZ();
        double sum = Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
        return sum;
    }


    public void moveTo(Coordinate point, double x, double y, double z) {
        point.setX(x);
        point.setY(y);
        point.setZ(z);

    }



}
