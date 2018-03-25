package hw_24_03_18.note;

public class Person {
    String name;
    int telephone;
    AdditionalInformation additionalInformation;


    public Person(String name, int telephone) {
        this.name = name;
        this.telephone = telephone;
        additionalInformation = new AdditionalInformation(null, null, null, 0, null, null);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }

    public AdditionalInformation getAdditionalInformation() {
        return additionalInformation;
    }

    public void setAdditionalInformation(String address, String dateOfBirthday, String placeOfJob, int age, String country, String gender) {
        additionalInformation = new AdditionalInformation(address, dateOfBirthday, placeOfJob, age, country, gender);

    }


}
