package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Dto.ProductDTO;
import Dto.ProioDTO;

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
		sql = "insert into proio_t (p_num, line, i_code, i_name, quan, p_price, price, io_date) values(?,?,?,?,?,?,?,Sysdate) ";
		try {
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pdto.getP_num());
			pstmt.setInt(2, pdto.getLine());
			pstmt.setString(3, pdto.getI_code());
			pstmt.setString(4, pdto.getI_name());
			pstmt.setInt(5, pdto.getQuan());
			pstmt.setInt(6, pdto.getP_price());
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

	public void DeleteProductInfo(ProductDTO pdto) {
		sql = "delete from proio_t where i_name = ? ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, pdto.getI_name());
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



	public void UpdateProductInfo(ProductDTO dto) {
		sql = "update proio_t set i_code=?, i_name=?, quan=?, p_price=? where p_num=? ";
		try {
			System.out.println(dto.getI_code()+dto.getI_name()+dto.getP_num());
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getI_code());
			pstmt.setString(2, dto.getI_name());
			pstmt.setInt(3, dto.getQuan());
			pstmt.setInt(4, dto.getP_price());
			pstmt.setString(5, dto.getP_num());

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
	
	}
	
	public void selectProioList() {  //ProioDao
		ProioDTO pit = null;
		List<ProioDTO> list = new ArrayList<>();
		
		sql = "SELECT P_num ,line, I_CODE  ,I_NAME, QUAN  ,P_PRICE , PRICE , Io_DATE   FROM proio_t";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				pit = new ProioDTO();
				pit.setP_num(rs.getString("P_num"));
				pit.setLine(rs.getString("Line"));
				pit.setI_code(rs.getString("I_code"));
				pit.setI_name(rs.getString("I_name"));
				pit.setQuan(rs.getInt("Quan"));
				pit.setP_price(rs.getInt("P_price"));
				pit.setPrice(rs.getInt("Price"));
				// 상품정보 bean 생성
				list.add(pit);
				
			}
			for (ProioDTO p : list) {
				System.out.println(p);
			}
		
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			
		}
		}
	}