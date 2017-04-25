package logics;
// Reverse the Star Sequence

import java.util.Scanner;

public class Star_Right_Flip {

	public static void main(String[] args) {
				System.out.println("Enter the length:");
				Scanner S = new Scanner(System.in);
				int len = S.nextInt();
				for(int i=0; i<=len;i++){
					
					for(int j =0;j<=len-i;j++){
						System.out.print(" ");
					}
					
					for(int k=0; k<=i;k++){
						System.out.print("*");
					}
					
					System.out.println("");
					
				}; // End of For loop
			}; //End of Main Method 

		}; //End of Class
