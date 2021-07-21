package Assignment2;
import java.util.*;
public class Current extends AccountType {
	
	public void totalCash()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter credit");
		int credit=sc.nextInt();
		System.out.println("Enter intrest rate");
		int intrest=sc.nextInt();
		System.out.println("Enter tenure in months");
		int timeinmonths=sc.nextInt();
		int cash=(credit*intrest*timeinmonths)/100;
		int totalcredit=cash+credit;
		System.out.println("Total Credit at present is "+totalcredit);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
