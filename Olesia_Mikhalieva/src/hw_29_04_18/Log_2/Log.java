package hw_29_04_18.Log_2;

import lombok.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Log {


    private ArrayList<Integer> id;
    private ArrayList<String> dates;


    public ArrayList<Integer> getId() {
        return id;
    }

    public void setId(ArrayList<Integer> id) {
        this.id = id;
    }

    public ArrayList<String> getDates() {
        return dates;
    }

    public void setDates(ArrayList<String> dates) {
        this.dates = dates;
    }
}