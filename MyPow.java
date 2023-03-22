package coding.leetCode;

public class MyPow {
	public static double myPow(double x, int y) {
	       double temp;
	        if( y == 0)
	            return 1;
	        temp = myPow(x, y/2); 
	          
	        if (y%2 == 0)
	            return temp*temp;
	        else{
	            if(y > 0)
	                return x * temp * temp;
	            else
	                return (temp * temp) / x;
	        }
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=  2.10000;
		int n = 3;
		
		System.out.println(myPow(x,n));
	}

}
