package JavaIntermediateLevel.JDBC;

import java.sql.*;

//Steps:
//  1.Downloading the driver and load into the project structure libraries
//  2.Load Driver/Registering is old way (not recommended)
//  3.Creating a connection
//  4.Creating a stmt
//  5.Executing Query
//  6.go to next() point (ResultSet)
//  7.close connection

public class Conncection {
    private static final String url = "jdbc:postgresql://localhost:5432/mydb";
    private static final String user = "postgres";
    private static final String password = "root";
    static void main() {
//        query
        String sql = "Select * from Customer";

        try {
//            creating connection
            Connection conn = DriverManager.getConnection(url,user,password);

//            create stmt
            Statement stmt = conn.createStatement(); // used for static sql queries
//            PreparedStatement pstmt = conn.prepareStatement(sql); // used for dynamic queries (with parameters)
//            CallableStatement cstmt = conn.prepareCall(sql); // used for stored procedures

//            Execute the query
            ResultSet rs = stmt.executeQuery(sql);

//            rs.next(); pointer move to first column
//           while (rs.next()) {
//
////            Processing Results
//               String data = new String();
//               System.out.println("Item:"+data);
//
//           }

            // iterate through result set
            while (rs.next()) {
                // Example: assuming your Customer table has id, name, and email columns
                int id = rs.getInt("CustomerID");
                String name = rs.getString("CustomerName");
                String lname = rs.getString("LastName");
                String country = rs.getString("Country");
                Integer age = rs.getInt("Age");
                Integer phone = rs.getInt("Phone");

                System.out.println("Customer [ID: " + id + ", First_Name: " + name +" , Last_Name"+lname+ ", Country: " + country + ", Age: " + age +", Phone: " + phone+"]");
            }
//            close()
            rs.close();
            stmt.close();
            conn.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
