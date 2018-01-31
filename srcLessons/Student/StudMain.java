package Student;

/**
 * Created by java on 26.01.2018.
 */
public class StudMain {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Kolia");
        Student student2 = new Student();
        student2.setName("Kolia");

        System.out.println(student.equals(student2));
    }
}
