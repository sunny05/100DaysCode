package coding.leetCode;

public class ArrayPairSum {
	 public static int arrayPairSum(int[] nums) {
		 int[] arr = new int[20001];
			for (int i = 0; i < nums.length; i++) {
				arr[nums[i] + 10000]++;
			}
			int sum = 0;
			boolean odd = true;
			for (int i = 0; i < arr.length; i++) {
				while (arr[i] > 0) {
					if (odd) {
						sum += i - 10000;
					}
					odd = !odd;
					arr[i]--;
				}
			}
			return sum;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= { 1,4,3,2,5};
		System.out.println(arrayPairSum(nums));
	}

}
