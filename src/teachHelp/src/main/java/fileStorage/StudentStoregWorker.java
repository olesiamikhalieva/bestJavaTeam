package fileStorage;


import java.util.List;

public interface StudentStoregWorker {

    List<Student> studentList();

    void addStudent(Student student);

    Student getStudent(int index);

    Student getStudentByName(String name);
}
