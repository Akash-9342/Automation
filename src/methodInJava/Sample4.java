package methodInJava;

public class Sample4 {
	public void Studentinfo(String Studentname, int Rollno, char Sgrade, Double Spercentage) {
		 System.out.println("student name : " +Studentname+", Roll no: "+Rollno+", Student grade: "+Sgrade+", Student percentage: "+Spercentage);
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	     
			Sample4 s4=new Sample4();
			s4.Studentinfo("Ankita",34,'A',75.38);
		}
}
