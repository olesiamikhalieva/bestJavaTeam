package Magaz.sportGoods;

/**
 * Created by java on 23.01.2018.
 */
public class Info {

    private String address;
    private String email;
    private int postCode;

    public Info(String address, String email, int index) {
        this.address = address;
        this.email = email;
        this.postCode = index;
    }

    public Info() {
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIndex() {
        return postCode;
    }

    public void setIndex(int index) {
        this.postCode = index;
    }
}
