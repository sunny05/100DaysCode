package coding.leetCode;

import java.util.HashMap;
import java.util.Map;

public class ContainsTargetCheck {
	public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hmap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hmap.containsKey(nums[i]) && Math.abs(i - hmap.get(nums[i])) <= k) {
                return true;
            } else {
                hmap.put(nums[i], i);
            }
        }
        return false;
    }
	public static void func(int n)
	{
	    int sum=0;
	    for(int i=2;i<n*n;i+=2)
	        sum+=i;
	    System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums =  { 1,2,3,1};
		func(13);	
	  System.out.println(containsNearbyDuplicate(nums, 4));			

	}

}
