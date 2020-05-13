package jdbc;

import java.sql.*;

public class BazaDate3 {
	public void selectAll(){
        String sql = "SELECT * FROM tabel";
        
        try (Connection conn = DriverManager.getConnection("jdbc:sqlite:database.db");
             Statement stmt  = conn.createStatement();
             ResultSet rs    = stmt.executeQuery(sql)){
            
            while (rs.next()) {
                System.out.println(rs.getInt("id") +" "+rs.getString("nume"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } 
    }

	public static void main(String[] args) {
		new BazaDate3().selectAll();
		
	}

}
