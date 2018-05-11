package fileStorage;

import java.util.List;

/**
 * Created by java on 11.05.2018.
 */
public interface StudentStoregWorker {
    List<Student> stubents();
    void addStudent(Student student);
    Student getStudent(int index);
    Student getStudentByName(String name);
}
