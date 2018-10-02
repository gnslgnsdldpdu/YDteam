package Dto;

public class BuySellDto {
	private String buyer;
	private String sellers;
	private String cp_name;
	private String address;
	private String phone;
	private String ceo;

	public String getBuyer() {
		return buyer;
	}

	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}

	public String getSellers() {
		return sellers;
	}

	public void setSellers(String sellers) {
		this.sellers = sellers;
	}

	public String getCp_name() {
		return cp_name;
	}

	public void setCp_name(String cp_name) {
		this.cp_name = cp_name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCeo() {
		return ceo;
	}

	public void setCeo(String ceo) {
		this.ceo = ceo;
	}

	@Override
	public String toString() {
		return "BuySellDto [buyer=" + buyer + ", sellers=" + sellers + ", cp_name=" + cp_name + ", address=" + address
				+ ", phone=" + phone + ", ceo=" + ceo + "]";
	}

}
