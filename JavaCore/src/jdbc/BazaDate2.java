package jdbc;

import java.sql.*;

public class BazaDate2 {
	
	public void insert(int id, String nume) {
		String url = "jdbc:sqlite:database.db";
        String sql = "INSERT INTO tabel(id,nume) VALUES(?,?)";

        try (Connection conn = DriverManager.getConnection(url);
                PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            pstmt.setString(2, nume);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

	public static void main(String[] args) {
		new BazaDate2().insert(1, "unuNume");

	}

}
