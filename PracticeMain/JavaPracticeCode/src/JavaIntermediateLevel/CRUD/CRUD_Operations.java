package JavaIntermediateLevel.CRUD;

import java.sql.*;

public class CRUD_Operations {
    private static final String dburl ="jdbc:postgresql://localhost:5432/mydb";
    private static final String dbuser ="postgres";
    private static final String dbpwd ="root";

    //READ -    Get DBInfo
    private static final String getquery ="select * from Customer";

//    INSERT - inserting values into db
    private static final String insertquery ="Insert into subtable(customerid,customername) values(221,'new Customer')";

//    UPDATE - updating db values
private static final String updatequery ="update subtable set customerid=001 where customername='new Customer'";

//    DELETE - updating db values
private static final String deletequery ="delete from subtable where customerid=1";


    static void main() {
        try {
//            QUERY
//            String dbquery = "select * from Customer";

//            Creating a new connection
            Connection dbcon = DriverManager.getConnection(dburl,dbuser,dbpwd);

//            Creating stmt
            Statement dbstmt = dbcon.createStatement();

//            INSERT stmt
            int rows = dbstmt.executeUpdate(insertquery);
            if (rows>0){
                System.out.println("New user data inserted "+rows);
            }else {
                System.out.println("Insertion failed!");
            }

//            UPDATE stmt
            int urows = dbstmt.executeUpdate(updatequery);
            if (urows>0){
                System.out.println("Updated no.of rows "+urows);
            }else {
                System.out.println("Updatation failed!");
            }

//          DELETE stmt
            int drows = dbstmt.executeUpdate(deletequery);
            if (urows>0){
                System.out.println("no.of rows deleted "+drows);
            }else {
                System.out.println("Deletion failed!");
            }
//            result set
            ResultSet dbrs = dbstmt.executeQuery(getquery);

            while (dbrs.next()){
                System.out.println("Name: "+dbrs.getString("Customername"));
                System.out.println("Country: "+dbrs.getString("country"));
            }

//            dbrs.close();
//            dbstmt.close();
//            dbcon.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
