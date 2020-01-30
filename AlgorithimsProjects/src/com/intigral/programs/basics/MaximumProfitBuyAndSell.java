package com.intigral.programs.basics;

public class MaximumProfitBuyAndSell {

	public static void main(String[] args) {
		int[] stock = {8,2,3,4,0,5,2,10};
		int maxProfit = 0;
		int buy = 0;
		int sell = 0;
		int currMin = 0;
		int currProfit = 0;
		int i = 0;
		while(i < stock.length){
			if(stock[i] < stock[currMin]){
				currMin = i;
				System.out.println("currMin ="+currMin);
			}
			currProfit = stock[i] - stock[currMin];
			if(currProfit > maxProfit){
				buy = currMin;
				maxProfit = currProfit;
				sell = i;
				System.out.println("buy ="+buy+", sell="+sell+",maxProfit="+maxProfit);
			}
			i++;
		}
		System.out.println("Buty at "+buy+" = "+stock[buy]);
		System.out.println("Sell at "+sell+" = "+ stock[sell]);
	}
}
