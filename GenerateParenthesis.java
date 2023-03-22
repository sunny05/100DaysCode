package coding.leetCode;

import java.util.*;

public class GenerateParenthesis {
//	public static List<String> generateParenthesis(int n){
//       // List<List<String>> lists = new ArrayList<>();
//        List<List<String>> list=new ArrayList<>();
//        list.add(Collections.singletonList(null));
//       // lists.add(Collections.singletonList(""));
//        
//        for (int i = 1; i <= n; ++i){
//            final List<String> listF = new ArrayList<>();
//            
//            for (int j = 0; j < i; ++j){
//                for (final String first : list.get(j)) {
//                    for (final String second : list.get(i - 1 - j)){
//                        listF.add("(" + first + ")" + second);
//                    }
//                }
//            }
//            list.add(listF);
//        }
//        
//        return list.get(list.size()-1 );
//    }
	//OR
	 public static List<String> generateParenthesis(int n) {
	        List<String> ans = new ArrayList<String>();
	        StringBuilder sb = new StringBuilder();
	        sb.append("(");
	        valid(n, 1,0,sb,ans);
	        return ans;
	    }
	 public static void valid(int n,int open, int close, StringBuilder sb, List<String> res) {
		 if(sb.length() ==n*2) {
			 res.add(sb.toString());
			 return;
		 }
			
		 if(open<n){
	            sb.append("(");
	            valid(n,open+1,close,sb,res);
	            sb.deleteCharAt(sb.length()-1);
	        }if(close<open){
	             sb.append(")");
	            valid(n,open,close+1,sb ,res);
	            sb.deleteCharAt(sb.length()-1);
	        }
		
	}
	  public static boolean hasCycle(ListNode head) {
	        ListNode slow = head;
	        ListNode fast = head;
	        if(head == null){
	            return false;
	        }
	        while(fast.next!=null && fast.next.next!=null){
	            slow = slow.next;
	            fast = fast.next.next;
	            if(slow == fast ){
	                return true;
	            }
	        }
	        return false;
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=3;
		List<String> resList=generateParenthesis(i) ; 
		
		System.out.println(resList);
	
	}

}

