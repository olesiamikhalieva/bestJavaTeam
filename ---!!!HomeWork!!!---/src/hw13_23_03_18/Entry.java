package hw13_23_03_18;

import java.util.Objects;

public class Entry {
    private String name;
    private String surname;
    private String patronymic;
    private String numberPhone;
    private String address;
    private String dateOfBirthday;
    private String placeWork;
    private String age;
    private String gender;
    private String country;

    public Entry(String name, String surname, String patronymic, String numberPhone, String address, String dateOfBirthday, String placeWork, String age, String gender, String country) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.numberPhone = numberPhone;
        this.address = address;
        this.dateOfBirthday = dateOfBirthday;
        this.placeWork = placeWork;
        this.age = age;
        this.gender = gender;
        this.country = country;
    }

    public void setEntry(Entry entry){
        this.name = entry.getName();
        this.surname = entry.getSurname();
        this.patronymic = entry.getPatronymic();
        this.numberPhone = entry.getNumberPhone();
        this.address = entry.getAddress();
        this.dateOfBirthday = entry.getDateOfBirthday();
        this.placeWork = entry.getPlaceWork();
        this.age = entry.getAge();
        this.gender = entry.getGender();
        this.country = entry.getCountry();
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
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

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Entry entry = (Entry) o;
        return Objects.equals(name, entry.name) &&
                Objects.equals(surname, entry.surname) &&
                Objects.equals(patronymic, entry.patronymic) &&
                Objects.equals(numberPhone, entry.numberPhone) &&
                Objects.equals(address, entry.address) &&
                Objects.equals(dateOfBirthday, entry.dateOfBirthday) &&
                Objects.equals(placeWork, entry.placeWork) &&
                Objects.equals(age, entry.age) &&
                Objects.equals(gender, entry.gender) &&
                Objects.equals(country, entry.country);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, surname, patronymic, numberPhone, address, dateOfBirthday, placeWork, age, gender, country);
    }

    @Override
    public String toString() {
        return "Entry{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", numberPhone='" + numberPhone + '\'' +
                ", address='" + address + '\'' +
                ", dateOfBirthday='" + dateOfBirthday + '\'' +
                ", placeWork='" + placeWork + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", country='" + country + '\'' +
                '}' + '\n';
    }
}
