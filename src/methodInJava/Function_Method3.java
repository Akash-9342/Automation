package methodInJava;
import java.util.*;
public class Function_Method3 {
    public static void printfactorial(int n) {
//    	loops
    	if (n<0) {
    		System.out.println("Invalid number");
    		return;
    	}
    	int factorial =1;
    	for (int i=n;i>=1;i--) {
    		factorial = factorial * i;
    	}
    	System.out.println(factorial);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc= new Scanner (System.in);
 int n = sc.nextInt();
 printfactorial(n);
	}

}
