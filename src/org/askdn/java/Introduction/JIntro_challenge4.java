package org.askdn.java.Introduction;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JIntro_challenge4 {

	public static void main(String[] args) {
        int nCase;
        Scanner in = new Scanner(System.in);
        nCase = in.nextInt();

        for (int i = 0; i < nCase; i++) {
        	boolean canBoolean = false;
            boolean canByte = true;
            boolean canShort = true;
            boolean canInt = true;
            boolean canLong = true;
            
            String line = in.next();
            
            if (line.equals("0") || line.equals("1"))
            	canBoolean = true;
            
            try {
            	byte b = Byte.parseByte(line);
            } catch (NumberFormatException e) {
            	canByte = false;
            } 
            
            try {
            	short s = Short.parseShort(line);
            } catch (NumberFormatException e) {
            	canShort = false;
            } 
            
            try {
            	int ii = Integer.parseInt(line);
            } catch (NumberFormatException e) {
            	canInt = false;
            } 
            
            try {
            	long l = Long.parseLong(line);
            } catch (NumberFormatException e) {
            	canLong = false;
            } 
            
            if (!canBoolean && !canByte && !canShort && !canInt && !canLong) {
            	System.out.println(line + " can't be fitted anywhere.");
            } else {
            	System.out.println(line + " can be fitted in:");
            	if (canBoolean)
            		System.out.println("* boolean");
            	if (canByte)
            		System.out.println("* byte");
            	if (canShort)
            		System.out.println("* short");
            	if (canInt)
            		System.out.println("* int");
            	if (canLong)
            		System.out.println("* long");
            }
        }
    }
}