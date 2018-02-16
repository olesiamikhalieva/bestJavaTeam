package hw_26_01_18.task10;

public class Student extends Man{
    private int yearOfStudy;

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }
    public void increaseYearOfStudy(int year){
        this.yearOfStudy +=year;
    }
}
