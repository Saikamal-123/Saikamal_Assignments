package Assignment2;
import java.util.*;
public class Labour extends Employee {
	public void totalSalary()
	{
		Scanner sc=new Scanner(System.in);
		int payperdayl=500;
		System.out.println("Enter Overtime in hours");
		int otinhours=sc.nextInt();
		int salaryoflabour=(30*payperdayl)+(otinhours*50);
		System.out.println("Salary of manager is "+salaryoflabour);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
