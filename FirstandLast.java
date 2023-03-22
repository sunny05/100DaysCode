package coding.leetCode;

public class FirstandLast {
	public static int[] searchRange(int[] nums, int target) {
        int fs = search(nums, target);
        int lst = search(nums, target + 1) - 1;
        if(fs > lst)
            return new int[]{-1, -1};
        return new int[]{fs, lst};
    }
    private static int search(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        while(lo <= hi){
            int mid = lo + (hi - lo) / 2;
            if(target > nums[mid]) lo = mid + 1;
            else hi = mid - 1;
        }
        return lo;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {5,7,7,8,8,10 };
		int target=8;
		int[] nums1=searchRange(nums, target);
		for(int i=0; i<nums1.length-1;i++)
		  System.out.print(nums1[i]+" ");
		

	}

}
