package coding.leetCode;

import java.util.Arrays;
import java.util.List;

public class ReverseVowel {
	 public static String reverseVowels(String s) {
	        int x=0;
	        int len=s.length()-1;
	        
	        List<Character> list=Arrays.asList('a','e','i','o','u','A','E','I','O','U');
	       
	        char[] arr=s.toCharArray();
	        while(x<len){
	            if(!list.contains(arr[x])){
	                x++;
	            }
	            if(!list.contains(arr[len])){
	                len--;
	            }
	            if(list.contains(arr[x]) && list.contains(arr[len])){
	                char temp=arr[x];
	                arr[x]=arr[len];
	                arr[len]=temp;
	                x++;
	                len--;
	            }
	        }
	        return new String(arr);
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="hello";
		System.out.println(reverseVowels(s));

	}

}
