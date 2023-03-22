package coding.leetCode;

public class TwoSum {
	public static int[] twoSum(int[] numbers, int target) {
//		int left = 0;
//        int right = numbers.length - 1;
//        while(left != right){
//            if(numbers[left] + numbers[right] > target){
//                right--;
//            } else if(numbers[left] + numbers[right] < target){
//                left++;
//            } else{
//                return new int[] {left + 1, right + 1};
//            }
//        }
//        return null;
		    int res[] = new int[2];
		    int i=0,j=numbers.length-1;
		    
		    while(i<j){
		        int sum = numbers[i]+numbers[j];
		        if(sum==target){
		            res[0]=i+1;
		            res[1]=j+1;
		            return res;
		        }
		        else if(sum<target)
		            i++;
		        else
		            j--;
		    }
		    return res;
	    
	}
		public static void main(String[] args) {
		// TODO Auto-generated method stub   
			int[] numbers=  {2,7,11,15};
			int[] result= twoSum(numbers,13);
			System.out.println(result);
			for(int i=0;i<result.length;i++)
				System.out.print(result[i]);
			
			
			for(int i:result)
				System.out.print(i);
	}

}
