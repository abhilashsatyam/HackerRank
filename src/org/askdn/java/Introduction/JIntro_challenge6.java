package org.askdn.java.Introduction;

import java.util.Scanner;

public class JIntro_challenge6 {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int i=0;
        do{
          ++i;
          System.out.println(i+" "+input.nextLine());
        }
        while(input.hasNext());
    }
}
