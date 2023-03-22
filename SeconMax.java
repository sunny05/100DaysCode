package coding.leetCode;

public class SeconMax {
	public static int secondMax(int[] num) {
		int res=0;
		int len=num.length;
		//if(len == 2)
		int temp ;
			
		for(int i=0;i<len-1;i++) {
			// for sorting in asnending order
			if(num[i] > num[i+1])
			    temp=num[i+1];
			else if(num[i] < num[i+1])
				temp=num[i];
			else
				temp=num[i];
				
		}
		
		//temp -1, 0 , 3, 5 	 
		
		int len1Res= num.length;
		res =len1Res - 2;
		
		//int num1[]= temp; 
		// for(int j=len-1; j<=len-1;)
		//     nums[j];
				
		
		return res;
	}
	
	public static int getSecondLargest(int[] a, int total){  
		int temp;  
		for (int i = 0; i < total; i++)   
		        {  
			      System.out.println(a[i]+" ................");
		            for (int j = i + 1; j < total; j++)   
		            {  
		            	//System.out.print(a[j]+"====");
		                if (a[i] > a[j])   
		                {  
		                    temp = a[i];  
		                    a[i] = a[j];  
		                    a[j] = temp;  
		                }  
		                System.out.print(a[j]+"====");
		            }  
		        }  
		       return a[total-2];  
		}  
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num= { 0,-1,3,5		
		};
		
		System.out.print(getSecondLargest(num,4));
		
	}

}
