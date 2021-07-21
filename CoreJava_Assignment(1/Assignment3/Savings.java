package Assignment2;
import java.util.*;
public class Savings extends AccountType {
	public void totalCash()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fixed amount");
		int fixed=sc.nextInt();
		System.out.println("Enter intrest rate");
		int intrest=sc.nextInt();
		System.out.println("Enter tenure in months");
		int timeinmonths=sc.nextInt();
		int cash=(fixed*intrest*timeinmonths)/100;
		int totalamountfixed=cash+fixed;
		System.out.println("Total fixed amount at present is "+totalamountfixed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
