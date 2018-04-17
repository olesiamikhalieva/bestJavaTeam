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
        return this;// в каждом сеттере необходимо добавить эту строку
    }

    public Builder(String name) { // конструктор с полем которе точно есть у всех машин-это имя
        this.name = name;
    }

    public Builder setColor(String color) {
        this.color = color;
        return this;// в каждом сеттере необходимо добавить эту строку
    }

    public Builder setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
        return this;// в каждом сеттере необходимо добавить эту строку
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
    public SportCar build() {// обязательный метод для сбора машины
        return new SportCar(this);
    }
    public SlowCar build1(){// обязательный метод для сбора машины
        return new SlowCar(this);
    }
}
