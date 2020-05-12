package jdbc;

import java.sql.*;

public class BazaDate {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db")) {
			PreparedStatement preparedStatement = connection.prepareStatement("insert into tabel (id,nume) values(?,?)");
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "unuNume");
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
