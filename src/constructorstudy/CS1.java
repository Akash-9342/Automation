package constructorstudy;

public class CS1 {
	
 public CS1(String name ,int id) {
		System.out.println(name +" "+id);
 }
 public CS1(int a,int b) {
	 int c=a*b;
	 System.out.println(c);
 }
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 CS1 a = new CS1("Akash",1234);
  CS1 b = new CS1("bhagwat",56789);
  CS1 c = new CS1("Shinde",839342);
  CS1 d = new CS1 (5,9);
// System.out.println();
	}

}
