package hw_29_04_18.Log_2;

import lombok.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Log {


    private int id;
    private ArrayList<String> dates ;

    public Log(String fileStudentStogage) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileStudentStogage))) {

            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                System.out.println(sCurrentLine);
                this.id = Integer.parseInt((sCurrentLine.substring(0, sCurrentLine.indexOf(" "))));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<String> getDates() {
        return dates;
    }

    public void setDates(ArrayList<String> dates) {
        this.dates = dates;
    }
}