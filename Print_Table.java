package logics;

// Display the table for given number
import java.util.Scanner;

public class Print_Table {

	public static void main(String[] args) {
		System.out.println("Enter the Table number:");
		Scanner S =new Scanner(System.in);
		int value = S.nextInt();
		System.out.println("Print the"+ value +"table");
		for(int i=1; i<=20; i++){
			int result =value*i;
			System.out.println(value +"*"+ i +"=" +result );
		}; // End of for loop
	}; // End of main Method
}; // End of Class
