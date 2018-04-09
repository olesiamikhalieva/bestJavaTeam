package hw_08_04_18.Task_1;

public class Runner {
    /*
реальная задача с реального собеседования (мне знакомая рассказала):
Create class Point3D to represent a point in 3-D space with coordinates x, y and z.
Define properties for each field and following methods:distanceTo() - for calculating the distance to another point;
toString(), which returns a string similar to “(2,-7,0)";
moveTo(Point3D point), which should change the coordinates of point to the given;
Create a class PointsSet which consists of field "points" (container of Point3D objects).
In this class define method addPoint() for adding point to container; method toString() for converting  points to user friendly string;
method distance(), which calculates the sum of distances between all points (from first to the last);
method move(), which should move all points from container, which are inside the ball of radius 5 and center in origin, to the first point in container.
Write short code to demonstrate your solution.
Your code should include class (interface) aggregation or inheritance, should use collections or generics, should implement exception handling.
     */

    public static void main(String[] args) {
        Coordinate point1 = new Coordinate(0.0,0.0,0.0);
        Coordinate point2 = new Coordinate(2.0,2.0,2.0);
        Coordinate point3 = new Coordinate(-1.0,0.0,-5.0);
        Coordinate point4 = new Coordinate(10.0,10.0,10.0);
        PointsSet pointsSet = new PointsSet();
        Point3D point3D = new Point3D();
        point3D.distanceTo(point1, point2);
        point3D.moveTo(point1, 0.0, 1.0, 0.0);
        pointsSet.addPoint(point1);
        pointsSet.addPoint(point2);
        pointsSet.addPoint(point3);
        pointsSet.addPoint(point4);
        pointsSet.getArrayListCoordinate().forEach(s-> System.out.println("["+s.getX()+";"+s.getY()+";"+s.getZ()+"]"));
        System.out.println(pointsSet.distance());
        pointsSet.move();
        pointsSet.getArrayListCoordinate().forEach(s-> System.out.println("["+s.getX()+";"+s.getY()+";"+s.getZ()+"]"));
    }
}


