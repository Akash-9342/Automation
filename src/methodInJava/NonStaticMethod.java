package methodInJava;

public class NonStaticMethod {
 int product(int x, int y) {
	 int a= x*y;
	 return a;
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
NonStaticMethod mul = new NonStaticMethod();
int ans = mul.product(12,89);
	System.out.println(ans);
	
	StaticMethod.swap(15,9);
	}
}
