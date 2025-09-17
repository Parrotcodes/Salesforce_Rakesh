package UnitTesting.JunitJDBC;

import UnitTesting.JunitJDBC.CRUD.CRUDoperations;
import UnitTesting.JunitJDBC.Dao.newConnection;
import org.junit.jupiter.api.*;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestingJDBC {

    static CRUDoperations crud;
    static Connection conn;

    @BeforeAll
    static void dbSetup() {
        crud = new CRUDoperations();
        conn = newConnection.getConnection();
    }

    @BeforeEach
    void setupTable() throws SQLException {
        // Clean up the table before each test to maintain isolation
        String sql = "DELETE FROM users";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.executeUpdate();
        }
    }

    @Test
    @Order(1)
    void testInsert() throws SQLException {
        crud.insert("John Doe", "john@example.com", "pass123");

        // Verify insertion
        String sql = "SELECT * FROM users WHERE email = ?";
        try (PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "john@example.com");
            ResultSet rs = stmt.executeQuery();

            assertTrue(rs.next(), "User should be inserted");
            assertEquals("John Doe", rs.getString("name"));
            assertEquals("john@example.com", rs.getString("email"));
        }
    }

    @Test
    @Order(2)
    void testUpdate() throws SQLException {
        // First insert a record
        crud.insert("Jane Doe", "jane@example.com", "pass456");

        // Get inserted user ID
        int id;
        try (PreparedStatement stmt = conn.prepareStatement("SELECT id FROM users WHERE email = ?")) {
            stmt.setString(1, "jane@example.com");
            ResultSet rs = stmt.executeQuery();
            rs.next();
            id = rs.getInt("id");
        }

        // Update the user
        crud.update("Jane Smith", "jane.smith@example.com", id);

        // Verify update
        try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE id = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            assertTrue(rs.next(), "User should exist");
            assertEquals("Jane Smith", rs.getString("name"));
            assertEquals("jane.smith@example.com", rs.getString("email"));
        }
    }

    @Test
    @Order(3)
    void testDelete() throws SQLException {
        // Insert a user to delete
        crud.insert("Delete Me", "delete@example.com", "pass789");

        int id; String email;
        try (PreparedStatement stmt = conn.prepareStatement("SELECT id,email FROM users WHERE email = ?")) {
            stmt.setString(1, "delete@example.com");
            ResultSet rs = stmt.executeQuery();
            rs.next();
            id = rs.getInt("id");

            email = rs.getString("email");
            System.out.println("Email from DB:"+email);
        }

//        // Delete the user
        crud.delete(id);
//
//        // Verify deletion
        try (PreparedStatement stmt = conn.prepareStatement("SELECT * FROM users WHERE id = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            assertFalse(rs.next(), "User should be deleted");
        }
    }

    @Test
    @Order(4)
    void testReadinfo() throws SQLException {
        // Insert multiple users
        crud.insert("User1", "u1@example.com", "123");
        crud.insert("User2", "u2@example.com", "456");

        // Capture output
        crud.readinfo();

        // Check count in DB
        try (PreparedStatement stmt = conn.prepareStatement("SELECT COUNT(*) AS total FROM users")) {
            ResultSet rs = stmt.executeQuery();
            rs.next();
            int total = rs.getInt("total");
            assertEquals(2, total, "Should have 2 users in database");
        }
    }
}
