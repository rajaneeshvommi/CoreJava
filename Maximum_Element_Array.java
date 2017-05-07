package logics;

import java.util.Collections;
import java.util.TreeSet;

// Program to display the max Element in Array

public class Maximum_Element_Array {

	public static void main(String[] args) {
		
		TreeSet<Integer> obj = new TreeSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(203);
		obj.add(340);
		obj.add(255);
		obj.add(770);
		obj.add(6980);
		
		System.out.println(obj);
		
		System.out.println(Collections.max(obj));

	}; //End of Main Method

}; //End of Class
