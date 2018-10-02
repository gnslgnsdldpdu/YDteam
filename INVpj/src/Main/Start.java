package Main;

import java.util.Scanner;

public class Start {
	static Scanner sc = new Scanner(System.in);

	public Start() {
		ProductIO pIO = new ProductIO;
		
		
		
		
		
	
		while(true)
		{
			System.out.println("==================================================");
			System.out.println("1. 기초정보관리 || 2. 입출고관리 || 3. 재고현황 || 4. 종료");
			System.out.println("입력 번호 : ");
			int x = Integer.parseInt(sc.next());
			
				if (x == 1) {
					.menu();
				} else if (x == 2) {
					pIO.menu();
				} else if (x == 3) {
					WareHouseDao.menu();
				} else if (x == 4) {
					.menu();
				} else {
					System.out.println("잘못입력!!");
				}
		}
	}
	public static void main(String[] args) {
		
		Start 1111 = new Start();
	}
}
