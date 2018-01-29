package task10;

public class MainTask10 {


    public static void main(String[] args) {
        Student student = new Student();

        student.setYearOfStudy(10);
        System.out.println(student.getYearOfStudy());

        student.increaseYearOfStudy(2);
        System.out.println(student.getYearOfStudy());
    }
}
