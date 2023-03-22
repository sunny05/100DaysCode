package coding.leetCode;

public class BuildArrayPermutation {
	   public static int[] buildArray(int[] nums) {
		   int len=nums.length;
	        int[] ans = new int[len];
	        
	        for(int i=0; i<len; i++) {
	            ans[i] = nums[nums[i]];
	        }
	        
	        return ans;
	    }
	   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {0,2,1,5,3,4};
		int[] numsRes=buildArray(nums);
		//System.out.println(numsRes);
		
		for(int i=0; i<numsRes.length; i++) {
			System.out.print(numsRes[i]+" ");
        }
        

	}

}
