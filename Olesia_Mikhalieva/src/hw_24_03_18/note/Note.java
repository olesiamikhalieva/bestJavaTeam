package hw_24_03_18.note;

import java.util.ArrayList;
import java.util.List;

public class Note {
    Person person;
    List<Person> people = new ArrayList<>();

    public Note() {
    }

    public void addPerson(Person person) {
        people.add(person);
    }

    public void addPerson(String name, int telephone) {
        person = new Person(name, telephone);
        people.add(person);
    }

    public void addAdditionalInformation(Person person, String address, String dateOfBirthday, String placeOfJob, int age, String country, String gender) {
        person.setAdditionalInformation(address, dateOfBirthday, placeOfJob, age, country, gender);
    }

    public void delete(Person person) {
        people.remove(person);
    }

    public void editMainInformation(Person person, String name, int telephone) {

        if (name != null) {
            person.setName(name);
        }
        if (telephone != 0) {
            person.setTelephone(telephone);
        }
    }


    public void editAdditionalInformation(Person person, String address, String dateOfBirthday, String placeOfJob, int age, String country, String gender) {

        if (address != null) {
            person.getAdditionalInformation().setAddress(address);
        }
        if (dateOfBirthday != null) {
            person.getAdditionalInformation().setDateOfBirthday(dateOfBirthday);
        }
        if (placeOfJob != null) {
            person.getAdditionalInformation().setPlaceOfJob(placeOfJob);
        }
        if (age != 0) {
            person.getAdditionalInformation().setAge(age);
        }
        if (country != null) {
            person.getAdditionalInformation().setCountry(country);
        }
        if (gender != null) {
            person.getAdditionalInformation().setGender(gender);
        }
    }


    public ArrayList<Person> getPeople() {
        return (ArrayList<Person>) people;
    }

    public void show() {
        System.out.println("name" + "\t" + "telephone");
        for (Person man : people) {
            System.out.println(man.getName() + "\t" + man.getTelephone());
        }
    }

    public void showAllInformation() {
        System.out.println("name" + "\t" + "telephone" + "\t" + "address" + "\t" + "date of birthday" + "\t" + "place of job" + "\t" + "age" + "\t" + "country" + "\t" + "gender");
        for (Person man : people) {
            System.out.println(man.getName() + "\t" + man.getTelephone() + "\t" + man.getAdditionalInformation().getAddress() + "\t" + man.getAdditionalInformation().getDateOfBirthday() +
                    "\t" + man.getAdditionalInformation().getPlaceOfJob() + "\t" + man.getAdditionalInformation().getAge() + "\t" + man.getAdditionalInformation().getCountry() + "\t" +
                    man.getAdditionalInformation().getGender());
        }
    }

}
