package Assignment1;
import java.util.*;
public class Userlogin {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s=new Scanner(System.in);
		String username="kamal";
		String password="kamalsai";
		
		int count=3;
		for(int i=0;i<=count+1;i++)
		{
			String user=s.nextLine();
			String pass=s.nextLine();
		if(user.equals(username)&&pass.equals(password))
		{
			System.out.println("Welcome "+user);
		}
		else
		{
			
			System.out.println(--count+" Attempts left");
		}
		
		}
		if(count==0)
		{
			System.out.println("Contact Admin");
		}
		//System.out.println("Contact Admin");
		

	}
	
	
}
