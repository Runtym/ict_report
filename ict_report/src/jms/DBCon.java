package jms;

import java.sql.DriverManager;

public class DBCon {
	private static final String url = "jdbc:mariadb://localhost:3306/oreo";
	private static final String id = "root";
	private static final String pw = "12345678";
	private static final String driver = "org.mariadb.jdbc.Driver";

	private static Connection conn;

	private static void open() {
		try {
			Class.forName(driver);
			DBCon.conn = DriverManager.getConnection(url, id, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Connention getconn() {
		if (DBCon.conn == null) {
			open();
		}
		return DBCon.conn;
	}

	public static void close() {
		if (DBCon.conn != null) {
			try {
				DBCon.conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		DBcon.conn = null;
	}
	
	public static void main(String[] args) {
		DBCon.getconn();
	}
}
