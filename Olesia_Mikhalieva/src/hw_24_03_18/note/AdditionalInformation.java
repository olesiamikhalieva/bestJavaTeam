package hw_24_03_18.note;


public class AdditionalInformation {
    private String address;
    private String dateOfBirthday;
    private String placeOfJob;
    private int age;
    private String country;
    private String gender;


    public AdditionalInformation(String address, String dateOfBirthday, String placeOfJob, int age, String country, String gender) {
        this.address = address;
        this.dateOfBirthday = dateOfBirthday;
        this.placeOfJob = placeOfJob;
        this.age = age;
        this.country = country;
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDateOfBirthday() {
        return dateOfBirthday;
    }

    public void setDateOfBirthday(String dateOfBirthday) {
        this.dateOfBirthday = dateOfBirthday;
    }

    public String getPlaceOfJob() {
        return placeOfJob;
    }

    public void setPlaceOfJob(String placeOfJob) {
        this.placeOfJob = placeOfJob;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
