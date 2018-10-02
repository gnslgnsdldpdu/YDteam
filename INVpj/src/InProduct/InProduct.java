package InProduct;

import java.util.Scanner;

public class InProduct {

	public void menu() {
		Scanner sc = new Scanner(System.in);
		boolean n = false;
		do {
			System.out.println("1. 등록 || 2. 입고 내역 보기 || 3. 삭제 || 4.종료 ");

			int menu = sc.nextInt();
			System.out.println();
			switch (menu) {
			case 1:

				break;
			case 2:

				break;
			case 3:

				break;
			case 4:
				System.out.println("프로그램을 종료합니다.");
				n = true;
			}
			sc.nextLine();
		} while (!n);
	}

}