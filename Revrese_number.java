package logics;

import java.util.Scanner;

// Reverse a number
public class Revrese_number {

	public static void main(String args[]){
		int Reverse =0, Remainder =0;
		System.out.println("Enter the value :" );
		Scanner S= new Scanner(System.in);
		int Input = S.nextInt();
	
		while(Input!=0){
			Remainder = Input%10;
			Reverse = Reverse*10+ Remainder;
			Input = Input/10;
		}
		System.out.println(Reverse);
		
	}
}
