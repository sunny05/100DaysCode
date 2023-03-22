package coding.leetCode;

public class singToInt {
	public static int myAtoi(String s) {
		int len=s.length();
		  if(len == 0)
	            return 0;
	        int i = 0;
	        int sign = 1;
	      
	        while(i < len && s.charAt(i) == ' ')
	            i++; 
	        if(i >= len) 
	        	return 0;
	        if(s.charAt(i) == '+' || s.charAt(i) == '-'){ 
	            sign = s.charAt(i) == '+' ? 1 : -1;
	            i++;
	        }
	        long res = 0;
	        while(i < len && Character.isDigit(s.charAt(i))){
	            res = res * 10 + s.charAt(i) - '0';
	            if(res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) 
	                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE; 
	            i++;
	        }
	        return (int) (res*sign);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="42";
		int ans= myAtoi(str);
		System.out.println(ans);

	}

}
