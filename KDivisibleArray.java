package coding.leetCode;

import java.util.HashSet;
import java.util.Set;

public class KDivisibleArray {
	 public static int countDistinct(int[] nums, int k, int p) {
	     
	        Set  hs = new HashSet<>();
	        for(int i=0;i<nums.length;i++){
		        int count=0;
		       // System.out.print(nums[i]); 
		        StringBuilder sb = new StringBuilder();
		      //  System.out.println("=================="); 
			        for(int j=i;j<nums.length;j++){
			             if(nums[j]%p==0){
			            	
			                count++;
			            }
			            if(count>k){
			                break;
			            }
			            sb.append(nums[j]+"_");
			           // System.out.print(nums[j]); 
			            hs.add(sb.toString());
			        }
	        }
	    return hs.size();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums= {2,3,3,2,2  };
		int k=2,p=2;
		
		System.out.println(countDistinct(nums,k,p));
		

	}

}
