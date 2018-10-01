package Dto;

public class ItemDto {
	private String BuyIt;
	private String SellIt;
	private String BuyUsr;
	private String SellUsr;
	

	public String getBuyIt() {
		return BuyIt;
	}
	public void setBuyIt(String buyIt) {
		BuyIt = buyIt;
	}
	public String getSellIt() {
		return SellIt;
	}
	public void setSellIt(String sellIt) {
		SellIt = sellIt;
	}
	public String getBuyUsr() {
		return BuyUsr;
	}
	public void setBuyUsr(String buyUsr) {
		BuyUsr = buyUsr;
	}
	public String getSellUsr() {
		return SellUsr;
	}
	public void setSellUsr(String sellUsr) {
		SellUsr = sellUsr;
	}
	
	@Override
	public String toString() {
		return "ItemDto [BuyIt=" + BuyIt + ", SellIt=" + SellIt + ", BuyUsr=" + BuyUsr + ", SellUsr=" + SellUsr + "]";
	}
	
}
