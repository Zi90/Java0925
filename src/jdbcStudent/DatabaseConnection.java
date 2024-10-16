package jdbcStudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	private static DatabaseConnection dbc = new DatabaseConnection();
	private Connection conn = null;
	
	private String jdbDriver = "com.mysql.cj.jdbc.Driver";
	private String jdbUrl = "jdbc:mysql://localhost:3306/javadb";
	
	private DatabaseConnection() {
		try {
			Class.forName(jdbDriver);
			conn = DriverManager.getConnection(jdbUrl, "javaUser", "mysql");
		}catch (ClassNotFoundException e) {
			System.out.println("드라이버를 찾을 수 없습니다");
			e.printStackTrace();
		}catch (SQLException e) {
			System.out.println("연결정보가 정확하지 않습니다");
		e.printStackTrace();
		}
		
	}
	
	public static DatabaseConnection getInstance() {
		return dbc;
	}
	
	public Connection getConnection() {
		return conn;
	}
}