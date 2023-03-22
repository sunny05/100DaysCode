package coding.leetCode;

public class SortColors {
	
	 public static void sortColor(int[] nums) {
	  // 2-pass
		 	int zeros = 0;
	        int ones = 0;
	        int twos = 0;
	        
			for(int i = 0; i < nums.length; i++){
	            if(nums[i] == 0)
	                zeros++;
	            else if(nums[i] == 1)
	                ones++;
	            else if(nums[i] == 2)
	                twos++;
	        }
	        
			for(int i = 0; i < nums.length; i++ ){
				if(zeros != 0){
	                nums[i] = 0;
	                zeros--;
	            	System.out.print( nums[i] +" ");
	            }
				else if(ones != 0){
	                nums[i] = 1;
	                ones--;
	            	System.out.print( nums[i] +" ");
	            }
			    else{
	                nums[i] = 2;
	                twos--;
	            	System.out.print( nums[i] +" ");
	            }
				//System.out.print( nums[i] +" ");
	        }
	}
	        
	  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums=   {2,0,2,1,1,0};
		sortColor( nums);
		
	}

}
