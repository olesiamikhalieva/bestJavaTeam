package hw_09_01_18.Tank;

public class Tank {
    private double weight;
    private int crew;
    private String model;
    private int yearOfIssued;

    public double getWeight() {
        return weight;
    }
    public int getCrew() {
        return crew;
    }
    public String getModel() {
        return model;
    }
    public int getYearOfIssued() {
        return yearOfIssued;
    }
    public Tank(double weight, int crew, String model, int yearOfIssued)
    {
        this.weight = weight;
        this.crew = crew;
        this.model = model;
        this.yearOfIssued = yearOfIssued;
    }
}
