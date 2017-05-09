package logics;

//Multi-Dimensional Addition
public class Multi_Dem_Add {

	public static void main(String[] args) {
		
		int m[][]={{1,2,3},{4,5,6},{7,8,9}};
		int a[][]={{7,8,9},{1,2,3},{4,5,6}};
		int r[][]=new int[3][3];
		for(int i=0;i<m.length;i++){
			for(int j=0; j<m.length;j++){
				r[i][j] =m[i][j]+a[i][j];
				System.out.print(r[i][j]+ " ");
			}
			System.out.println();
		}; //End of for Loop
	
	}; //End of Main Method

}; //End of class
