package les_06_03_18;

/**
 * Created by java on 06.03.2018.
 */
public abstract class Employer {
    private String name;
    private int salary;
    private int year;
    private int coef = 1;

    public int getCoef() {
        return coef;
    }

    public void setCoef(int coef) {
        this.coef = coef;
    }

    public abstract int doSalary();

    public Employer(String name, int year, int coef) {
        this.name = name;
        this.year = year;
        this.coef = coef;
    }

    public Employer(String name, int year) {
        this.name = name;
        this.year = year;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
