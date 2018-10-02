package Dto;

public class ProductDTO {


	private String buy_num;
	private String sell_num;
	private String line;
	private String i_code;
	private String i_name;
	private int quan;
	private int in_price;
	private int out_price;
	private int price;
	private String re_date;
	
	public String getBuy_num() {
		return buy_num;
	}
	public void setBuy_num(String buy_num) {
		this.buy_num = buy_num;
	}
	public String getSell_num() {
		return sell_num;
	}
	public void setSell_num(String sell_num) {
		this.sell_num = sell_num;
	}
	public String getLine() {
		return line;
	}
	public void setLine(String line) {
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
	public int getIn_price() {
		return in_price;
	}
	public void setIn_price(int in_price) {
		this.in_price = in_price;
	}
	public int getOut_price() {
		return out_price;
	}
	public void setOut_price(int out_price) {
		this.out_price = out_price;
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
		return "ProductDTO [buy_num=" + buy_num + ", sell_num=" + sell_num + ", line=" + line + ", i_code=" + i_code
				+ ", i_name=" + i_name + ", quan=" + quan + ", in_price=" + in_price + ", out_price=" + out_price
				+ ", price=" + price + ", re_date=" + re_date + "]";
	}
	
	
	
	
	
}