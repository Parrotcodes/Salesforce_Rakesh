package Week3.Day5.CRUD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class customeConn {
//    private static final String url ="jdbc:postgresql://localhost:5432/mydb";
    private static final String url ="jdbc:mysql://localhost:3306/myjdbcdb";
    private static final String user ="root";
    private static final String pwd ="";
    static Connection conn;

    public static Connection createConn(){
        try {
            conn = DriverManager.getConnection(url,user,pwd);

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return (Connection) conn;
    };

}
