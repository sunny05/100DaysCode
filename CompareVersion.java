package coding.leetCode;

public class CompareVersion {
	 public static int compareVersion(String version1, String version2) {
	        String S1[] = version1.split("\\.");
	        String S2[] = version2.split("\\.");
	        int n = Math.max(S1.length, S2.length);
	        for(int i = 0; i < n; i++) {
	            int l1 = i < S1.length ? Integer.parseInt(S1[i]) : 0;
	            int l2 = i < S2.length ? Integer.parseInt(S2[i]) : 0;
	            if(l1 < l2) 
	            	return -1;
	            else if(l1 > l2) 
	            	return 1;
	        }
	        return 0;
	    }
	 /* 
	  * public int compareVersion(String v1, String v2) {
        for(int i = 0, j = 0; i < v1.length() || j < v2.length(); i++,j++) {
            int num1 = 0, num2 = 0;
            while(i < v1.length() && v1.charAt(i) != '.') {
                num1 = (num1 * 10) + v1.charAt(i) - '0';
                i++;
            }
            while(j < v2.length() && v2.charAt(j) != '.') {
                num2 = (num2 * 10) + v2.charAt(j) - '0';
                j++;
            }
            if(num1 < num2) return -1;
            else if(num1 > num2) return 1;
        }
        return 0;
    }
	  * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ver1="1.01.0";
		String ver2="1.01";
		
		System.out.println(compareVersion(ver1,ver2));

	}

}
