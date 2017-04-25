package logics;

// Star Sequence
import java.util.Scanner;

public class Star_Sequence {

	public static void main(String args[]){
		System.out.println("Enter the length:");
		Scanner S = new Scanner(System.in);
		int len = S.nextInt();
		for(int i=0;i<=len;i++){
			System.out.println("");
			for(int j =0; j<=i;j++){
				System.out.print("*");
			}
		};// End of Loop
	};// End of Main
};// End of Class
