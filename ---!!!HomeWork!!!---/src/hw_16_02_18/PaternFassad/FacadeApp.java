package hw_16_02_18.PaternFassad;

public class FacadeApp {

    String str;

    public static void main(String[] args) {

//        Power power = new Power();
//        power.on();
//
//        DVDRom dvd = new DVDRom();
//        dvd.load();
//        dvd.unload();
//
//        HDD hdd = new HDD();
//        hdd.copyFromDVD(dvd);

        Computer computer = new Computer();
        computer.copy();

    }
}

class Computer{
    Power power = new Power();
    DVDRom dvd = new DVDRom();
    HDD hdd = new HDD();

    void copy(){
        power.on();
        dvd.load();
        hdd.copyFromDVD(dvd);
    }
}

class Power {
    void on(){
        System.out.println("Включ питания");
    }
    void off(){
        System.out.println("Выключ питания");
    }
}
class DVDRom{
    private boolean data = false;
    public boolean hasData(){
        return data;
    }
    void load(){
        data = true;
    }
    void unload(){
        data = false;
    }


}
class HDD {
    void copyFromDVD(DVDRom dvd){
        if (dvd.hasData()){
            System.out.println("происходит копирование данных с диска");
        }else {
            System.out.println("вставте диск с данными");
        }
    }
}
