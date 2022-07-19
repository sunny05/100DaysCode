package org.gemsco;

import java.util.Arrays;

public class MissingNum {

	public static int findDisappearedNumbers(int[] nums)
    {
		int n=nums.length;
        System.out.println("Number n" +n);
		/* Using Formula
		
        int sum=((n+1)*(n+2))/2;
        System.out.println("Formula result "+sum); 
        System.out.println("================iteration started for find the missing no.================ ");
        for(int i=0;i<n;i++)
        	System.out.println(sum-=nums[i]);
        return sum;  */
		
        int xor = 0;
        for (int i: nums) {
            xor = xor ^ i;
        }
         // Compute XOR of all the elements from 1 to `n+1`
        for (int i = 1; i <= nums.length + 1; i++) {
            xor = xor ^ i;
        }
 
        return xor;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,5,2,6,7,12,8,4,9,11,10}; // if repeated no then fail 
		System.out.println("Missing no. is "+findDisappearedNumbers(arr));
		
	}

	

}
