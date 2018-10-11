package Dto;

public class ProductDTO {


	private String p_num;
	private int line;
	private String i_code;
	private String i_name;
	private int quan;
	private int p_price;
	private int price;
	private String re_date;
	public String getP_num() {
		return p_num;
	}
	public void setP_num(String p_num) {
		this.p_num = p_num;
	}
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public String getI_code() {
		return i_code;
	}
	public void setI_code(String i_code) {
		this.i_code = i_code;
	}
	public String getI_name() {
		return i_name;
	}
	public void setI_name(String i_name) {
		this.i_name = i_name;
	}
	public int getQuan() {
		return quan;
	}
	public void setQuan(int quan) {
		this.quan = quan;
	}
	public int getP_price() {
		return p_price;
	}
	public void setP_price(int p_price) {
		this.p_price = p_price;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getRe_date() {
		return re_date;
	}
	public void setRe_date(String re_date) {
		this.re_date = re_date;
	}
	@Override
	public String toString() {
		return "ProductDTO [p_num=" + p_num + ", line=" + line + ", i_code=" + i_code + ", i_name=" + i_name + ", quan="
				+ quan + ", p_price=" + p_price + ", price=" + price + ", re_date=" + re_date + "]";
	}
	
	
	
	
	
	
	
	
	
	
}