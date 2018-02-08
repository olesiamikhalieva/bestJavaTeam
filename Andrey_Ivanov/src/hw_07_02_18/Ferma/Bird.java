package hw_07_02_18.Ferma;


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