package Dto;

import java.util.Date;

public class ItemDto {
	private String b_num;
	private String s_num;
	private String i_code;
	private String i_name;
	private int line;
	private int quan;
	private int price;
	private Date i_date;
	private Date o_date;
	
	public String getB_num() {
		return b_num;
	}
	public void setB_num(String b_num) {
		this.b_num = b_num;
	}
	public String getS_num() {
		return s_num;
	}
	public void setS_num(String s_num) {
		this.s_num = s_num;
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
	public int getLine() {
		return line;
	}
	public void setLine(int line) {
		this.line = line;
	}
	public int getQuan() {
		return quan;
	}
	public void setQuan(int quan) {
		this.quan = quan;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getI_date() {
		return i_date;
	}
	public void setI_date(Date i_date) {
		this.i_date = i_date;
	}
	public Date getO_date() {
		return o_date;
	}
	public void setO_date(Date o_date) {
		this.o_date = o_date;
	}
	
	@Override
	public String toString() {
		return "ItemDto [b_num=" + b_num + ", s_num=" + s_num + ", i_code=" + i_code + ", i_name=" + i_name + ", quan="
				+ quan + ", price=" + price + ", i_date=" + i_date + ", o_date=" + o_date + "]";
	}
	
	
}
