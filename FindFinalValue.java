package coding.leetCode;

import java.util.ArrayList;
import java.util.List;

public class FindFinalValue {
	 public static int findFinalValue(int[] nums, int original) {
//	        List<Integer> val = new ArrayList<>();
//	        for (int i = 0; i < nums.length; i++) 
//	        	val.add(nums[i]);
//	        while (val.contains(original)) {
//		        	original *= 2;
//		        }
		 boolean[] arr = new boolean[2002];
	     for(int n: nums) {
	            arr[n] = true;
	     }
	     while(arr[original]) {
	            original *= 2;
	        }
	    return original;

	       // return original;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,3,6,1,12};
		System.out.println(findFinalValue(nums, 7));		
	}

}
