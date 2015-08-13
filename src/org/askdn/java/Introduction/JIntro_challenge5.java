package org.askdn.java.Introduction;

import java.util.Scanner;

public class JIntro_challenge5 {
	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner input = new Scanner(System.in);
       int testcase = input.nextInt();
       for(int i=0;i<testcase;i++)
       {
           int k =0;
           int a = input.nextInt();
           int b = input.nextInt();
           int n = input.nextInt();
           int sum=a;
           if(a >=0 && b <=50 && n <=15 && b>=0 && a <=50)
           {
           while(k<n)
           {
             sum+=(int)(Math.pow(2,k)*b);
             System.out.print(sum+" ");
             k++;
           }
           
           }
           System.out.println();
           
       }
    }
	
}
