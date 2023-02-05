package array;
import java.util.Arrays;
public class Array5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ak[]= {1,2,5,8,9,10,56,54,4,6,85};
		
		for(int i=0;i<ak.length;i++) {
			System.out.print(ak[i]+" ");}
	Arrays.sort(ak);
		System.out.println("Reverse Array");
			for(int j=ak.length-1;j>=0;j--) {
			
				System.out.print(ak[j]+" ");
			}
		}

}
