package UnitTesting.JunitJDBC.CRUD;

import UnitTesting.JunitJDBC.Dao.newConnection;

import java.sql.*;

public class CRUDoperations {

    public void insert(String name, String email,String password){
        String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

        Connection conn = newConnection.getConnection();

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1,name);
            stmt.setString(2,email);
            stmt.setString(3,password);

            int rows = stmt.executeUpdate();
            if (rows>0){
                System.out.println("Inserted successfully!");
            }else {
                System.out.println("Insertion Failed check the filed values.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void update(String name,String email, int id){
        Connection conn = newConnection.getConnection();

        String sql = "UPDATE users SET name=?, email=? WHERE id=?";

        try {
            PreparedStatement stmt = conn.prepareStatement(sql);

            stmt.setString(1,name);
            stmt.setString(2,email);
            stmt.setInt(3,id);

            stmt.executeUpdate();
            System.out.println("updated successfully!");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void delete(int id){
        Connection conn = newConnection.getConnection();
        String sql = "DELETE FROM users WHERE id=?";

        PreparedStatement stmt = null;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,id);

            stmt.executeUpdate();
            System.out.println("Data deleted fromd db! Id: "+id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void readinfo(){
        String sql = "SELECT * FROM users";

        Connection conn = newConnection.getConnection();

        Statement stmt = null;
        try {
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()){
                System.out.println("Id: "+rs.getInt("id")
                        +"Name: "+ rs.getString("name")
                        + "Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
