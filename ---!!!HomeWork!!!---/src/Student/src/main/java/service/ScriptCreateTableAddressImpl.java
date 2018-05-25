package service;

import service.Interfaces.ScriptCreateTableAddress;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScriptCreateTableAddressImpl implements ScriptCreateTableAddress {

    private final String FILE_CREATE_TABLE_PATH = "src\\main\\resources\\createAddressTable.sql";

    @Override
    public void createTable() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_CREATE_TABLE_PATH))) { //скрипт создания таблицы с адресами студентов
            bw.write("CREATE TABLE public.address (");
            bw.newLine();
            bw.write("  city CHARACTER VARYING(20) NOT NULL,\n" +
                    "  street CHARACTER VARYING(20) NOT NULL,\n" +
                    "  home CHARACTER VARYING(20) NOT NULL\n" + ");");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
