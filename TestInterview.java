package org.gemsco;

import java.util.Iterator;
import java.util.LinkedHashSet;

//assue the array it has sequ. of no. from n
// out of the seq. one number be repeated
// 1,2,3,4,5  ...n=10    n-1=9   find  missing no.

// missing no. , no any duplicate no.

/// sequence of order that need not to be sorted order  set: unique ele not in order.
// find the missing no which is 10 o/p
/*
 * n=10
arr= {1,5,2,6,7,3,8,4,9}  
1,
count= n no.
n no put in insertion order  linkedhashset
check total number and find missing one during check it will compare the given one and n-1 if n-1 
matched with existing then return true if not then false and print that value 
arr -1;
sorting
i= 0;  i<n;i++;

first will make in a seq.
then after will get the missing one 
arr[s] = arr[i]<arr[i+1];

again iteration arr[s] for check the any element which will be missing
first check least no. and max no.
if least is not then ie missing
if max is not then 
  arr ++;

element 
 */
public class TestInterview {
	
	public static void main(String args[]) {
		
		LinkedHashSet<Integer> set= new LinkedHashSet<Integer>()	;	
	/*	
		set.add(1);
		set.add(5);
		set.add(2);
		set.add(6);
		set.add(7);
		set.add(3);
		set.add(8);
		set.add(4);
		set.add(1);
		set.add(9);*/
		
		int arr[]= {1,5,2,6,7,3,8,4,9};
		int i,s;
		for(i= 0; i<arr.length;i++) {
			
			//sorting require here 
			//arr[s] = arr[i] 
			System.out.println(arr[i])	;	
			// output in a sorted form of element 
		}
		
		// out put will come in order
			
		
	}
	

}
