package logics;

import java.util.Scanner;

public class Gretest_number {
	public static void main (String args[]){
		int num; int greatest=0;
		for(int i =0 ; i<=4; i++){
			System.out.println("Enter the " + i + " value:");
			Scanner S = new Scanner(System.in);
			num = S.nextInt();
			if(num > greatest){
				greatest = num;
			}
			}; // End of Loop
		System.out.println("Greatest number:" + greatest);
	}// End of Main Method

}
