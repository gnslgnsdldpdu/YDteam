package Main;

import java.sql.SQLException;
import java.util.Scanner;

import Dao.BuySellDAO;
import Dao.ProductDAO;
import Dao.WarehouseDAO;
import Dto.ProductDTO;
import Dto.WarehouseDTO;

public class ProductStart {
	static Scanner sc = new Scanner(System.in);

	public ProductStart() throws ClassNotFoundException, SQLException {
		ProductDTO pdto = new ProductDTO();
		ProductDAO pdao = new ProductDAO();
		WarehouseDTO wdto = new WarehouseDTO();
		WarehouseDAO wdao = new WarehouseDAO();

		while (true) {
			System.out.println("==================================================");
			System.out.println("1. 주문정보관리 || 2. 재고관리 || 3. 창고재고현황 || 4. 종료");
			System.out.println(": ");
			int x = Integer.parseInt(sc.next());

			if (x == 1) {
				System.out.println("1. 구매자정보 ||2. 판매자정보 ||3. 정보 수정 및 삭제 ||4. 상위메뉴");
				System.out.println(": ");
				int menu = Integer.parseInt(sc.next());
				if (menu == 1) {
					System.out.println("구매자정보.");
					BuySellDAO bdao = new BuySellDAO();
					bdao.selectBuyList();
				} else if (menu == 2) {
					System.out.println("판매자정보.");
					BuySellDAO sdao = new BuySellDAO();
					sdao.selectSellList();
				} else if (menu == 3) {
					System.out.println("정보 수정 및 삭제.");
				} else {
					System.out.println("상위메뉴로 갑니다.");
					continue;
				}
			} else if (x == 2) {
				System.out.println("1. 상품 입고 ||2. 상품 출고 ||3. 상품 조회 ||4. 상품 삭제 ||5. 상위메뉴");
				System.out.println(": ");
					int menu = Integer.parseInt(sc.next());
					if (menu == 1) {
						System.out.println("========== 입고 ==========");
						System.out.println("구매자번호를 입력하세요");
						sc.nextLine();
						String buy_num = sc.nextLine();
						pdto.setBuy_num(buy_num);
						System.out.println("상품번호을 입력하세요");
						String i_code = sc.nextLine();
						pdto.setBuy_num(i_code);
						System.out.println("상품명을 입력하세요");
						String i_name = sc.nextLine();
						pdto.setI_name(i_name);
						System.out.println("수량을 입력하세요");
						int quan = sc.nextInt();
						pdto.setQuan(quan);
						System.out.println("입고할 가격(단가)를 입력하세요");
						int in_price = sc.nextInt();
						pdto.setIn_price(in_price);
						System.out.println("총 가격은 "+ quan*in_price + "입니다.");
						pdao.insertProductInfo(pdto);
					} else if (menu == 2) {
						System.out.println("========== 출고 ==========");
						
					} else if (menu == 3) {
						System.out.println("========== 조회 ==========");
						
					} else if (menu == 4) {
						System.out.println("========== 삭제 ==========");
						System.out.println("삭제할 상품명을 입력하세요.");
						pdao.DeleteProductInfo1(pdto);
					} else {
						System.out.println("상위 메뉴로 갑니다.");
						continue;
					}
			} else if (x == 3) {
				System.out.println("1. 창고현황 ||2. 창고별 재고현황 ||3. 창고 삭제 ||4. 상위메뉴");
				System.out.println(": ");
				int menu = Integer.parseInt(sc.next());
				if (menu == 1) {
					System.out.println("======== 창고 현황 ========");
					
//					wdao.SearchWH();
				} else if (menu == 2) {
					System.out.println("======== 창고별 재고현황 =========");
				} else if (menu == 3) {
					System.out.println("========= 창고 삭제 =========");
				} else {
					System.out.println("상위 메뉴로 갑니다.");
					continue;
				}
			} else if (x == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		ProductStart st = new ProductStart();
	}
}
