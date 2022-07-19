package org.gemsco;

import java.util.Scanner;

public class RCoperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=50,b=20;
		System.out.print("==================");
	    if(a>b)
	    {
	    	System.out.println("===---------------=");
	        if(a>100)
	            System.out.println("Ace");
	        if(b<100)
	            b=50;
	        System.out.print("===----="+b);
	    }
	    else if(a==b)
	    {
	        System.out.println("King");
	    }
	    else 
	    {
	        System.out.println("Queen");
	    }
//	    Scanner sc =new Scanner(System.in);
//	    char c1= sc.next().charAt(0);
//	    
//	    char c,b1;
//
//	    for(c = 'A'; c <= 'Z'; ++c) {
//	      System.out.print(c + " ");
//	    }
//	    
//	    for(b1 = 'a'; b1 <= 'z'; ++b1) {
//		      System.out.print(b1 + " ");
//		    }
//	    System.out.println("======================================");
//	    int i=0;
//	    while(i<10)
//	    {
//	        i=i+1;
//	        System.out.print(i);
//	        i=i+1;
//	    }
	    System.out.println("======================================");
	    int i=1;
	    while(i<5)
	    {
	        System.out.print(2*i);
	        i=i+1;
	    }
	    System.out.println("--------------");
	    int i1=2;
	    while(i1<10)
	    {
	        System.out.print(i1);
	        i1=i1+2;
	    }
	    System.out.println("--------------");
	    int i2=2;
	    while(i2<10)
	    {
	        System.out.print(i2);
	        i2*=2;
	    }
	    System.out.println("--------------");
	    int i3=10;
	    while(i3>0)
	    {
	        if(i3%2==0)
	        {
	            System.out.print(10-i3);
	        }
	        i3--;
	    }
//	    int x=5;
//	    int y=5;
//	    while((x=5)==y)
//	    {
//	        System.out.println("Hello");
//	        x++;
//	        y++;
//	    }
	}

}
