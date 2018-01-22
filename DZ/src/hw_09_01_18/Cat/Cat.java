package Cat;

public class Cat {
    private String name = " ";
    private double weight = 0D;
    private String color  = " ";
    private double growth = 0D;
    private double longer = 0D;
    private double force = 0;

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    public double getGrowth() {
        return growth;
    }

    public double getLonger() {
        return longer;
    }

    public double getForce() {
        return force = (weight+growth+longer)/5;
    }

    public Cat(String name, double weight, String color, double growth, double longer){
        this.name = name;
        this.weight = weight;
        this.color = color;
        this.growth = growth;
        this.longer = longer;
    }
}
