package coding.leetCode;

public class HammingArray {
	 public static int hammingDistance(int x, int y) {
	        String str = Integer.toBinaryString((x ^ y));
	        int count = 0;
	        for (int i = 0; i < str.length(); i++) {
	            if (str.charAt(i) == '1'){
	                count ++;
	            }
	        }
	        return count;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=3,y=2;
		
		System.out.println(hammingDistance(x,y));
	}

}
