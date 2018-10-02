package Main;

import java.util.Scanner;

public class Start {
	static Scanner sc = new Scanner(System.in);

	public Start() {
		
		
		
		
		
		
	
		while(true)
		{
			System.out.println("==================================================");
			System.out.println("1. 기초정보관리 || 2. 입출고관리 || 3. 재고현황 || 4. 종료");
			System.out.println("put nember : ");
			int x = Integer.parseInt(sc.next());
			
				if (x == 1) {
					.menu();
				} else if (x == 2) {
					.menu();
				} else if (x == 3) {
					.menu();
				} else if (x == 4) {
					.menu();
				} else if (x == 5) {
					System.exit(-1);
				} else {
					System.out.println("잘못입력!!");
				}
		}
	}
	public static void main(String[] args) {
		Start Main = new Start();
			
	}
}
