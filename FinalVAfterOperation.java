package coding.leetCode;

public class FinalVAfterOperation {
	 public static int finalValueAfterOperations(String[] operations) {
         int x = 0;
        for(String op : operations)
            x = op.charAt(1) == '+' ? ++x : --x;
        return x;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] operations= {"--X","X++","X++" };
        System.out.println(finalValueAfterOperations(operations));		 
	}

}
