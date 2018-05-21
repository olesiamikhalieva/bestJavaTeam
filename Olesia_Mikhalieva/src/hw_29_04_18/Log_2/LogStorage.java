package hw_29_04_18.Log_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import static java.lang.String.valueOf;

public class LogStorage {

    private static String file;
    private Log log;
    StudentStorage studentStorage;
    private ArrayList<String> datesList;
    private ArrayList<String> idList = new ArrayList<>();
    private HashMap<Integer,String[]>hashMap = new HashMap<Integer, String[]>();


    public LogStorage(String file) throws IOException {
        this.file = file;
        log = new Log();
    }

    public void addIdOfStudentsToLog() throws IOException {

        try (BufferedReader br = new BufferedReader(new FileReader(studentStorage.getFile()))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                idList.add(sCurrentLine.substring(0, sCurrentLine.indexOf(" ")));
            }
        }


        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, false))) {
            idList.forEach((s) -> {
                try {
                    bw.write(s + " " + "\n");
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    bw.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addDataOfPresentStudentToLog(int id, String date) throws IOException {
        String [] dates = null;
        int index = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                index = Integer.parseInt((sCurrentLine.substring(0, sCurrentLine.indexOf(" "))));
                dates = sCurrentLine.substring(sCurrentLine.indexOf("[")).split(",");
                hashMap.put(index,dates);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
            for (Map.Entry<Integer, String[]> entry: hashMap.entrySet()) {
                bw.write( entry.getKey()+ " " + entry.getValue());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}




