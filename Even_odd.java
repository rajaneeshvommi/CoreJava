package logics;

import java.util.Scanner;

//Check whether the number is even or odd
public class Even_odd {

	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner S = new Scanner(System.in);
		int len = S.nextInt();
			if(len%2 ==0){
				System.out.println("Entered number is Even");
			}
			else{
				System.out.println("Entered number is odd");
			}// End of If
	}; // End of Main Method

}; // End of class
