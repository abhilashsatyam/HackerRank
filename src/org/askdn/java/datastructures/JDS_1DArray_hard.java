package org.askdn.java.datastructures;

import java.util.Scanner;

public class JDS_1DArray_hard {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int testcases = input.nextInt();
        for(int i=0; i<testcases; i++)
        {
           int pointer = 0;
           int n=input.nextInt();
           int steps=input.nextInt()-1;
           int[] v = new int[n];
           for(int j=0;j<n;j++)
           {
               v[j] = input.nextInt();  
           }
           input.close();
           int k=0;
           while(k<=n)
           {
              if(v[k] == 0 && k+1 < n)
              {
                  k++;
                  pointer=k;
              }
              else
              if(v[k] == 1 || v[k+1] == 1)
              {
                 pointer = k+steps;
                 if(pointer>n || v[pointer] == 0)
                 {
                   System.out.println("YES"); 
                   break;
                 }
                 else
                 if(k < n && v[k] == 1)
                 {
                     System.out.println("NO");   
                     break;
                 }
              }
              
           }
        
        }      
    }
}