package ht9_02_02_2018.t1;


import ht9_02_02_2018.t1.Instruments.Flute;
import ht9_02_02_2018.t1.Instruments.Guitar;
import ht9_02_02_2018.t1.Instruments.Instrument;

public class Launcher {
    public static void main(String[] args) {
        Instrument i = new Instrument();
        Flute flute = new Flute();

        Musician m = new Musician();

        m.play(flute);
        m.play(new Guitar());
    }
}








