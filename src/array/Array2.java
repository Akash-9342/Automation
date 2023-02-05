package array;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   String s1[][]=new String[3][3];
   s1[0][0]="a1";
    s1[0][1]="a2";
    s1[0][2]="a3";
    
    s1[1][0]="b1";
    s1[1][1]="b2";
    s1[1][2]="b3";
    
    s1[2][0]="c1";
    s1[2][1]="c2";
    s1[2][2]="c3";
    
    
    for (int i=0;i<s1.length;i++) {
    	for (int j=0;j<s1[0].length;j++) {
    		System.out.print(s1[i][j]+" ");
    		    		
    	}
    	System.out.println();
    }
    
    
    
	
	
	
	
	
	
	}

}
