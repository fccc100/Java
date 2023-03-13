import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String url = "jdbc:mysql://127.0.0.1:3306/test";
            String user = "root";
            String password = "1234";
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println(con);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
