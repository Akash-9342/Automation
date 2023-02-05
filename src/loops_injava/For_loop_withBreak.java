package loops_injava;
//import java.util.Scanner;
public class For_loop_withBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=10;i>=1;i--)
		{
			if (i==5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
