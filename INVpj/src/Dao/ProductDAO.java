package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Dto.ProductDTO;

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
	}

	public void insertProductInfo(ProductDTO pdto) {
		sql = "insert into input_t (buy_num, line, i_code, i_name, quan, in_price, price, input_date) values(?,?,?,?,?,?,?,Sysdate) ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pdto.getBuy_num());
			pstmt.setInt(2, pdto.getLine());
			pstmt.setString(3, pdto.getI_code());
			pstmt.setString(4, pdto.getI_name());
			pstmt.setInt(5, pdto.getQuan());
			pstmt.setInt(6, pdto.getIn_price());
			pstmt.setInt(7, pdto.getPrice());
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
	}

	public void DeleteProductInfo1(ProductDTO pdto) {
		sql = "delete from input_t where buy_num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pdto.getBuy_num());
			r = pstmt.executeUpdate();
			System.out.println(r + " 건 제거되었습니다.");

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

	public void DeleteProductInfo2(ProductDTO pdto) {
		sql = "delete from input_t where sell_num = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pdto.getSell_num());
			r = pstmt.executeUpdate();
			System.out.println(r + " 건 제거되었습니다.");

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

	public ResultSet UpdateProductInfo(ProductDTO dto) {
		sql = "update input_t set buy_num, line, i_code, i_name, quan, in_price, price, re_date";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBuy_num());
			pstmt.setInt(2, dto.getLine());
			pstmt.setString(3, dto.getI_code());
			pstmt.setString(4, dto.getI_code());
			pstmt.setInt(5, dto.getQuan());
			pstmt.setInt(6, dto.getIn_price());
			pstmt.setString(7, dto.getRe_date());

			r = pstmt.executeUpdate();

			System.out.println(r + " 건 변경되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}

	public ResultSet UpdateProductInfo1(ProductDTO dto) {
		sql = "update output_t set buy_num, line, i_code, i_name, quan, out_price, price, re_date";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getBuy_num());
			pstmt.setInt(2, dto.getLine());
			pstmt.setString(3, dto.getI_code());
			pstmt.setString(4, dto.getI_code());
			pstmt.setInt(5, dto.getQuan());
			pstmt.setInt(6, dto.getOut_price());
			pstmt.setString(7, dto.getRe_date());

			r = pstmt.executeUpdate();

			System.out.println(r + " 건 변경되었습니다.");

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return rs;
	}

}
