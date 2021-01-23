package com.java8.examples.lamda;

public class TradeIdListInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
class Trade{
	
	private TradeKey key;
	private int price;
	
	public Trade(TradeKey key, int price) {
		super();
		this.key = key;
		this.price = price;
	}

}
class TradeKey{
	
	private int id;
	private String tradeType;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTradeType() {
		return tradeType;
	}
	public void setTradeType(String tradeType) {
		this.tradeType = tradeType;
	}
}