package hw_02_02_18.task1;


public class Launcher {
    public static void main(String[] args) {
        Instrument i = new Instrument();
        Flute flute = new Flute();

        Musician m = new Musician();

        m.play(flute);
        m.play(new Guitar());
    }
}
