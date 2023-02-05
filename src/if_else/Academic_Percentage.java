package if_else;
import java.util.Scanner;
public class Academic_Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("your academic percentage is");
Scanner m = new Scanner(System.in);
System.out.println("Enter the marks in S1");
int s1=m.nextInt();
System.out.println("Enter the marks in S2");
int s2=m.nextInt();
System.out.println("Enter the marks in S3");
int s3=m.nextInt();
System.out.println("Enter the marks in S4");
int s4=m.nextInt();
	
System.out.println("Enter the marks in S5");
int s5=m.nextInt();
System.out.println("Enter the marks in S6");
int s6=m.nextInt();
Float Percentage=((s1+s2+s3+s4+s5+s6)/600f*100);
System.out.println(Percentage);
	
	}

}
