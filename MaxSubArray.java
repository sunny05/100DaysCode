package coding.leetCode;

public class MaxSubArray {
	public static int maxSubArray(int[] nums) {
        int result= nums[0];
		int sum= 0;
		
		for(int i=0;i <nums.length;i++) {
			 if(sum <= 0) {
				 sum=0;
			 }
			 sum =sum + nums[i];
			// System.out.print("Num of ith "+nums[i]+ " Sum :"+sum +" ");
			 result= Math.max(result, sum);
			// System.out.println("Result: "+result+ " ");
		}
			
		return result;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub   
		//-2,1,-3,4,-1,2,1,-5,4
		int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));

	}

}
