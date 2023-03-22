package coding.leetCode;

public class HIndex {
	public static int hIndex(int[] citations) {
        int len = citations.length;
        int[] arr = new int[len + 1];
        for (int i = 0; i < len; i++) {
            if (citations[i] >= len)
            	arr[len]++;
            else 
            	arr[citations[i]]++;
        }
        for (int i = len; i >= 1; i--) {
            if (arr[i] >= i) 
            	return i;
            arr[i - 1] += arr[i];
        }
        return 0;
    }
	public static void main(String[] args) {
		int[] citations=  {	1,3,1};
		System.out.println(hIndex(citations));
	}
}
