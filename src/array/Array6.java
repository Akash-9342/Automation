package array;

public class Array6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
    int  maximum=0;
    int sum=0;
         for(int i=0;i<arr.length;i++) {
        	 for (int j=0;j<arr[0].length;j++) {
        		 System.out.print(arr[i][j]+" ");
        		  sum= sum+arr[i][j];
        		 if(arr[i][j]>maximum){
        			 maximum =arr[i][j];
        			 
        			  }
        	 }
        	 System.out.println();
        	 System.out.println("maximum value is "+maximum);
         }

    	 System.out.println("sum of value "+sum);
    	 System.out.println("maximum value is "+maximum);
	}

}
