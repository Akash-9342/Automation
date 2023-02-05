package string;

public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s1="akashShinde";
    System.out.println(s1.charAt(3));
    System.out.println(s1.replace(" ","-"));
    System.out.println(s1.indexOf('a'));
    System.out.println(s1.indexOf("h"));      //1st occurance
    System.out.println(s1.indexOf("h",s1.indexOf("h")+1));      //2nd occurance
    System.out.println(s1.toUpperCase());

	}

}
