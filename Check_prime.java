package logics;
import java.util.Scanner;
 // To check number it is Prime or not
public class Check_prime {

	public static void main(String[] args) {
		int prime =0;
		
		System.out.println("Enter the value:");
		Scanner S = new Scanner(System.in);
		int len = S.nextInt(); // input value
		
		for(int i=2;i<len;i++){
			if(len%i==0){
				prime =1;
				break;
					}
				}; // loop condition
			if(prime==0){
				System.out.println("It is a prime Number");
			}else{
				System.out.println("It is a Not prime Number");
				}
			}; //End of Main
};//End of Class
