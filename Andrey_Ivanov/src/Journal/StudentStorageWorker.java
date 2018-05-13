package Journal;

import Journal.Student;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface StudentStorageWorker {

    void createStudentList();

    void addStudent(Student student);

    void getStudentByIndex(int index) throws IOException;

    void getStudentByName(String name) throws IOException;

    void deleteSudentsByIndex(int index) throws IOException;

}
