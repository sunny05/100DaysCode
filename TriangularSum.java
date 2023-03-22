package coding.leetCode;

public class TriangularSum {
	public static int triangularSum(int[] nums) {
        int n = nums.length;
        if(n == 1) {
        	return nums[0];
        }
        	
        int[] arr = new int[n-1];
        for(int i=0; i<n-1; i++) {
        	arr[i] = (nums[i] + nums[i+1]) % 10;
        }
            
        return triangularSum(arr);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= { 1,2,3,4,5};
		System.out.print(triangularSum(nums));
	}

}
