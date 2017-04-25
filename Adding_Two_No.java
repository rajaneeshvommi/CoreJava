package logics;

//Function for adding Two numbers
public class Adding_Two_No {
	public int num1; //Instance Variable
	public int num2;
	
	static int Add(int num1 ,int num2){
		return num1+num2;
	}; // Static function
	
	public static void main(String args[]) {
		int A =Add(10,20);
		System.out.println("Sum of Two Numbers:"+ A);
		
	}; //End of Main Method

}; //End of class
