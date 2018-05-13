package Log;

import java.sql.*;

public class Main {
    private static String userName = "root";
    private static String password = "qwerty";
    private static String connectionUrl = "jdbc:mysql://localhost:3306/test";
    private static String sqlDriver = "com.mysql.jdbc.Driver";

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //created student sqlBASA
        Class.forName(sqlDriver);
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            statement.execute("CREATE TABLE if not EXISTS student(id MEDIUMINT NOT NULL AUTO_INCREMENT, surname VARCHAR (20) NOT NULL, name VARCHAR (20) NOT NULL,  lesson_1 VARCHAR(10) NULL , PRIMARY KEY (id));");
            System.out.println("StudentBASA created");
        }

        // add students
        Class.forName(sqlDriver);
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            statement.execute("INSERT INTO student ( surname, name) VALUES ('Alekseev','Ivan')");
            statement.execute("INSERT INTO student (name, surname) VALUES ('Vasya','Petrov')");
            statement.execute("INSERT INTO student (name, surname) VALUES ('Olya','Bush')");
            System.out.println("Add students");
        }

        //add presents of students at 1st lesson
        Class.forName(sqlDriver);
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            statement.execute("UPDATE student SET lesson_1 = 'N' WHERE surname = 'Alekseev';");
            System.out.println("Add present at 1st lesson");
        }


        //print table
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT * FROM student");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("surname"));
                System.out.println(resultSet.getString("name"));
                System.out.println(resultSet.getString("lesson_1"));
                System.out.println("_____________________");
            }
            System.out.println("print table");
        }

        //add lesson 2 and presents of students
        Class.forName(sqlDriver);
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            statement.execute("ALTER TABLE student ADD lesson_2 VARCHAR(10) NULL ;");
            statement.execute("UPDATE student SET lesson_2 = 'N' WHERE surname = 'Alekseev';");
            System.out.println("Add 2nd lesson and present at 2nd lesson");
        }

        //print student Alekseev
        try (Connection connection = DriverManager.getConnection(connectionUrl, userName, password);
             Statement statement = connection.createStatement()) {
            ResultSet resultSet = statement.executeQuery("SELECT lesson_1, lesson_2 FROM student WHERE surname = 'Alekseev'");
            while (resultSet.next()) {
                System.out.println(resultSet.getString("lesson_1"));
                System.out.println(resultSet.getString("lesson_2"));
                System.out.println("_____________________");
            }
            System.out.println("print table");
        }


    }
}
