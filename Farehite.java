package org.gemsco;

import java.util.Scanner;

public class Farehite {
	
public static void main(String[] args) {
		
    Scanner s=new Scanner(System.in);
    int S=s.nextInt();
    int E=s.nextInt();
    int W=s.nextInt();
	int C;
        
        while(S<=E)
        {
          C=((5*(S-32))/9);
             System.out.println(S+" "+C);
            S+=W;
        }
        
        System.out.println("===========================");
        Scanner s1=new Scanner(System.in);
        int n=s1.nextInt();
        boolean isprime=true;
        if(n%2==0)
            isprime=false;
        int i=3;
        while(isprime&&i<n)
        {
            isprime=!(n%i==0);
            i+=2;
        }
        if(isprime)
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Composite");
        }
        
	}

}
