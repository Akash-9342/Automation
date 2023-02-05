package loops_injava;
import java.util.Scanner;
public class Break_withuser_input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double number, sum = 0.0;
		Scanner input = new Scanner(System.in);

while (true){
	System.out.println("Enter number");
	number=input.nextDouble();
	if(number<0.0){
		break;
	}
	sum+=number;
}

System.out.println("sum= "+sum);

	}

}
