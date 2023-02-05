package methodInJava;

public class Sample3 {
 public void NonStaticmethod1() {
	 System.out.println("Hey Akash");
 }
 public void NonstaticMethd2() {
	 System.out.println("Good Morning");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample2.Studentinfo("Akash" ,33,'A',62.35);
		Sample3 s3=new Sample3();
		s3.NonStaticmethod1();
		s3.NonstaticMethd2();
	}

}
