package coding.leetCode;

import java.util.HashMap;
import java.util.Map;

public class HashMapIntRoman {
	 private static int[] factors = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	 
	 private static Map<Integer, String> map = new HashMap();
	 
	    public static String intToRoman(int num) {
	        map.put(1000, "M");
	        map.put(500, "D");
	        map.put(100, "C");
	        map.put(50, "L");
	        map.put(10, "X");
	        map.put(5, "V");
	        map.put(1, "I");
	        map.put(4, "IV");
	        map.put(9, "IX");
	        map.put(40, "XL");
	        map.put(90, "XC");
	        map.put(400, "CD");
	        map.put(900, "CM");
	        
	        StringBuilder sb = new StringBuilder();
	        
	        while(num != 0){
	            for (int f : factors){
	                if(num / f == 0){
	                    continue;
	                }else {
	                    for (int i = 0; i < num/f; i++)
	                        sb.append(map.get(f));
	                    	num %= f;
	                    // break;
	                }
	            }
	        }
	        return sb.toString();
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=50;
		
		System.out.println(intToRoman(num));

	}

}
