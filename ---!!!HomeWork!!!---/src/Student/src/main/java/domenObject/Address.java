package domenObject;

public class Address {
    private String city;
    private String street;
    private String home;

    public Address(String city, String street, String home) {
        this.city = city;
        this.street = street;
        this.home = home;
    }

    public Address() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}

