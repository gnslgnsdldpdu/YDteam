package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GoodsDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;

	public GoodsDao() {
		try {
			String user = "hr";
			String pw = "hr";
			String url = "jdbc:oracle:thin:@localhost:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public ResultSet SelectWH() {
		sql = "select * from warehouse_t";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
		}catch(SQLException e) {
			e.printStackTrace();
		}return rs;
	}
	
	public boolean insertItem(ItemDto dto) {
		boolean result = false;
		sql = "insert into "
		try {
			
		}
	}
}
