package coding.leetCode;

public class MaxWealth {
	public static int maximumWealth(int[][] accounts) {
        int max=-1;
        int sum=0;
        for(int[] i:accounts){
            sum=0;
            for(int j:i){
                sum=sum+j;
            }
            if(sum>max){
                max=sum;
            }
           
        }
         return max;
    }
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] accounts={ { 1, 2,3 }, { 3, 3,1 } }; 
		System.out.println(maximumWealth( accounts));

	}

}
