package ht8_26_01_18.t10;

public class Student {
    private int yearOfStudy;

    public Student() {
    }

    public Student(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy;
    }

    public void transferToTheNextYear(){
        yearOfStudy ++;
    }
}
