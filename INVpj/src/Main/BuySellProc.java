package Main;

import java.util.Scanner;

import Dao.BuySellDAO;
import Dto.BuySellDTO;

public class BuySellProc {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int menu = 0;

		while (true) {
			System.out.println("메뉴를 선택하세요. 1:insert 2:update 3:select 4:exit ");

			menu = sc.nextInt();
			sc.nextLine();

			if (menu == 1) {
				BuySellDAO dao = new BuySellDAO();
				BuySellDTO dto = new BuySellDTO();
				System.out.println("Buyer 입력:");
				String buyer = sc.nextLine();
				dto.setBuyer(buyer);
				System.out.println("cp_name 입력:");
				String cpName = sc.nextLine();
				dto.setCp_name(cpName);
				System.out.println("address 입력:");
				String address = sc.nextLine();
				dto.setAddress(address);
				System.out.println("phone 입력:");
				String phone = sc.nextLine();
				dto.setPhone(phone);
				System.out.println("ceo 입력:");
				String ceo = sc.nextLine();
				dto.setCeo(ceo);

				dao.insertBuyInfo(dto);

			} else if (menu == 2) {
				BuySellDAO dao = new BuySellDAO();
				BuySellDTO dto = new BuySellDTO();
				System.out.println("Buyer 입력:");
				String buyer = sc.nextLine();
				dto.setBuyer(buyer);
				System.out.println("cp_name 입력:");
				String cpName = sc.nextLine();
				dto.setCp_name(cpName);
				System.out.println("address 입력:");
				String address = sc.nextLine();
				dto.setAddress(address);
				System.out.println("phone 입력:");
				String phone = sc.nextLine();
				dto.setPhone(phone);
				System.out.println("ceo 입력:");
				String ceo = sc.nextLine();
				dto.setCeo(ceo);

				dao.updateBuyInfo(dto);

			} else if (menu == 3) {
				BuySellDAO dao = new BuySellDAO();
				dao.selectBuyList();

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}
