package Week3.Day5.CRUD;

import java.sql.*;

public class Customer_CRUD {
//    Queries
//    Insert
    public static final String insetquery = "INSERT INTO customer (cname, cemail, cage, cphone, cmarried, cgender) VALUES (?,?, ?, ?, ?, ?);";
    public static final String deletequery = "DELETE FROM customer WHERE customerid = ?;";
    public static final String updatequery = "UPDATE customer SET cname = ?, cage = ?, cmarried = ? WHERE customerid = ?;";
    public static final String readquery = "SELECT * FROM customer;";
    public static final String readqueryById = "SELECT * FROM customer WHERE customerid = ?;";


//  CRUD - Methods

//    Insert -- adding new customer
    public static boolean AddNewCustomer(String custname, String custemail, int custage, int custphone, String custmariage, String custgender){
        Connection conn = customeConn.createConn();
        boolean r = false;

        try {
            PreparedStatement istmt  = conn.prepareStatement(insetquery);
            istmt.setString(1,custname);
            istmt.setString(2,custemail);
            istmt.setInt(3,custage);
            istmt.setInt(4,custphone);
            istmt.setString(5,custmariage);
            istmt.setString(6,custgender);

            int rows = istmt.executeUpdate();

            if (rows>0){
                System.out.println("Successfully added New Customer! Rows effected: "+rows);
            }else {
                System.out.println("Failed to inset!");
            }
            r= true;
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return r;

    }

//    Delete By Id
    public static boolean DeleteCustomerById(int id){
        Connection conn = customeConn.createConn();
boolean r = false;
        try {
            PreparedStatement dstmt = conn.prepareStatement(deletequery);
            dstmt.setInt(1,id);

            int rows = dstmt.executeUpdate();
            if (rows>0){
                System.out.println("Customer deleted successfully! Id: "+id);
            }else {
                System.out.println("Deletion Failed!..");
            }

            r= true;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return r;
    }

//    Update By Id
    public static boolean UpdateCustomerById(String name,int age,String marry,int id){
        Connection conn = customeConn.createConn();
boolean r = false;
        try {
            PreparedStatement upstmt = conn.prepareStatement(updatequery);
            upstmt.setString(1,name);
            upstmt.setInt(2,age);
            upstmt.setString(3,marry);
            upstmt.setInt(4,id);

            int rows = upstmt.executeUpdate();
            if (rows>0){
                System.out.println("Customer info updated Successfully! Updated ID: "+id);
            }else {
                System.out.println("Update Failed!");
            }
            r = true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return  r;
    }

//    Read - get All customers data
    public static boolean showAllCustomers(){
        Connection conn = customeConn.createConn();
        boolean r = false;

        try {
            Statement readstmt = conn.createStatement();

            ResultSet rs = readstmt.executeQuery(readquery);

            while (rs.next()){
                System.out.println("ID: "+rs.getInt(1));
                System.out.println("Name: "+rs.getString(2));
                System.out.println("Email: "+rs.getString(3));
                System.out.println("Age: "+rs.getString(4));
                System.out.println("Phone: "+rs.getString(5));
                System.out.println("Married: "+rs.getString(6));
                System.out.println("Gender: "+rs.getString(7));

                System.out.println("-----------------------------------------------------------");
            }
            r = true;

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return r;
    }

}
