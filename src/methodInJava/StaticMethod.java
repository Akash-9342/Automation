package methodInJava;

public class StaticMethod {
public static void test() {
 System.out.println("Akash u are not practing u have to practice more");	
}
public static void Test2() {
	System.out.println("If u have aim then u have to live it");
}
public static void swap(int a ,int b) {
	int temp;
	temp = a;
	a=b;
	b=temp;
	System.out.println("Value of a after swapping : "+a);
	System.out.println("Value of b after swapping : "+b);
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
test();
Test2();
swap(6,4);
	}

}
