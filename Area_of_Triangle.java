package logics;

import java.util.Scanner;

// Area of Triangle
public class Area_of_Triangle {

	public static void main(String[] args){
			System.out.println("Enter the value of Base:");
			Scanner Input1 = new Scanner(System.in);
			int Base =Input1.nextInt();
			System.out.println("Enter the value of Height:");
			Scanner Input2 = new Scanner(System.in);
			int Height = Input2.nextInt();
			double Area = (Base*Height)/2;
			System.out.println("Area of Triangle:"+ Area);
	}; // End of Main Method
}; // End of Class
