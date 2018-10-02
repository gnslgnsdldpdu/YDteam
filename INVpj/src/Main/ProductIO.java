package Main;

import java.util.Scanner;

import Inven.Manage.InProduct.InProduct;
import Inven.Manage.OutProduct.OutProduct;

public class ProductIO {

	private Scanner sc = new Scanner(System.in);

	public void menu() {
		InProduct ip = new InProduct();
		OutProduct op = new OutProduct();

		while (true) {
			System.out.println("==================================================");
			System.out.println("1. 입고 || 2. 출고 || 3. 나가기 ");
			System.out.println("입력번호 : ");
			int x = Integer.parseInt(sc.next());

			if (x == 1) {
				ip.menu();
			} else if (x == 2) {
				op.menu();
			} else if (x == 3) {
				break;
			} else {
				System.out.println("잘못입력!!");
			}
		}

	}

}
