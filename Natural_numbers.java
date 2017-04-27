package logics;

import java.util.Scanner;

public class Natural_numbers {

	public static void main(String[]  args){
		int sum = 0 ;
		System.out.println("Enter the length:");
		Scanner S = new Scanner(System.in);
		int len = S.nextInt();
		for(int i=0; i<=len;i++){
			System.out.println(i);
			sum +=i;
			}; //End of For loop
		System.out.println("Sum of the natural numbers:" + sum);
	}; // End of main Method
}; // End of Class
