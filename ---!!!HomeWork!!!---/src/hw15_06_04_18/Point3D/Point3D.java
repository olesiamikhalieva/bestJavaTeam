package hw15_06_04_18.Point3D;

import java.util.Objects;

public class Point3D implements MethodsPoint {
    private double x;
    private double y;
    private double z;

    public Point3D(float x, float y, float z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point3D point3D = (Point3D) o;
        return Double.compare(point3D.x, x) == 0 &&
                Double.compare(point3D.y, y) == 0 &&
                Double.compare(point3D.z, z) == 0;
    }

    @Override
    public int hashCode() {

        return Objects.hash(x, y, z);
    }

    @Override
    public double distanceTo(Point3D point) {

        double x = (point.getX() - this.getX());
        double y = (point.getY() - this.getY());
        double z = (point.getZ() - this.getZ());

        return Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2) + Math.pow(z, 2)); // высщитаем по формуле расстояние до след точки в декартовой системе координат(см. базовый курс линейной алгкбры)
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

    @Override
    public void moveTo(Point3D point) {
        this.setX(point.getX());
        this.setY(point.getY());
        this.setZ(point.getZ());
    }
}
