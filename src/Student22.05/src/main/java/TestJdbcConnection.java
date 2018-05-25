import java.sql.*;

public class TestJdbcConnection {

    private static Connection connection = null;

    public static void main(String[] args) throws SQLException {

        connection = createConnection();

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }
        //            PreparedStatement ps = connection.prepareStatement("select * from users where name=?");
      //  selectAllStudent();

        selectByEmail();

      //  inserPrepareStatement();

        }

    private static void selectByEmail() throws SQLException {
        PreparedStatement ps2 = connection.prepareStatement("select * from student WHERE email LIKE ?");
        ps2.setString(1, "%@gmaill.com");
        ResultSet rs2 = ps2.executeQuery();
        while (rs2.next()) {
            System.out.println("id " + rs2.getString(1) + " , Name: " + rs2.getString(2));
        }
    }

    private static void selectAllStudent() throws SQLException {
        PreparedStatement ps = connection.prepareStatement("select * from student");
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
                System.out.println("id " + rs.getString(1) + " , Name: " + rs.getString(2));
        }
    }

    private static void inserPrepareStatement() throws SQLException {
        String sql = "INSERT INTO student VALUES (?, ?,?,?)";
        PreparedStatement pstmt = connection.prepareStatement(sql);
        pstmt.setString(1, "irina");
        pstmt.setString(2, "Lianovna");
        pstmt.setString(3, "099");
        pstmt.setString(4, "@mail.ru");
        pstmt.executeUpdate();
        //  connection.commit();
    }

    private static Connection createConnection() {
        Connection connection = null;
        System.out.println("-------- PostgreSQL JDBC Connection Testing ------------");
        try {
            Class.forName("org.postgresql.Driver");
            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/test", "postgres",
                    "postgres");
        } catch (ClassNotFoundException e) {
            System.out.println("Where is your PostgreSQL JDBC Driver? Include in your library path!");
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
        }
        System.out.println("PostgreSQL JDBC Driver Registered!");
        return connection;

    }

}
