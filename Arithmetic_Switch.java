package logics;

import java.util.Scanner;

public class Arithmetic_Switch {

	public static void main(String[] args) {
		int result;
		System.out.println("Enter the value of A:");
		Scanner S= new Scanner(System.in);
		int A =S.nextInt();
		
		System.out.println("Enter the value of B:");
		Scanner S1= new Scanner(System.in);
		int B =S1.nextInt();
		
		System.out.println("Enter the value:");
		Scanner S2 = new Scanner(System.in);
		int N = S2.nextInt();
	
		switch(N){
		case 1:
			result = A+B;
			System.out.println(result);
			break;
		case 2:
			result = A-B;
			System.out.println(result);
			break;
		case 3:
			result = A*B;
			System.out.println(result);
			break;
		case 4:
			result = A/B;
			System.out.println(result);
			break;
		case 5:
			result = A%B;
			System.out.println(result);
			break;
		default:
			System.out.print("Enter the input");
			break;
		}; //End of Switch

	}

}
