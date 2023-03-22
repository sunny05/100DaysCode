package coding.leetCode;

import java.util.HashMap;

public class ConsistentString {
	public static int countConsistentStrings(String allowed, String[] words) {
		int len=allowed.length();
		int res=0;
		HashMap<Character, Integer> hm=new HashMap<>();
		
			for(int i=0;i<len;i++) {
				hm.put(allowed.charAt(i) , 1);
			}
			
		for(String word:words) {
			res ++;
			
			for(int i=0;i<word.length();i++) {
				char match=word.charAt(i);
				if(hm.containsKey(match)==false) {
					res --;
					break;
				}
			}
		}
		
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       String words[]= {"ad","bd","aaab","baa","badab"};
       String str="ab";
       System.out.print(countConsistentStrings(str,words));
       
	}

}
