package Dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	public int r;
	
	public ProductDAO() {
		try {
			String user = "micol";
			String pw = "1234";
			String url = "jdbc:oracle:thin:@192.168.0.89:1521:xe";

			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, user, pw);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}// Constructor
	
	public ResultSet insertItem(ProductDAO dto) {
		sql = "insert into input_t values(LPAD(Seq_input.nextval,8,'0'),:buy_num,line,i_code,i_name,quan,unitp,price,inputdate)";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			pstmt.setString(1, dto.getB_num());
			pstmt.setInt(2, dto.getLine());
			pstmt.setString(2, dto.getI_code());
			pstmt.setString(3, dto.getI_name());
			pstmt.setInt(4, dto.getQuan());
			pstmt.setInt(5, dto.getPrice());
			pstmt.setDate(6, (Date) dto.getO_date());
			pstmt.setDate(7, (Date) dto.getI_date());
			int r = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rs;
	}
}
