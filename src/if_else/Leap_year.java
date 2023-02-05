package if_else;
import java.util.Scanner;
public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Y=new Scanner(System.in);
		System.out.println("Enter year");
		int year=Y.nextInt();
		if (year%4==0 || year%400==0 && year%100!=0)
		{
			System.out.println("Year is leap year");
		}
		else {
			System.out.println("year is not leap year");
		}
		

	}

}
