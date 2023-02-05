package array;

public class Array3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int abc[][]= {{1,2,3},{4,5,6},{7,8,9}};
   for (int i=0;i<abc.length;i++) {
	   for (int j=0;j<abc[0].length;j++) {
		   System.out.print(abc[i][j]+" ");
	   }
	   System.out.println();
   }
	}

}
