import service.*;
import service.Interfaces.ScriptAddAddressInTableAddress;
import service.Interfaces.ScriptCreateStudents;
import service.Interfaces.ScriptCreateTableAddress;
import service.Interfaces.ScriptReaderService;

/**
 * Created by dev on 22.05.2018.
 */
public class Main {

    private static ScriptReaderService scriptReaderService;

    private static final String INSERT_SCRIPT_FILE = "src//main//resources//insertToStudent.sql";
    private static final String INSERT_SCRIPT = "INSERT INTO student(name, ser_name, phone, email) VALUES (";
    private static int studentCount;

    public static void main(String[] args) {
//        ArrayList<Student> students = new ArrayList<>();
//
//        for (int i = 0; i <= 10; i++) {
//            students.add(new Student("alina"+i, "kurt"+i, "+32215445"+i,"asdad@gmail.com"+i));
//        }
//
//        try (BufferedWriter bw = new BufferedWriter(new FileWriter(INSERT_SCRIPT_FILE, true))) {
//            for (Student student : students) {
//                bw.write(INSERT_SCRIPT + "'" + student.getName() + "', '" + student.getSerName() + "', '" + student.getPhone() + "', '" + student.getEmail() + "');");
//                bw.newLine();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        scriptReaderService = new ScriptReaderServiceImpl();
        studentCount = scriptReaderService.readScript();

        ScriptCreateStudents scriptCreateStudents = new ScriptCreateStudentsImpl();
        scriptCreateStudents.createThirdStudents();

        ScriptCreateTableAddress scriptCreateTableAddress = new ScriptCreateTableAddressImpl();
        scriptCreateTableAddress.createTable();

        ScriptAddAddressInTableAddress scriptAddAddressInTableAddress = new ScriptAddAddressInTableAddressImpl();
        scriptAddAddressInTableAddress.addAddress(studentCount);
    }
}

