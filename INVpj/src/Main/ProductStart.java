package Main;

import java.sql.SQLException;
import java.util.Scanner;

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
			System.out.println("1. 기초정보관리 || 2. 입출고관리 || 3. 재고현황 || 4. 종료");
			System.out.println(": ");
			int x = Integer.parseInt(sc.next());

			if (x == 1) {
				System.out.println("1. 품목정보관리||2. 창고정보관리||3. 구매정보관리||4. 판매정보관리||5. 상위메뉴");
				System.out.println(": ");
				int menu = Integer.parseInt(sc.next());
				if (menu == 1) {
					System.out.println("품목정보 메뉴입니다.");
				} else if (menu == 2) {
					System.out.println("창고정보관리 메뉴입니다.");
				} else if (menu == 3) {
					System.out.println("구매정보관리 메뉴입니다.");
				} else if (menu == 4) {
					System.out.println("판매정보관리 메뉴입니다.");
				} else {
					System.out.println("상위메뉴로 갑니다.");
					continue;
				}
			} else if (x == 2) {
				System.out.println("1. 구매정보관리||2. 판매정보관리||3. 입출고처리관리||4. 상위메뉴");
				System.out.println(": ");
				int menu = Integer.parseInt(sc.next());
				if (menu == 1) {
					System.out.println("구매정보관리 화면입니다.");
				} else if (menu == 2) {
					System.out.println("판매정보관리 화면입니다.");
				} else if (menu == 3) {
					System.out.println("입출고처리관리 ");
				} else {
					continue;
				}
			} else if (x == 3) {
				System.out.println("1.모든 창고별 품목현황||2. 각 창고별 재고현황  ||3. 상위메뉴");
				System.out.println(": ");
				int menu = Integer.parseInt(sc.next());
				if (menu == 1) {
					System.out.println("모든 창고별 품목현황.");
					wdao.SearchWH();
				} else if (menu == 2) {
					System.out.println("각 창고별 재고현황.");
					wdao.SearchWH();
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
