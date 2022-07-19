package org.gemsco;

import org.gemsco.LinkedList.Node;

public class ReverseArray {
	static Node head;  
	  
    /* Linked list Node*/
    static class Node{
        int data;
        Node next;
        Node(int d) {data = d; next = null; }
    }
 
    Node reverse(Node head){
    	Node curr = head;
    	Node prev=null;
    	Node next=null;
        	while (curr != null) {
             next =curr.next;
             curr.next=prev;
             prev=curr;
             curr=next;
         }
        	head=prev;
        	return head;
     }
    
    
     void printList(Node node)
     {
         while (node != null) {
             System.out.print(node.data + " ");
             node = node.next;
         }
     }
 
     /* Driver program to test above functions */
    public static void main(String args[])
    {
        ReverseArray llist = new ReverseArray();
        llist.head =new Node(10);
        llist.head.next =new Node(11);
        llist.head.next.next =new Node(21);
        llist.head.next.next.next =new Node(11);
        llist.head.next.next.next.next =new Node(1);
        
        System.out.println("List of Array");
        llist.printList(head);
         
       // llist.removeDuplicates();
       head= llist.reverse(head);
         
        System.out.println("List after reverse elemet");
       llist.printList(head);
    }


}
