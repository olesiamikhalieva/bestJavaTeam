package pattern_builder;

public class SlowCar {
    private String name;
    private String color;
    private int maxSpeed;
    private int weight;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public int getWeight() {
        return weight;
    }

    SlowCar(Builder builder) {
        this.name = builder.getName();
        this.color = builder.getColor();
        this.maxSpeed = builder.getMaxSpeed();
        this.weight = builder.getWeight();
    }
}
