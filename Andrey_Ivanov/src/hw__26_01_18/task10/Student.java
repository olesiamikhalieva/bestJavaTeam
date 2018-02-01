package hw__26_01_18.task10;

public class Student extends Man {
    private int yearsOfStudy;

    public Student() {
    }

    public Student(int yearsOfStudy) {
        this.yearsOfStudy = yearsOfStudy;
    }

    public int getYearsOfStudy() {
        return yearsOfStudy;
    }

    public void setYearsOfStudy(int yearsOfStudy) {
        this.yearsOfStudy = yearsOfStudy;
    }

    public void changesYearsofStudy() {
        this.yearsOfStudy++;
    }





    public static void main(String[] args) {
        Student student = new Student();
        System.out.println(student);
        student.setSex("women");
        //student.changesNameAgeWeight();//метод изменения имени,возраста и веса
       // System.out.println(student.getName() + " " + student.getAge() + " " + student.getWeight());
        System.out.println(student.getName());
    }
}