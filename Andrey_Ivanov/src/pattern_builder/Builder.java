package pattern_builder;

class Builder {
    private String name;
    private String color;
    private int maxSpeed;
    private int weight;

    public int getWeight() {
        return weight;
    }

    public Builder setWeight(int weight) {
        this.weight = weight;
        return this;
    }

    public Builder(String name) {
        this.name = name;
    }

    public Builder setColor(String color) {
        this.color = color;
        return this;
    }

    public Builder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getName() {
        return name;
    }
    public SportCar build() {
        return new SportCar(this);
    }
    public SlowCar build1(){
        return new SlowCar(this);
    }
}
