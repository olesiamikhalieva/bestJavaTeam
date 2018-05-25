package service;

import domenObject.Address;
import service.Interfaces.ScriptAddAddressInTableAddress;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ScriptAddAddressInTableAddressImpl implements ScriptAddAddressInTableAddress {

    private static final String INSERT_SCRIPT_FILE = "src//main//resources//insert_to_address_students.sql";
    private static final String INSERT_SCRIPT = "INSERT INTO address(city, street, home) VALUES (";

    @Override
    public void addAddress(int countStudent) { //скрипт заполнения таблицы Address адресами студентов

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(INSERT_SCRIPT_FILE))) {
            for (int i = 1; i<=countStudent;i++) {
                Address address = new Address("Город"+i, "Улица"+i, "Дом"+i);
                bw.write(INSERT_SCRIPT + "'" + address.getCity() + "', '" + address.getStreet() + "', '" + address.getHome() + "');");
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
