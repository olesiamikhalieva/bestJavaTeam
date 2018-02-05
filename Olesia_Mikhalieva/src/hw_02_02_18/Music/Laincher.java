package hw_02_02_18.Music;

public class Laincher {
    public static void main(String[] args) {
        Instrument i = new Instrument();
        Flute flute = new Flute();

        Musician m = new Musician();

        m.play(flute);
        m.play(new Guitar());


    }



 public static class Musician{

    public void play(Instrument i){
        i.sound();
    }
}




public static class Flute extends Instrument {
    @Override
    public void sound() {
        System.out.println("Playing flute");
    }
}


public static class Guitar extends Instrument{
    @Override
    public void sound() {
        System.out.println("Playing guitar");
    }
}

public static class Instrument {

    public  void sound(){
        System.out.println("Did you hear any think?");
    }
}
}