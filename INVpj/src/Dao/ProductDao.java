package Dao;

import java.util.Scanner;
import Dto.ProductDto;

public class ProductDao {

	public class Product {
		Boolean n = false;
		Scanner sc = new Scanner(System.in);

		public void menu() {

			int Menu;
			boolean n = true;
			while (true) {
				System.out.println("===================<관리페이지>================");
				System.out.println("1. 등록");
				System.out.println("2. 수정");
				System.out.println("3. 삭제");
				System.out.println("4. 리스트");
				System.out.println("5. 나가기");
				Menu = sc.nextInt();
				// 메뉴 번호를 입력받는 곳
				if (Menu == 1) {
					NRegister T_R = new NRegister();
					// 등록 페이지이동하는 부분
				} else if (Menu == 2) {
					NModify T_M = new NModify();
					// 수정 페이지이동하는 부분
				} else if (Menu == 3) {
					NDelete T_D = new NDelete();
					// 삭제 페이지이동하는 부분
				} else if (Menu == 4) {
					NList T_L = new NList();
					// 리스트 페이지이동하는 부분
				} else if (Menu == 5) {
					n = true;
					break;
				}
			}
		}
	}

}
