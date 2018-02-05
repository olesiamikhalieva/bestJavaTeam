package hw_04_02_18.task3;

public class Man {

    private final int weight;
    private final int height;
    private final String sex;

    public Man(int weight, int height, String sex) {
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "Man{" +
                "weight=" + weight +
                ", height=" + height +
                ", sex='" + sex + '\'' +
                '}';
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }

    public String getSex() {
        return sex;
    }
}
