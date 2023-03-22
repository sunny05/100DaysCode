package coding.leetCode;

import java.util.concurrent.CountDownLatch;

public class EqualString {
	public static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String a = add(word1);
        String b = add(word2);
  
        return a.equals(b);
  }
  static String add(String[]word){
      String sum="";
      for(int i=0;i<word.length;i++){
          sum=sum+word[i];
      }
      return sum;
   }

  public static int titleToNumber(String s) {
      s=s.toLowerCase();
      int p=0;
      for(char c:s.toCharArray()){
          p*=26;
          p+=(c-'a')+1;
      }
      return p;
  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] word1={"a", "cb"};
		String[] word2={"a", "cb"};
		System.out.print(arrayStringsAreEqual(word1,word2));
		System.out.println("=============================");
		String columnTitle = "AA";
		System.out.println(titleToNumber(columnTitle));
	}

}
