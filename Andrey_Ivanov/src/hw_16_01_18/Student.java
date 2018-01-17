package hw_16_01_18;

import java.util.concurrent.ThreadLocalRandom;

public class Student {

    private int age;
    private String name;
    private String adress;
    private String city;
    private String oblast;
    private String telefon;


    public Student() {
        setAge();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge() {
        int randomNum = ThreadLocalRandom.current().nextInt(7, 16 + 1);
        this.age = randomNum;
    }

    public int getAge() {

        return age;
    }

    public void setRandomAdress() {
        String[] adress = new String[7];
        adress[0] = "ul.Kosiora";
        adress[1] = "pr.Mira";
        adress[2] = "ul.Krotova";
        adress[3] = "prosp.Pravdi. ";
        adress[4] = "per.Horowiy";
        adress[5] = "ul.Titova";
        adress[6] = "ul.Kroksa";
        this.adress = adress[ThreadLocalRandom.current().nextInt(0, 6 + 1)];
    }
    public String getAdress() {
        return adress;
    }
    public void setRandomCity() {
        String[] adress = new String[7];
        adress[0] = "Dnepr";
        adress[1] = "Kiev";
        adress[2] = "Poltava";
        adress[3] = "Zhitomir";
        adress[4] = "Krivoy Rog";
        adress[5] = "Herson";
        adress[6] = "Luck";
        this.city = adress[ThreadLocalRandom.current().nextInt(0, 6 + 1)];
    }

    public String getCity() {
        return city;
    }

    public void setRandomOblast() {
        String[] adress = new String[7];
        adress[0] = "Dnepropetrovskaya";
        adress[1] = "Kievskaya";
        adress[2] = "Poltavskaya";
        adress[3] = "Zhitomirskaya";
        adress[4] = "Doneckaya";
        adress[5] = "Hersonskaya";
        adress[6] = "Luckaya";
        this.oblast = adress[ThreadLocalRandom.current().nextInt(0, 6 + 1)];
    }

    public String getOblast() {
        return oblast;
    }

    public void setRandomTelefon() {
        String[] adress = new String[7];
        adress[0] = "0971452687";
        adress[1] = "0971247894";
        adress[2] = "0502148523";
        adress[3] = "0934569871";
        adress[4] = "0671452367";
        adress[5] = "0503245873";
        adress[6] = "0975218657";
        this.telefon = adress[ThreadLocalRandom.current().nextInt(0, 6 + 1)];
    }

    public String getTelefon() {
        return telefon;
    }
}