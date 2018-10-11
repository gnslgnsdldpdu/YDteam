package Dto;

public class ProioDTO {
	private String P_num;   // 상품번호
	private String Line;	// 라인릴리즈
	private String I_code;	// 상품코드
	private String I_name;	// 상품명
	private int Quan;	//	수량
	private int P_price;	//	입고가
	private int Price;	//	총가격
	
	private String Io_date;	//  입출고날짜	
	public String getP_num() {
		return P_num;
	}
	public void setP_num(String p_num) {
		P_num = p_num;
	}
	public String getLine() {
		return Line;
	}
	public void setLine(String line) {
		Line = line;
	}
	public String getI_code() {
		return I_code;
	}
	public void setI_code(String i_code) {
		I_code = i_code;
	}
	public String getI_name() {
		return I_name;
	}
	public void setI_name(String i_name) {
		I_name = i_name;
	}
	public int getQuan() {
		return Quan;
	}
	public void setQuan(int quan) {
		Quan = quan;
	}
	public int getP_price() {
		return P_price;
	}
	public void setP_price(int p_price) {
		P_price = p_price;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getIo_date() {
		return Io_date;
	}
	public void setIo_date(String io_date) {
		Io_date = io_date;
	}
	@Override
	public String toString() {
		return "상품번호:" + P_num + ", 라인릴리즈:" + Line + ", 상품코드:" + I_code + ", 상품명:" + I_name + ", 수량:"
				+ Quan + ", 입고가:" + P_price + ", 총가격:" + Price + ", 입출고날짜:" + Io_date ;
	}
	
	
}
