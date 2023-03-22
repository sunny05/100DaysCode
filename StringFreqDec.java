package coding.leetCode;

import java.util.HashMap;
import java.util.Map;

public class StringFreqDec {
	 public static String frequencySort(String s) {
	        int len=s.length();
	        StringBuilder sb = new StringBuilder();
			Map<Character, Integer> hm = new HashMap();
	         /* 
	           Traverse a string, 
	           store each character and it's count in a map
	          */
	          for(int i = 0; i < len; i++) {
	               char ch = s.charAt(i);
	               hm.put(ch, hm.getOrDefault(ch, 0) + 1);
	          }
	        
	           /*
	             Sort this map by frequency.     
	            */
	 
	          hm.entrySet().stream()
	                      .sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
	                     .forEach(record -> {
	                        Character key = record.getKey();
	                        int value = record.getValue();
	                        for(int i = 0; i < value; i++) {
	                              sb.append(key);
	                         }
	            });
	 
	            return sb.toString();
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "seed";
		String str2= frequencySort(str);
		System.out.println(str2);

	}

}
