package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dto.BuySellDto;

public class BuySellDAO {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String sql;
	public int r;

	public BuySellDAO() {
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

	public void insertBuyInfo(BuySellDto dto) {
		sql = "insert into buy_t (buyer, cp_name, address, ph, ceo) values(?,?,?,?,?) ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBuyer());
			pstmt.setString(2, dto.getCp_name());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getPhone());
			pstmt.setString(5, dto.getCeo());

			r = pstmt.executeUpdate();

			System.out.println(r + " 건 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// end of insertBuyInfo

	public void updateBuyInfo(BuySellDto dto) {
		sql = "update buy_t set cp_name=?, address=?, ph=?, ceo=? where buyer=? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBuyer());
			pstmt.setString(2, dto.getCp_name());
			pstmt.setString(3, dto.getAddress());
			pstmt.setString(4, dto.getPhone());
			pstmt.setString(5, dto.getCeo());

			r = pstmt.executeUpdate();

			System.out.println(r + " 건 입력되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}// end of updateBuyInfo

	public void selectBuyList() {
		BuySellDto dto = null;
		List<BuySellDto> list = new ArrayList<>();

		sql = "select buyer, cp_name, address, ph, ceo from buy_t ";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto = new BuySellDto();
				dto.setBuyer(rs.getString("buyer"));
				dto.setCp_name(rs.getString("cp_name"));
				dto.setAddress(rs.getString("address"));
				dto.setPhone(rs.getString("ph"));
				dto.setCeo(rs.getString("ceo"));

				list.add(dto);

			}

			for (BuySellDto d : list) {
				System.out.println(d);
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

		// return list;

	}
}
