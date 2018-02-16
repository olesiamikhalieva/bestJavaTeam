package hw_12_01_18_SUPER_HARD_LEVEL;
public class Address {
    private String address;
    private String city;
    private String state;
    private int number;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Address(String address, String city, String state, int number) {
        this.address = address;
        this.city = city;
        this.state = state;
        this.number = number;
    }

    public void getAddressData(){
        System.out.println("Контактные данные:");
        System.out.println("Область: " + getState() + "\nГород: " + getCity() + "\nАдресс: " + getAddress() + "\nТелефон: " + getNumber());
    }
}
