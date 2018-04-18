package patterns.pattern_builder;

class SportCar {
    private String name;
    private String color;
    private int maxSpeed;

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    SportCar(Builder builder) {
        this.name = builder.getName();
        this.color = builder.getColor();
        this.maxSpeed = builder.getMaxSpeed();
    }
}
