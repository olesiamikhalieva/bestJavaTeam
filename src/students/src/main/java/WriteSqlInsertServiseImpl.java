import domenObject.Student;

import java.io.*;
import java.util.ArrayList;


public class WriteSqlInsertServiseImpl implements WriteSqlInsertServise {

    private static final String INSERT_SCRIPT ="INSERT INTO bestgroup.student (name, ser_name, phone, email) VALUES ";

    private static final String FILENAME = "E:\\this_java\\my_course\\java_base\\students\\insert_student2.sql";


    public void writeInsertScript() {

        ArrayList<Student> students = new ArrayList<>();
        for (int i=0; i<=30; i++){
            students.add(new Student("Avrik"+i,"Botov"+i,"099079"+i,"aaa"+i+"@gmail.com"));
        }

//        int index = 1;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(FILENAME))) {
//
//            String sCurrentLine;
//            while ((sCurrentLine = br.readLine()) != null) {
//                System.out.println(sCurrentLine);
//                index = Integer.parseInt((sCurrentLine.substring(0,sCurrentLine.indexOf(" "))));
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println(index++);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME,true))) {
            for (Student student : students) {
                bw.write(INSERT_SCRIPT +"('" +student.getName() + "', '" + student.getSerName() + "', '" + student.getPhone()+"', '"+student.getEmail()+"');");
                bw.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
