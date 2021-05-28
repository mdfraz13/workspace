package com.datastructure.arrays;

public class SearchInsertPositionSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int[] nums = {1, 2, 5, 7};
		final int target = 8;
		
		System.out.println(searchInsert(nums, target));
	}
	
	public static int searchInsert(int[] nums, int target) {
		int i = 0;
		while (i < nums.length) {
			int val = nums[i];
			if (val >= target) 
			{
				return i;
			} 
			else {
				i++;
			}
		}
		
        return i;
    }

}
