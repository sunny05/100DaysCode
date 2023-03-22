package coding.leetCode;

public class SortArrayByPair {
	public static int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i = 0, j = n - 1;

        while (i <= j) {
            if (nums[i] % 2 != 0 && nums[j] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                i++;
                j--;
            } else if (nums[i] % 2 == 0 && nums[j] % 2 != 0) {
                i++;
                j--;
            } else if (nums[i] % 2 == 0 && nums[j] % 2 == 0) {
                i++;
            } else {
                j--;
            }
        }
        return nums;
	}    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=  {3,1,2,4};
		int[] nums1=sortArrayByParity(nums);
		for(int i=0;i<nums1.length;i++) {
			System.out.print(nums1[i]+" ");
		}
		

	}

}
