package hw_23_03_18.dictionary.notepad;

public class Person extends Human {

   private String placeOfWork;
   Adres adres;

    public Person(String name, String phone, int age, String sex, String dateOfBirth, String placeOfWork) {
        super(name, phone, age, sex, dateOfBirth);
        //this.numberInList = numberInList;
        this.placeOfWork = placeOfWork;
    }

        public String getPlaceOfWork() {
        return placeOfWork;
    }

    public void setPlaceOfWork(String placeOfWork) {
        this.placeOfWork = placeOfWork;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }


    @Override
    public String toString() {
        return "Person"+"-" +getName()+"-"+getPhone()+"-"+getAge()+"-"+
                getSex()+"-"+getDateOfBirth()+"-"+getPlaceOfWork()+"-"+adres;
    }
}
