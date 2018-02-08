package ClassesBird;

/**
 * Created by java on 06.02.2018.
 */
public abstract class Bird {
    private String birdName;

    public Bird(String birdName) {
        this.birdName = birdName;
    }

    public String getBirdName() {
        return birdName;
    }

    public void setBirdName(String birdName) {
        this.birdName = birdName;
    }

    public abstract void sound();


    @Override
    public String toString() {
        return "Bird{" +
                "birdName='" + birdName + '\'' +
                '}';
    }
}
