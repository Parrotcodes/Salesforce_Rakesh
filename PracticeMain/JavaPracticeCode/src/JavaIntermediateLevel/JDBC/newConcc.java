package JavaIntermediateLevel.JDBC;

import java.sql.*;

public class newConcc {
    private static final String url="jdbc:postgresql://localhost:5432/mydb";
    private static final String user = "postgres";
    private  static final String pwd ="root";

    static void main() {
        try {
            String query = "select * from Customer";

            String insertQuery = "Insert into Customer(customerid,customername,lastname,country,age,phone) values(?,?,?,?,?,?)";
            String getById = "select * from Customer where customerid=?";

            Connection conn = DriverManager.getConnection(url,user,pwd);

            Statement stmt = conn.createStatement(); // use -> fetching data using Statement

//            PreparedStatement pstmt = conn.prepareStatement(insertQuery); // use -> insert,update (data taking from user input)

//            Inserting data into the db
//            pstmt.setInt(1,0);
//            pstmt.setString(2,"New customer");
//            pstmt.setString(3,"new entry");
//            pstmt.setString(4,"India");
//            pstmt.setInt(5,44);
//            pstmt.setInt(6,5646464);

//            int restult = pstmt.executeUpdate();
//            if (restult>0){
//                System.out.println("Data inserted Successfully");
//            }else {
//                System.out.println("Data insertion failed");
//            }

//            Fetching only one user data with id

            PreparedStatement getcustomerbyid = conn.prepareStatement(getById);
            getcustomerbyid.setInt(1,10);
            ResultSet getId = getcustomerbyid.executeQuery();
            if (getId.next()){
                System.out.println("Id: "+getId.getInt("customerid"));
                System.out.println("Name: "+getId.getString("customername"));
                System.out.println("__________________________________________________");
            }else {
                System.out.println("Invalid id!");
            }
//            Fetching data from db
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()){
                System.out.println("Id: "+rs.getInt("customerid"));
                System.out.println("Customer Name: "+rs.getString("customername"));
                System.out.println("Last Name: "+rs.getString("lastname"));
                System.out.println("Phone "+rs.getInt("phone"));
                System.out.println("Country: "+rs.getString("country"));
                System.out.println("Age: "+rs.getInt("age"));
                System.out.println("__________________________________________________");
            }

//            close
            rs.close();
            stmt.close();
            conn.close();


        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
