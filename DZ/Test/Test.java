import java.util.concurrent.ThreadLocalRandom;

public class Test {
    public static void main(String[] args) {

        int randomNum = 0;
        Student[] students = new Student[12];
        for (int i = 0; i < 7; i++) {
            Student student = new Student();
            students[i] = student;
            student.setName("name" + i);
            student.setAge(randomNum = ThreadLocalRandom.current().nextInt(7, 16 + 1));

            System.out.println(student.getName() + " " + student.getAge());
        }

        for (int i = 0; i < students.length; i++){
            if (students[i] == null){
                Student [] updateStudents = new Student[i];
                System.arraycopy(students, 0, updateStudents, 0, i);
                students = updateStudents;
                break;
            }
        }

        for (int i = 0; i < students.length; i++){
            if (students[i] != null){
                System.out.println(students[i].getName());
            }
        }
    }

}
