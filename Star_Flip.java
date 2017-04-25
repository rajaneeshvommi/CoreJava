package logics;

import java.util.Scanner;

public class Star_Flip {
	public static void main(String args[]){
		System.out.println("Enter the length:");
		Scanner S = new Scanner(System.in);
		int len = S.nextInt();
		for(int i=0; i<=len;i++){
			System.out.println("");
			for(int j=len; j>=i;j--){
				System.out.print("*");
			};
		}; // End of For loop
	}; //End of Main Method 

}; //End of Class
