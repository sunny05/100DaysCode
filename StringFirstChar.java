package org.gemsco;

public class StringFirstChar {
	 public static int firstUniqChar(String s) {
	        for(int i = 0; i < s.length(); i++) {  // find index wise
	            char ch = s.charAt(i);              // find 
	            System.out.println(" ch value "+ch);
	            
	            System.out.print(" Index of "+s.indexOf(ch)+ " Last Index Of " +s.lastIndexOf(ch));
					if(s.indexOf(ch) == s.lastIndexOf(ch)) {
						
	                return i;
	            }
	        }
	        
	        return -1;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s ="bdescdbsc";
		
				System.out.println(firstUniqChar(s));
				
				int a= Integer.MAX_VALUE;
				int b =Integer.MIN_VALUE;
				char ch = 'a';
				int i = 'c';
				System.out.println(" A "+ a +" B "+b +" char  "+ ch +" int of a value "+ i);
				System.out.println('a'+1);
				int a1, b1;
				a1=i;
				b1=9;
				if(a1>0) {
					System.out.println("print A1 "+a1);
				}if(b1<0 ){
					System.out.println("print b1 is not greater ");
					}
				else {
				System.out.println("print A1 is not greater ");
				}
				
				int a2=50;
			    int b2=Integer.MIN_VALUE;
			    System.out.println(b2);
			    if(a2/0==b2)
			    {

			        System.out.println("Hello");
			    }
			    else
			    {
			        System.out.println("Hi");
			    }
	}

}
