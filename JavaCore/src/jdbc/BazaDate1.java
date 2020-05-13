package jdbc;

import java.sql.*;

public class BazaDate1 {
	
	public static void createNewTable() {
		
        String url = "jdbc:sqlite:database.db";
        String sql = "CREATE TABLE IF NOT EXISTS tabel (id integer,	nume text);";
        
        try (Connection conn = DriverManager.getConnection(url);
                Statement stmt = conn.createStatement()) {
            stmt.execute(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

	public static void main(String[] args) {
		createNewTable();
		
	}

}
