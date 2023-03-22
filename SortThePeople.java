package coding.leetCode;

import java.util.*;

public class SortThePeople {
	public static String[] sortPeople(String[] names, int[] heights) {
        int size = heights.length;
        System.out.println("Size of height "+ size);
        boolean swapped = false;
        for (int i = 0; i < size; i++) {
            for (int j = 1+1; j < size ; j++) {
                if (heights[j] > heights[j-1]) {
                    int temp1 = heights[j];
                    heights[j] = heights[j-1];
                    heights[j-1] = temp1;
                    
                    String temp2 = names[j];
                    names[j] = names[j-1];
                    names[j-1] = temp2;

                    swapped = true;
                }
            }if (!swapped)
                break;
        }
        return names;
	}    
	public List<Integer> getRow(int rowIndex) {
	    List<Integer> res = new ArrayList<Integer>();
	    for(int i = 0;i<rowIndex+1;i++) {
	    		res.add(1);
	    		for(int j=i-1;j>0;j--) {
	    			res.set(j, res.get(j-1)+res.get(j));
	    		}
	    }
	    return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names={"Mary","John","John"};
		int[] heights= {180,165,170};
		String[] sortName= sortPeople(names,heights);
		
		for(int i=0;i<sortName.length;i++) {
			System.out.print(sortName[i]+" ");
		}

		System.out.println("====================");
		int rowIndex=3;
		
	}

}
