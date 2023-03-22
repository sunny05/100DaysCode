package coding.leetCode;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectClass {
	  public static int[] intersect(int[] nums1, int[] nums2) {
	        HashMap<Integer,Integer> h = new HashMap<>();
	        ArrayList<Integer> arr = new ArrayList<>();
	        for(int i=0;i<nums1.length;i++){
	            if(h.get(nums1[i])!=null) {
	                h.put(nums1[i],h.get(nums1[i])+1);
	            }
	            else h.put(nums1[i],1);
	        }
	        for(int i=0;i<nums2.length;i++){
	            if(h.get(nums2[i])!=null && h.get(nums2[i])!=0){
	                arr.add(nums2[i]);
	                h.put(nums2[i],h.get(nums2[i])-1);
	            }
	        }
	        int ans[] = new int[arr.size()];
	        for(int i=0;i<arr.size();i++){
	            ans[i]=arr.get(i);
	        }
	        return ans;
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums1=  { 1,2,2,1   };
		int[] nums2=  {2,2 };
		int[] nums3=intersect(nums1,nums2);
		for(int i=0;i<nums3.length;i++){
           System.out.print(nums3[i]+ " ");
        }
	}

}
