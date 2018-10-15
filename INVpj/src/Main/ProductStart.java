package Main;

import java.sql.SQLException;
import java.util.Scanner;

import Dao.BuySellDAO;
import Dao.ProductDAO;
import Dao.WarehouseDAO;
import Dto.BuySellDTO;
import Dto.ProductDTO;
import Dto.WarehouseDTO;

public class ProductStart {
	static Scanner sc = new Scanner(System.in);

	public ProductStart() throws ClassNotFoundException, SQLException {
		ProductDTO pdto = new ProductDTO();
		ProductDAO pdao = new ProductDAO();
		WarehouseDTO wdto = new WarehouseDTO();
		WarehouseDAO wdao = new WarehouseDAO();
		BuySellDAO  bsdao = new BuySellDAO();
		BuySellDAO  bsdto = new BuySellDAO();

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
					bsdao.selectBuyList();
				} else if (menu == 2) {
					System.out.println("판매자정보.");
					bsdao.selectSellList();
				} else if (menu == 3) {
					System.out.println("정보 수정 및 삭제");
					System.out.println("==============================================================================" + "\n");
					System.out.println("판매자정보를 수정 및 삭제 하시려면 1을 입력하시고, 구매자 정보를 수정및 삭제하시려면 2를 입력하세요.");
					int psnum = Integer.parseInt(sc.next());
					if(psnum==1) {
						System.out.println("수정 : 1 , 삭제 : 2");
						System.out.println(": ");					//추가(10.12)
						int psnum1 = sc.nextInt();sc.nextLine();	//추가(10.12)
						if (psnum1 == 1) {                          //추가에 의한 수정psnum1(10.12)
							BuySellDTO dto = new BuySellDTO();
							BuySellDAO dao = new BuySellDAO();
							System.out.println("========== 수 정 ==========");
							System.out.println("수정할 구매자의 회사명을 입력하세요.");
							sc.nextLine();
							String cp_name = sc.nextLine();
							dto.setCp_name(cp_name);
							System.out.println("수정할 구매자의 지역을 입력하세요.");
							String address = sc.nextLine();
							dto.setAddress(address);
							System.out.println("수정할 구매자의 전화번호를 입력하세요.");
							String ph = sc.nextLine();
							dto.setPhone(ph);
							System.out.println("회사 대표명을 입력하세요.");
							String ceo = sc.nextLine();
							dto.setCeo(ceo);
							dao.updateSellInfo(dto);//수정?
						}else {
							BuySellDTO dto = new BuySellDTO();
							BuySellDAO dao = new BuySellDAO();
							System.out.println("삭제할 구매자의 CEO를 입력하세요.");  //판매자 -> 구매자(10.12)
							String ceo = sc.next();
							dto.getSellers();//수정?
						}
					}else {
						System.out.println("수정 : 1 , 삭제 : 2");
						System.out.println(": ");					//추가(10.12)
						int psnum2 = sc.nextInt();sc.nextLine();	//추가(10.12)
						if (psnum2 == 1) {                          //추가에 의한 수정psnum2(10.12)
								BuySellDTO dto = new BuySellDTO();
								BuySellDAO dao = new BuySellDAO();
								System.out.println("========== 수 정 ==========");
								System.out.println("수정할 판매자의 회사명을 입력하세요.");
								sc.nextLine();
								String cp_name = sc.nextLine();
								dto.setCp_name(cp_name);
								System.out.println("수정할 판매자의 지역을 입력하세요.");
								String address = sc.nextLine();
								dto.setAddress(address);
								System.out.println("수정할 판매자의 전화번호를 입력하세요.");
								String ph = sc.nextLine();
								dto.setPhone(ph);
								System.out.println("회사 대표명을 입력하세요.");
								String ceo = sc.nextLine();
								dto.setCeo(ceo);
								dao.updateSellInfo(dto);//수정?
						}else {
							BuySellDTO dto = new BuySellDTO();
							BuySellDAO dao = new BuySellDAO();
							System.out.println("삭제할 판매자의 CEO를 입력하세요.");
							String ceo = sc.next();
							dto.getSellers();//수정?
						}
					}
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
						System.out.println("상품번호를 입력하세요");
						sc.nextLine();
						String p_num = sc.nextLine();
						pdto.setP_num(p_num);
						System.out.println("상품코드을 입력하세요");
						String i_code = sc.nextLine();
						pdto.setI_code(i_code);
						System.out.println("상품명을 입력하세요");
						String i_name = sc.nextLine();
						pdto.setI_name(i_name);
						System.out.println("수량을 입력하세요");
						int quan = sc.nextInt();
						pdto.setQuan(quan);
						System.out.println("입고할 가격(단가)를 입력하세요");
						int p_price = sc.nextInt();
						pdto.setP_price(p_price);
						System.out.println("총 가격은 "+ quan*p_price + "입니다.");
						pdao.insertProductInfo(pdto);
					} else if (menu == 2) {
						System.out.println("========== 출고 ==========");
						System.out.println("상품번호를 입력하세요");
						sc.nextLine();
						String p_num = sc.nextLine();
						pdto.setP_num(p_num);
						System.out.println("상품코드을 입력하세요");
						String i_code = sc.nextLine();
						pdto.setI_code(i_code);
						System.out.println("상품명을 입력하세요");
						String i_name = sc.nextLine();
						pdto.setI_name(i_name);
						System.out.println("수량을 입력하세요");
						int quan = sc.nextInt();
						pdto.setQuan(quan);
						System.out.println("입고할 가격(단가)를 입력하세요");
						int p_price = sc.nextInt();
						pdto.setP_price(p_price);
						System.out.println("총 가격은 "+ quan*p_price + "입니다.");
						pdao.UpdateProductInfo(pdto);
					} else if (menu == 3) {
						System.out.println("========== 조회 ==========");
					ProductDAO pit = new ProductDAO();
				     	pit.selectProioList();
					} else if (menu == 4) {
						System.out.println("========== 삭제 ==========");
						System.out.println("삭제할 상품명을 입력하세요.");
						sc.nextLine();
						String i_name = sc.nextLine();
						pdto.setI_name(i_name);
						pdao.DeleteProductInfo(pdto);
					} else {
						System.out.println("상위 메뉴로 갑니다.");
						continue;
					}
			} else if (x == 3) {
				System.out.println("1. 창고현황 ||2. 상위메뉴");
				System.out.println(": ");
				int menu = Integer.parseInt(sc.next());
				if (menu == 1) {
					System.out.println("======== 창고 현황 ========");
					WarehouseDAO viewarewdao = new WarehouseDAO();
					viewarewdao.selectWareHouseList();
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
