

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {

	//register a new user info method
	 public static boolean register(String username, String email, String password, String gender, String marital) {
	        String sql = "INSERT INTO registerusers(username,email,password,gender,marital) VALUES(?,?,?,?,?)";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {

	            ps.setString(1, username);
	            ps.setString(2, email);
	            ps.setString(3, password);
	            ps.setString(4, gender);
	            ps.setString(5, marital);

	            int rows = ps.executeUpdate();
	            return rows > 0; 
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	
	 //login check validation method
	    public static boolean check(String email, String password) {
	        String sql = "SELECT * FROM registerusers WHERE email=? AND password=?";
	        try (Connection conn = DBConnection.getConnection();
	             PreparedStatement ps = conn.prepareStatement(sql)) {

	            ps.setString(1, email);
	            ps.setString(2, password);

	            ResultSet rs = ps.executeQuery();
	            return rs.next(); 
	            
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }
}
