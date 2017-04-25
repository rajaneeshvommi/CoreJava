package logics;

// Distance between to two points

public class Distance_btw_two_points {

	static double Distance(int x1, int x2, int y1, int y2){
		double dif_x = Math.pow(x2-x1,2);
		double dif_y = Math.pow(y2-y1,2);
		double square_root = Math.sqrt(dif_x+dif_y);
		return square_root;
	}; //Method which return the Distance between two points  
	
	public static void main(String[] args) {
	
		double result = Distance(10,20,5,15);
		System.out.println("Distance Between Two Points:"+ result);

	} //End of MainMethod

}; //End of class
