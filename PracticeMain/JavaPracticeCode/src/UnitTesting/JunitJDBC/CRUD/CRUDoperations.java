package UnitTesting.JunitJDBC.CRUD;

import UnitTesting.JunitJDBC.Dao.newConnection;

import java.sql.*;

public class CRUDoperations {
    Connection conn = newConnection.getConnection();

    // INSERT
    public void insert(String name, String email, String password) {
        String sql = "INSERT INTO users (name, email, password) VALUES (?, ?, ?)";

        try (PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setString(3, password);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Inserted successfully!");
            } else {
                System.out.println("Insertion failed, check the field values.");
            }

        } catch (SQLException e) {
            System.out.println("Error during insert: " + e.getMessage());
        }
    }

    // UPDATE
    public void update(String name, String email, int id) {
        String sql = "UPDATE users SET name = ?, email = ? WHERE id = ?";

        try (Connection conn = newConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, name);
            stmt.setString(2, email);
            stmt.setInt(3, id);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("Updated successfully!");
            } else {
                System.out.println("No record found with id = " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error during update: " + e.getMessage());
        }
    }

    // DELETE
    public void delete(int id) {
        String sql = "DELETE FROM users WHERE id = ?";

        try (Connection conn = newConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rows = stmt.executeUpdate();

            if (rows > 0) {
                System.out.println("Data deleted from db! Id: " + id);
            } else {
                System.out.println("No record found to delete with id = " + id);
            }

        } catch (SQLException e) {
            System.out.println("Error during delete: " + e.getMessage());
        }
    }

    // READ
    public void readinfo() {
        String sql = "SELECT * FROM users";

        try (Connection conn = newConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                System.out.println("Id: " + rs.getInt("id")
                        + " | Name: " + rs.getString("name")
                        + " | Email: " + rs.getString("email"));
            }

        } catch (SQLException e) {
            System.out.println("Error during read: " + e.getMessage());
        }
    }
}
