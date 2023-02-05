package Associativity_of_java;

public class Associativity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a= 6*5-34/2; //according to associativity and precedence rule exprecession follows left to rigth associaticity 
		int b= 6/5-6*2;  // it does not follows bodamass rule (mathe matical rule) it follows according to java precedence
System.out.println(a);
System.out.println(b);
int c= b*b-(4*a*22)/(2*a);// in this expression highest precedence is for bracket provided hence it will solve the expression inside the bracket 
// the according to associativity for *&/ it flows left to right finally it solve substraction
System.out.println(c);
char x= 'B';
System.out.println(++x);
	}

}