package logics;

import java.util.Scanner;

//Write a program to get a factorial
public class Factorial {
	public static void main(String args[]){
		int result =1;
		System.out.println("Enter the value:");
		Scanner S = new Scanner(System.in);
		int Input = S.nextInt();
		for(int i =1 ;i<Input;i++){
			result += result * i; 
		}
		System.out.println(result);
	};//End of Main

};//End of class
