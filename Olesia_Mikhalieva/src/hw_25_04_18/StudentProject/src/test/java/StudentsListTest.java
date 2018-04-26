package hw_25_04_18.StudentProject.src.test.java;

import hw_25_04_18.StudentProject.src.main.java.Student;
import hw_25_04_18.StudentProject.src.main.java.StudentsList;
import org.junit.*;

import java.util.Arrays;

import static junit.framework.TestCase.assertEquals;

public class StudentsListTest {
    private StudentsList studentsList;
    private Student student1;
    private Student student2;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before StudentsListTest.class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After StudentsListTest.class");
    }

    @Before
    public void initTest() {
        studentsList = new StudentsList();
        student1 = new Student();
        student2 = new Student();
    }

    @After
    public void afterTest() {
        studentsList = null;
        student1 = null;
        student2 = null;
    }

    @Test
    public void addStudent() {
        studentsList.addStudent(student1);
        studentsList.addStudent(student2);
        assertEquals(Arrays.asList(student1,student2), studentsList.getArrayListStudentsLists());
    }

    @Test
    public void deleteStudent() {
        studentsList.addStudent(student1);
        studentsList.addStudent(student2);
        studentsList.deleteStudent(student1);
        studentsList.deleteStudent(student2);
        assertEquals(Arrays.asList(), studentsList.getArrayListStudentsLists());
    }

    @Test
    public void changeStudent() {
        studentsList.addStudent(student1);
        studentsList.changeStudent(student1, student2);
        assertEquals(Arrays.asList(student2), studentsList.getArrayListStudentsLists());
    }

    @Test
    public void printStudents() {
        studentsList.printStudents();
        System.out.println("print students");
    }

    @Ignore("Message for ignored test")
    @Test
    public void ignoredTest() {
        System.out.println("will not print it");
    }

    @Test(timeout = 500)
    public void timeStampTest() {
        while (true) ;
    }
}