package coding.leetCode;

import java.util.HashMap;

public class Isomorphic {
	 public static boolean isIsomorphic(String s, String t) {
//	        HashMap<Character, Character> map = new HashMap<>();
//	        char k, v;
//	        for(int i=0; i<s.length(); i++) {
//	            k = s.charAt(i);
//	            v = t.charAt(i);
//	            if(map.containsKey(k)) {
//	                if(map.get(k) != v)
//	                    return false;
//	            } else if(map.containsValue(v))
//	                return false;
//	            else
//	                map.put(k, v);
//	        }
//	        return true;
		 	int arr1[] = new int[256];
			int arr2[] = new int[256];

			for(int index = 0; index < s.length(); ++index) {
				char ch1 = s.charAt(index);
				char ch2 = t.charAt(index);
				if(arr2[ch2] == 0 && arr1[ch1] == 0) {
					arr1[ch1] = ch2;
					arr2[ch2] = ch1;
				}
				else {
					if(arr2[ch2] != ch1 || arr1[ch1] != ch2) {
						return false;
					}
				}
			}
			return true;
			
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "egg", t = "add";
		
		System.out.print(isIsomorphic(s,t));
	}

}
