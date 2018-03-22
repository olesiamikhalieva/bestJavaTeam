package ht19_20_03_18.Birds;

public abstract class Bird {
    private String name;

    public Bird(String name) {
        this.name = name;
    }

    public abstract void sound();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                '}';
    }
}
