package org.gemsco;

import java.util.Scanner;

import org.gemsco.LinkedList.Node;

public class AddTwoNumber {
	static ListNode head1, head2;
	static class ListNode {
        int data;
        ListNode next;
 
        ListNode(int d) {
            data = d;
            next = null;
        }
    }
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
	       
        ListNode head= new ListNode(-1);//creating a node in order to store the sum of digit in a List format 
        ListNode temp= head;//we are using temp to add node to the new List 
        
        int carry= 0;//we are storing the carry at every digit pair iteration 
        
        while(l1 != null || l2 != null || carry > 0 )//our loop terminating condtition, all the numbers will be added 
        {
            int sum= 0;//to store the sum at every digit pair iteration 
            
            if(l1 != null)//adding list one node to the local sum
            {
                sum+= l1.data;//adding to the sum 
                l1= l1.next;//moving the l1 pointer to the next node
            }
            
            if(l2 != null)
            {
                sum+= l2.data;//adding to the sum 
                l2= l2.next;//moving the l2 pointer to the next node
            }
            sum+= carry;//adding the sum inclusive carry
            carry= sum / 10;//extracting the first digit 
            ListNode node= new ListNode(sum % 10);//extracting the last digit and creating the node 
            temp.next= node;//linking the node to the list 
            
            temp= temp.next;//moving the temp 
        }
        return head.next;//reaturning the new head of the new list 
	     }
    
 
	   
	    void printList(ListNode head){
	    	while (head != null) {
	            System.out.print(head.data + " ");
	            head = head.next;
	        }
	        System.out.println("");
	     }
	    
	    public static boolean isPalindrome(int x) {
	    	int num=0,temp;
	    	temp=x;
	    	while(x>0) {
	    		num= num*10 + x%10;
	    		x  = x/10;
	    		System.out.println("Number is "+num +" X value is "+x);
	    	}
	    	System.out.println("Temp value is: "+ temp);
	    	if(num == temp) {
	    		return true;
	    	}
	    	return false;
	    }
	public static void main(String[] args) {
		AddTwoNumber list = new AddTwoNumber();
		 
        // creating first list
        list.head1 = new ListNode(7);
        list.head1.next = new ListNode(5);
        list.head1.next.next = new ListNode(9);
        list.head1.next.next.next = new ListNode(4);
        list.head1.next.next.next.next = new ListNode(6);
        System.out.print("First List is ");
        list.printList(head1);
 
        // creating second list
        list.head2 = new ListNode(8);
        list.head2.next = new ListNode(4);
        System.out.print("Second List is ");
        list.printList(head2);
 
        System.out.print("Resultant List is ");
        // add the two lists and see the result
        list.printList(addTwoNumbers(head1, head2));
        
        System.out.println("Check Enter no.Palindrome.");
        
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt();
        
        System.out.println(x+" is Palindrome - True or False? "+ isPalindrome(x));
        

	}

}
