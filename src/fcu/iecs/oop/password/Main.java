package fcu.iecs.oop.password;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		String Y;
		String T="exit";
		
		 PasswordEncorder  password= new   PasswordEncorder();
		 Scanner scanner = new Scanner(System.in);
		 do{
         System.out.printf("Please enter a password:");
         Y=scanner.next();
         if(Y.compareTo(T)==0)
         {
        	 continue;
         }
		System.out.printf(password.encode(Y));
		
		 }while(Y.compareTo(T)<0);
		 
		 
		 scanner.close();

	}
}
