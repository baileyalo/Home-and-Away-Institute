package hai.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class haidb  {

	private static Connection getDatabaseConnection() {
		String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
		String hai = "C:/Users/Antonette Harvey/Documents/year 3/semester 2/java/";
		String connURL = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb, *.accdb)};DBQ="
				+ hai + ".accdb;";
		String username = "";
		String password = "";

		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(connURL, username,
					password);
			if (conn == null)
				System.out.println("Could not connect to database");
			else
				System.out.println("Successfully connected to database");
			return conn;

		} catch (ClassNotFoundException e) {

			e.printStackTrace();
			return null;

		} catch (SQLException e) {

			e.printStackTrace();
			return null;

		}
	}

	public static int insert(String query) throws SQLException {
		Connection conn = getDatabaseConnection();
		Statement st = conn.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of rows affected: " + rows);
		st.close();
		conn.close();
		return rows;
	}

	public static ResultSet select(String query) throws SQLException {
		Connection conn = getDatabaseConnection();
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery(query);
		int rows = 0;
		while (rs.next()) {
			rows++;
		}
		System.out.println("Number of rows retreived: " + rows);
		st.close();
		conn.close();
		return rs;

	}

	public static int update(String query) throws SQLException {
		Connection conn = getDatabaseConnection();
		Statement st = conn.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of rows affected: " + rows);
		st.close();
		conn.close();
		return rows;
	}

	public static int create(String query) throws SQLException {
		Connection conn = getDatabaseConnection();
		Statement st = conn.createStatement();
		int rows = st.executeUpdate(query);
		System.out.println("Number of rows affected: " + rows);
		st.close();
		conn.close();
		return rows;

	}

}
