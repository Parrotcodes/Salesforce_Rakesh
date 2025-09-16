package UnitTesting.JunitJDBC.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class newConnection {
    private static final String url ="jdbc:mysql://localhost:3306/mydb";
    private static final String name = "root";
    private static final String pwd ="";

    public static final Connection getConnection(){
        Connection conn;
            try {
                conn = DriverManager.getConnection(url,name,pwd);
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        return conn;
    }
}
