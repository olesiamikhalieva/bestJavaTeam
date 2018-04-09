package hw_08_04_18.Task_1;

import java.util.ArrayList;

public class PointsSet {
    Coordinate coordinate;
    ArrayList<Coordinate> arrayListCoordinate = new ArrayList<>();
    ArrayList<Coordinate> moveCoordinate = new ArrayList<>();

    public ArrayList<Coordinate> getArrayListCoordinate() {
        return arrayListCoordinate;
    }

    public ArrayList<Coordinate> getMoveCoordinate() {
        return moveCoordinate;
    }


    public void addPoint(Coordinate coordinate) {
        arrayListCoordinate.add(coordinate);
    }

    @Override
    public String toString() {
        return "coordinate=(" + coordinate.x + ";" + coordinate.y + ";" + coordinate.z + ");";
    }

    public String distance() {

        double sum = 0;
        double x = 0;
        double y = 0;
        double z = 0;

        for (int i = 1; i < arrayListCoordinate.size(); i++) {

            double x1 = arrayListCoordinate.get(i - 1).getX();
            double x2 = arrayListCoordinate.get(i).getX();
            double y1 = arrayListCoordinate.get(i - 1).getY();
            double y2 = arrayListCoordinate.get(i).getY();
            double z1 = arrayListCoordinate.get(i - 1).getZ();
            double z2 = arrayListCoordinate.get(i).getZ();
            sum += Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2) + (z1 - z2) * (z1 - z2));
        }
        return "sum = " + sum;
    }

    public void move() {
        for (Coordinate c : arrayListCoordinate) {

            if ((c.getX() < arrayListCoordinate.get(0).getX() + 5 && c.getX() > arrayListCoordinate.get(0).getX() - 5) ||
                    (c.getY() < arrayListCoordinate.get(0).getY() + 5 && c.getY() > arrayListCoordinate.get(0).getY() - 5) ||
                    (c.getZ() < arrayListCoordinate.get(0).getZ() + 5 && c.getZ() > arrayListCoordinate.get(0).getZ() - 5)) {
                moveCoordinate.add(c);
            }
        }
        for (Coordinate coord : moveCoordinate) {
            arrayListCoordinate.remove(coord);
        }
    }
}
