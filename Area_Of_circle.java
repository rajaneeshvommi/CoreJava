package logics;

import java.util.Scanner;

// calculate area of circle
public class Area_Of_circle {
	
	public static void main(String[] args) {
		System.out.println("Enter the radius:");
		Scanner S = new Scanner(System.in);
		int radius = S.nextInt();
		double area = Math.PI*Math.pow(radius, 2);
		System.out.println("Area of Circle:"+area);
		double Circumference = 2*Math.PI*radius;
		System.out.println("Area of Circumference:"+ Circumference);
		
	};// End of Main class

}; // End of class 
