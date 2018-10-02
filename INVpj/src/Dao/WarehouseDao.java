package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dto.WarehouseDto;

public class WarehouseDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;

public WarehouseDao() throws SQLException, ClassNotFoundException {
	try {
		String user = "micol";
		String pw = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pw);
		
	} catch (SQLException e) {
		e.printStackTrace();
 }
}	

public void WarehouseDao() {
	
	String sql = "select * from Warehouse_t";
	WarehouseDto bean = new WarehouseDto();
	try {
		pstmt = conn.prepareStatement(sql);
		rs = pstmt.executeQuery();
		while(rs.next()) {
			bean = new  WarehouseDto();
			bean.setW_code(rs.getString("W_code"));
			bean.setW_name(rs.getString("W_name"));
			bean.setExp(rs.getString("exp"));
			bean.toString();
		}
		rs.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}
}

public void close() throws SQLException {
	pstmt.close();
	conn.close();
}
}

