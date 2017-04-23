package logics;

import java.util.Scanner;

// Print Prime Numbers for given range
public class Display_Prime_numbers {

	public static void main(String args[]){
		String PrimeString ="";
		int num =0;
		System.out.println("Enter the value:");
		Scanner S = new Scanner (System.in);
		int len = S.nextInt();
		for(int i =1; i<=len;i++){
			int count =0;
			for(num = i ; num>=1; num--){
				if(i%num==0){
					count = count +1;
				}// End of If loop
			}// End of for loop
			if(count ==2){
				PrimeString = PrimeString + i+ " " ; 
			}//End of If loop 
		}; // End of For loop
		System.out.println("Prime numbers are:");
		System.out.println(PrimeString);
	};//End of main Loop
}; // End of class
