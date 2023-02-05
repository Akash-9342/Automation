package if_else;

public class Grading_system {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=20;
		if (marks>75) {
			System.out.println("Grade A+");
		}
		else if(marks>65) {
			System.out.println("Garde b+");
		}
		else if(marks>50)
		{
			System.out.println("Grade c+");
		}
		else if(marks>40) {
			System.out.println("Just pass");
			}
		else if(marks<35) {
			System.out.println("Gadhwa fail ahe tu");
		}
	}

}
