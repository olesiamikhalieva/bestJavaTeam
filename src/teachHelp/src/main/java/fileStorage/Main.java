//package fileStorage;
//
//import java.io.*;
//import java.util.ArrayList;
//
//public class Main {
//
//    public static void main(String[] args) throws IOException {
//
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("ar", "bal", "dar"));
//        students.add(new Student("arr", "baler", "darfe"));
//        students.add(new Student("aoiuoi", "baoiu", "daoioiu"));
//
//        File file = new File("D://testFile1.txt");
//        //  Create the file
//
//        //        if (file.createNewFile()) {
//        //            System.out.println("File is created!");
//        //        } else {
//        //            System.out.println("File already exists.");
//        //        }
//
//        //Write Content
//        //System.getProperty("line.separator"))
//        int index = 0;
//
//        BufferedReader br = new BufferedReader(new FileReader(file));
//
//        String line = null;
//        while ((line = br.readLine()) != null) {
//            System.out.println("in reader");
//            System.out.println(line);
//            System.out.println(line.substring(0, 1));
//            index = Integer.parseInt(line.substring(0, 1));
//
//        }
//        index++;
//        br.close();
//
//
//        FileWriter writer = new FileWriter(file, true);
//
//        for (int i = 0; i < students.size(); i++) {
//            writer.write((index + " " + students.get(i).getName() + " " + students.get(i).getSecName() + " " + students.get(i).getThirdname() + System.getProperty("line.separator")));
//            index++;
//        }
//
//        writer.close();
//
//
//    }
//}
