package array;

public class Array4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ak[]= {1,2,5,8,9,10,56,54,4,6,85};
		int maximum=ak[0];
		for(int i=0;i<ak.length;i++) {
			if(ak[i]>maximum) {
				maximum=ak[i];
			}
		}
		System.out.println("Largest number is "+maximum);
		
	}
}
