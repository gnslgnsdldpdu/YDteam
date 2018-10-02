package Dto;


import java.util.Date;

public class ProductDto {


	private String c_code;
	private String p_code;
	private String p_name;
	private String std;
	private String unit;
	
	public String getC_code() {
		return c_code;
	}
	public void setC_code(String c_code) {
		this.c_code = c_code;
	}
	public String getP_code() {
		return p_code;
	}
	public void setP_code(String p_code) {
		this.p_code = p_code;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getStd() {
		return std;
	}
	public void setStd(String std) {
		this.std = std;
	}
	public String getUnit() {
		return unit;
	}
	public void setUnit(String unit) {
		this.unit = unit;
	}
	@Override
	
	public String toString() {
		return "ProductBean [c_code=" + c_code + ", p_code=" + p_code + ", p_name=" + p_name + ", std=" + std
				+ ", unit=" + unit + "]";
	}
	
	
	
}