package com.algorithims.programs.problems;

public class DiscountPriceOfItems {

	public static void main(String[] args) {
		int[] prices = {5,1,3,4,6,2};
		
		// Discounted Price = 4,1,1,2,4,2
		
		int[] discountedPrice = new int[prices.length];
		int[] indexes = new int[prices.length];
		for(int i=0;i<prices.length;i++) {
			boolean found = false;
			int currentPrice = prices[i];
			for(int k=i+1;k<prices.length;k++) {
				if(prices[k] <= currentPrice && !found) {
					discountedPrice[i] = currentPrice - prices[k];
					found = true;
				}
			}
			if(!found) {
				discountedPrice[i] = prices[i];
				indexes[i] = i;
			}
		}
		
		int totalDiscountedPrice = 0;
		for(int x : discountedPrice) {
			totalDiscountedPrice += x;
		}
		System.out.println(totalDiscountedPrice);
		for(int x : indexes) {
			if(x!=0)
			System.out.print(x+" ");
		}
		
	}

}
