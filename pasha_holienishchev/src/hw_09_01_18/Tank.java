package hw_09_01_18;



public class Tank
{
    String name = "Misha";
    float weight = 1.2F;
    int model = 12;
    double powerfull = 4.3D;


    public Tank(int model, double powerfull)
    {
        this.model = model;
        this.powerfull = powerfull;
    }

    public Tank(String name, float weight)
    {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getPowerfull() {
        return powerfull;
    }

    public void setPowerfull(double powerfull) {
        this.powerfull = powerfull;
    }
}
