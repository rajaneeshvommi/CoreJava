package logics;

import java.util.Scanner;

public class Prefect_number {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner S = new Scanner(System.in);
		int len = S.nextInt();
		int count = 0;
		for (int i = 1; i <len; i++) {
			if (len % i == 0) {
				count += i;
			}
		}
		; // End of for Loop
		if (count == len) {
			System.out.println("It is prefect number");
		} else {
			System.out.println("it is not a prefect numbers");
		}

	}// End of Main Method
}
