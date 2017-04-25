package logics;

public class Palindrome {

	public static void main(String args[]) {

		
		

		for (int i = 1000; i <= 2000; i++) {
			int num = i;int Reverse = 0;
			while (num > 0) {
				int Remainder = num % 10;
				Reverse = Reverse * 10 + Remainder;
				num /= 10;
			}

			if (i == Reverse) {
				System.out.println(i);

			}
		}
	}// End of Main Method

}
