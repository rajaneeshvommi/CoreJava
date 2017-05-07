package logics;

public class Square {

	public int Square(int A){
		return A*A;
	}; // End of Method Square_root
	
	public static void main(String[] args) {
	
		Square obj = new Square();
		int Result_Function = obj.Square(20);
		System.out.println("Square Root:" + Result_Function);
	
		
	}; // End of Main Method

}; //End of Class
