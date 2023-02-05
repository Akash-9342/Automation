package methodInJava;

public class Sample1 {
 public void s1() {
	 System.out.println("Non Static method running");
 }
 public void s2(int a,int b) {
 int c= a+b;
 System.out.println(c);
	 
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Sample1 as= new Sample1();
  as.s1();
  as.s2(52,64);
  NonStaticMethod ab= new NonStaticMethod();
  int ans= ab.product(15,5);
  System.out.println(ans);
	}

}
