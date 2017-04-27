package logics;

import java.util.Scanner;

// Print the Series 1+3+5+7+...+n  and there sum
public class Series_number {

	public static void main(String[] args){
		int sum =0;
		System.out.println("Enter the length:");
		Scanner S = new Scanner(System.in);
		int len = S.nextInt();
		for(int i=0 ; i<=len; i++){
			if(i%2!=0){
				System.out.print(i+"+");
				sum += i;
			}
		}; // End of for loop
		
		System.out.println("Sum of Series:" + sum );
	};// End of Main Method
}; // End of class
