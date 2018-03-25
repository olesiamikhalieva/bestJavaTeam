package hw_23_03_18.notepad;

public class Adres {

    private String country;
    private String city;
    private String adres;

    public Adres(String country, String city, String adres) {
        this.country = country;
        this.city = city;
        this.adres = adres;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    @Override
    public String toString() {
        return "Adres:" +
                  country + "-" +
                 city + "-" +
                  adres;
    }
}
