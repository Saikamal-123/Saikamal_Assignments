package Assignment2;
import java.util.*;
public class Manager extends Employee {
	public void totalSalary()
	{
		Scanner sc=new Scanner(System.in);
		int payperdaym=1000;
		System.out.println("Enter Incentive");
		int incentive=sc.nextInt();
		
		int salaryofmanager=(30*payperdaym)+incentive;
		System.out.println("Salary of manager is "+salaryofmanager);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
	}

}
