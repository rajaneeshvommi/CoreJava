package logics;

import java.util.Scanner;

// Swap Two Numbers
public class Swap_number {

	public static void main(String args[]){
		System.out.println("Enter the value of A:" );
		Scanner S= new Scanner(System.in);
		int A = S.nextInt();
		System.out.println("Value of A:"+A);
		System.out.println("Enter the value of B:" );
		Scanner S1= new Scanner(System.in);
		int B = S1.nextInt();
		System.out.println("Value of B:"+B);
		A = A+B;
		B = A-B;
		A = A-B;
		System.out.println("Swaped numbers (A,B):"+ A +","+B );
	}
}
