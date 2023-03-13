import java.sql.*;

public class Main {

    public static void main(String[] args) {
        Statement sm = null;
        Connection con = null;
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String url = "jdbc:mysql://127.0.0.1:3306/t1";
            String user = "root";
            String password = "1234";
            con = DriverManager.getConnection(url, user, password);
            System.out.println(con);

            sm = con.createStatement();

            String sql = "create table stu(name varchar(32), age int)";
            sm.execute(sql);
            String sql2 = "insert into stu values('zhangsan', 23),('lisi', 36)";
            sm.executeUpdate(sql2);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (sm != null) {
                try {
                    sm.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                try {
                    con.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
