package org.gemsco;

public class ArrangingCoins {
	public static int arrangeCoins(int n) {
        long low = 1, high = n;
        
        while(low <= high){
            long mid = low + (high-low)/2;
            long sum  = mid*(mid+1)/2;
            
            if(sum == n){
            	System.out.println("Sum == n "+sum);
                return (int)mid;
            } else if(sum < n){
            	System.out.println("Sum < n "+sum);
                low = mid+1;
            } else {
            	System.out.println(" Sum  "+sum);
                high = mid-1;
            }
        }
        
        return (int)high;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		System.out.println(arrangeCoins(n));
		
//		byte b=50;
//		b=(byte) (b*50);
//		System.out.println(b);
//		double a=6/4;
//		int b=6/4;
//		 double c = a + b;
//	    System.out.println(a+"a is"+c);
//		 double a = 55.5;
//	        int b = 55;
//	        a = a % 10;
//	        b = b % 10;
//	        System.out.println(a + " "  + b);
		 int x = 15;
		    if(x <= 15){
		        System.out.print("Inside if  ");
		    }else if(x == 15){
		        System.out.print("Inside else if  ");
		    }
		    System.out.println(x);
		    int var1 = 5; 
	        int var2 = 6;
	        if ((var2 = 1) == var1)
	            System.out.print(var2);
	        else 
	            System.out.print(var2 + 1);
//		else(a>20)		{
//		    System.out.print("Ninjas");
//		}

	}

}
