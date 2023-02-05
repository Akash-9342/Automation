package array;

public class LargestValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {50,51,135,558,4569,352,65};
       int maximum=arr[0];
       
       for (int i=0; i<arr.length;i++){
    	   if (arr[i]>maximum) {
    		   maximum = arr[i];
    	   }
       }
       System.out.println("largest Number is "+ maximum);
	}

}
