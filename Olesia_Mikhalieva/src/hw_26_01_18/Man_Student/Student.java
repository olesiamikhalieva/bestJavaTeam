package hw_26_01_18.Man_Student;

public class Student extends Man {
    private int yearOfStudy;

    public int getYearOfStudy() {
        return yearOfStudy;
    }

    public void setYearOfStudy(int yearOfStudy) {
        this.yearOfStudy = yearOfStudy+1;
    }
}
