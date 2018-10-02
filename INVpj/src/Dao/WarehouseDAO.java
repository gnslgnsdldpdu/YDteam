package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dto.WarehouseDTO;

public class WarehouseDAO {

	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	public int r;

	public WarehouseDAO() {
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

	public void insertWarehouse(WarehouseDTO wdt) {
		sql = " insert into Warehouse_t values (?,?,?)";

		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, wdt.getW_code());
			pstmt.setString(2, wdt.getW_name());
			pstmt.setString(3, wdt.getExp());

			r = pstmt.executeUpdate();

			System.out.println(r + " 건 입력되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void updateWareHouse(WarehouseDTO wdt) {
		sql = "update Warehouse_t set W_name=?, EXP=? where W_code=?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, wdt.getW_code());
			pstmt.setString(2, wdt.getW_name());
			pstmt.setString(3, wdt.getExp());

			r = pstmt.executeUpdate();

			System.out.println(r + " 건 입력되었습니다.");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public void selectWareHouseList() {
		WarehouseDTO wdt = null;
		List<WarehouseDTO> list = new ArrayList<>();

		sql = "select W_code, W_name, Exp from Warehouse_t";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				wdt = new WarehouseDTO();
				wdt.setW_code(rs.getString("W_code"));
				wdt.setW_name(rs.getString("W_name"));
				wdt.setExp(rs.getString("Exp"));

				list.add(wdt);

			}
			for (WarehouseDTO w : list) {
				System.out.println(w);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
