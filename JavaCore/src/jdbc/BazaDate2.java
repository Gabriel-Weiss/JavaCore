package jdbc;

import java.sql.*;

public class BazaDate2 {

	public static void main(String[] args) {
		try (Connection connection = DriverManager.getConnection("jdbc:sqlite:database.db")) {
			PreparedStatement preparedStatement = connection.prepareStatement("select * from tabel");
			ResultSet resultSet = preparedStatement.executeQuery();
			while(resultSet.next()) System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2));
		} catch (SQLException e) {
			System.out.println(e);
		}

	}

}
