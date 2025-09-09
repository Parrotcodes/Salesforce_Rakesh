package dbDao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private static final String url = "jdbc:postgresql://localhost:5432/mydb";
    private static final String dbuser = "postgres";
    private static final String dbpwd = "root";

    public static Connection getConnection() throws Exception {
        Class.forName("org.postgresql.Driver");
        return DriverManager.getConnection(url, dbuser, dbpwd);
    }

}
