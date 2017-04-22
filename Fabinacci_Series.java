package logics;

import java.util.Scanner;

public class Fabinacci_Series {

	public static void main(String[] args) {
		System.out.println("Enter the value:");
		Scanner S = new Scanner(System.in);
		int len= S.nextInt();
		int  n1=1,n2=2,n3;
		System.out.print(n1 +" "+ n2+" ");
		for(int i=1;i<=len;i++){
			n3 =n1+ n2;
			System.out.print(n3+" ");
			n1=n2;
			n2=n3;
		};// End of Loop
	};//End of Main
};// End of Class
