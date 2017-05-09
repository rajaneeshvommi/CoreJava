package logics;

// Multidimensional Array

public class Multi_Dimensional {

	public static void main(String[] args) {
		int m[][]={{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(m.length);
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m.length;j++){
				System.out.print(m[i][j]+" ");
			}
			System.out.println();
		}; // End of Loop

	}; // End of Main Method

}; // End of class
