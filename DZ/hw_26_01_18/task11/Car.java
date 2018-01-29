package task11;

public class Car {
    private String brand;
    private int weight;
    private int power;

    public Car() {
    }

    public Car(String brand, int weight, int power) {
        this.brand = brand;
        this.weight = weight;
        this.power = power;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public void changePower(char operation, int number){
        switch (operation){
            case '+':
                this.power += number;
                break;
            case '-':
                this.power -= number;
                break;
        }
    }
}
