package JavaIntermediateLevel.Projects.StudentManagementSystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class stdDBConn {
    private static final String dburl ="jdbc:postgresql://localhost:5432/mydb";
    private static final String dbuser ="postgres";
    private static final String dbpwd ="root";

    //  DB CONNECTION
    static Connection stdconn;

    public static Connection createConn() {
        try {
            stdconn = DriverManager.getConnection(dburl,dbuser,dbpwd); //connection

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (Connection) stdconn;
    }
}
