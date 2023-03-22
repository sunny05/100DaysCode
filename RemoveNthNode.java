package coding.leetCode;

public class RemoveNthNode {
	 public static ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode first = head;
	        ListNode second = head;
	        int num = n;
	        while(num > 0){
	            second = second.next;
	            num--;
	        }
	       if(second==null){
	           ListNode temp = first;
	           temp = temp.next;
	           return temp;
	       }
	        while(second.next!=null){
	              second = second.next;
	              first = first.next;
	            
	        }
	        
	        first.next = first.next.next;
	        return head;
	    }
	 public static ListNode createLinkedList(){
		    ListNode n1= new ListNode(1);
		    ListNode n2= new ListNode(2);
		    ListNode n3= new ListNode(3);
		    ListNode n4= new ListNode(4);
		    ListNode n5= new ListNode(5);
		    n1.next=n2;
		    //System.out.println("n1 "+n1+ " data "+ n1.data+" next "+n1.next);
		    n2.next=n3;
		    //System.out.println("n2 "+n2+ " data "+ n2.data+" next "+n2.next);
		    n3.next=n4;
		    //System.out.println("n3 "+n3+ " data "+ n3.data+" next "+n3.next);
		    //System.out.println("n4 "+n4+ " data "+ n4.data+" next "+n4.next);
		    return n1;

		    }
	 public static void print(ListNode head){

	      ListNode temp = head;
	      while(head!= null){
	        System.out.print(temp.val+" ");
	        temp=temp.next;
	      }
	      System.out.println();

	      //System.out.println("Print"+head);
	      //System.out.println(head.data);
	      //System.out.println(head.next);
	      //System.out.println(head.next.data);
	      //System.out.println(head.next.next.data);
	  }

	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   ListNode head = createLinkedList();
	     // increment(head);
	     // print(head);
	      System.out.println("===================");
	      ListNode head1= removeNthFromEnd(head,2);
	      print(head1);

	}

}
class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { 
	    	 this.val = val;
	      }
	     ListNode(int val, ListNode next) {
	    	 this.val = val; this.next = next; 
	     }
	 }