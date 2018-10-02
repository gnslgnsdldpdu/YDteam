package Main;

import java.util.Scanner;

import Dao.WarehouseDAO;
import Dto.WarehouseDTO;


public class WarehouseProc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;
		
		while (true) {
			System.out.println("메뉴를 선택하세요. 1:insert 2:update 3:select 4:exit");
			
			menu = sc.nextInt();
			sc.nextLine();
			
			if (menu == 1) {
				WarehouseDTO wdt = new WarehouseDTO();
				WarehouseDAO wdo = new WarehouseDAO();
				System.out.println("W_code 입력");
				String W_code = sc.nextLine();
				wdt.setW_code(W_code);
				System.out.println("W_name 입력");
				String W_name = sc.nextLine();
				wdt.setW_name(W_name);;
				System.out.println("exp 입력");
				String exp = sc.nextLine();
				wdt.setExp(exp);;
				
				wdo.insertWarehouse(wdt);
				
			}else if (menu ==2) {
				WarehouseDTO wdt = new WarehouseDTO();
				WarehouseDAO wdo = new WarehouseDAO();
				System.out.println("W_code 입력");
				String W_code = sc.nextLine();
				wdt.setW_code(W_code);
				System.out.println("W_name 입력");
				String W_name = sc.nextLine();
				wdt.setW_name(W_name);
				System.out.println("exp 입력");
				String exp = sc.nextLine();
				wdt.setExp(exp);
				
				wdo.;
				
			} else if (menu == 3) {
				WarehouseDAO wdo = new WarehouseDAO();
				wdo.selectWareHouseList();

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
				
				
			}
		}
	}

}
