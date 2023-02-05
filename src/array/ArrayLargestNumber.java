package array;

public class ArrayLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int arr[]= {1,5,8,75,568,5248,52863,9,8,65,45,520};
         int maximum=0;
         for(int i=0;i<arr.length;i++) {
        	 if(arr[i]>maximum) {
        		 maximum=arr[i];
        	 }
         }

    	 System.out.println(maximum);
    	 
    	 int sum=0;
    	 for (int i=0;i<arr.length;i++) {
    		 sum = sum+arr[i];
    		 System.out.println(sum);
    	 }
    	 System.out.println(sum);
	}

}
