package coding.leetCode;

public class TwoscomplementReverse {
	public static int reverseBits(int n) {
	       int ans=0;
	        for(int i=0;i<32;i++){
	            int rb=n&1;
	            n=n>>1;
	            ans=ans|rb<<31-i;
	        }
	        return ans;
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 000011100;
		System.out.println(reverseBits(n));

	}

}
