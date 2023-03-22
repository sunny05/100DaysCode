package coding.leetCode;

public class ReverseWord {
	 public static String reverseWords(String s) {
	        String str1="";
	        String str[] = s.split(" ");
	        for(int i=str.length-1;i>=1;i--){
	            String st="";
	            if(!str[i].equals(st))
	                str1=str1+" "+str[i];
	        }
	        if(!str[0].equals(""))
	            str1=str1+" "+str[0];
	        return str1.substring(1,str1.length());
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="They are acting like a dog";
		System.out.println(reverseWords(str));
		//================================
		System.out.println("=====================");
		 Test3 t=new Test3();
	      t.fun();
	      System.out.print(Test3.a+Test3.b);
	}

}

class Test3 
{ 
    static int a = 10; 
    static int b; 
    static void fun(){ 
        b = a * 4; 
    } 
} 