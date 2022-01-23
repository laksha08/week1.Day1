package week1.day1;

public class student {
		
	String name = "Lak";
	int rollNum = 123;
 	
	public static void main(String[] args) {
		
	student detail = new student();
	detail.college();
	}

 public void college() {
	String dept = "EIE";
	System.out.println("Name is :"+name);
	System.out.println("RollNum is :"+ rollNum);
	System.out.println("Department is :"+ dept);
	}
	
	
}
