package ht7_23_01_18.Computer.SystemUnit;

public class HDD {
    private String model;
    private String value;

    public HDD() {
    }

    public HDD(String model, String value) {
        this.model = model;
        this.value = value;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
