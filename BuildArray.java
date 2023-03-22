package coding.leetCode;

public class BuildArray {
	public static int[] buildArray(int[] nums) {
		int[] ans = new int[nums.length];
		for (int i=0;i<nums.length;i++)
		{
		ans[i]=nums[nums[i]];
		}
		return ans;
		}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,3,3,2,2 };
		int[] nums1=buildArray(nums);
		
		for(int i=0;i<nums1.length;i++)
		  System.out.print(nums1[i]);
	}

}
