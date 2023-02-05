package methodInJava;
import java.util.*;
public class Function_Method2_injava {
//public static int addition(int a,int b){
//int sum= a+b;
//return sum;
//
//}
	public static int multi(int a,int b){
//		int product= a*b;
		return (a*b);

		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
int a= sc.nextInt();
int b=sc.nextInt();
//       int product= multi(a,b);
System.out.println("product of two numbers is "  +multi(a,b));
	}

}
