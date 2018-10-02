package InProduct;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InRegister {

	private PreparedStatement pstmt;
	private Connection conn;
	private ResultSet rs;

	try
	{
		String user = "hr";
		String pw = "hr";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";

		Class.forName("oracle.jdbc.driver.OracleDriver");
		conn = DriverManager.getConnection(url, user, pw);
	}catch(SQLException e)	{
		e.printStackTrace();
	}

	public void execute(Scanner sc) {

		String pname;
		// 상품명
		int iAmount = 0;
		// 입고수량
		String iPrice;
		// 입고가
	
		System.out.println("입고된 상품이름을 입력하세요.");
		pname = sc.next();
		sc.nextLine();
		try {
			String sql = "select p_code, p_name, unitp, buyer, w_code, w_quan from save_t where p_name = ?";
			rs = pstmt.executeQuery(sql);
			boolean flag;
				while (flag) {
					System.out.print("입고 수량 : ");
					try {
						iAmount = sc.nextInt();
					} catch (InputMismatchException e) {
						sc.next();
						System.out.println("숫자로 입력하세요.");
						continue;
					}
					flag = false;
				}
				
				System.out.println("성공적으로 입력되었습니다.");
				System.out.println();

			} catch (SQLException e) {
				System.out.println("없는 상품명입니다. 엔터를 입력하면 상위메뉴로 돌아갑니다");
				e.printStackTrace();
			}
	}
}