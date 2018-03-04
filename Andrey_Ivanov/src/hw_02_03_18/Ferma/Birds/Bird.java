package hw_02_03_18.Ferma.Birds;


public abstract class Bird {

    private String name;

    public abstract String sound();

    public Bird(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}