package Assignment2;

import java.util.*;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candy c1=new Candy();
		Cookie c2=new Cookie();
		Icecream I=new Icecream();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your role");
		String role=sc.nextLine();
		if(role.equalsIgnoreCase("owner"))
		{
			String additem=sc.nextLine();
			System.out.println("New Item added "+additem);
		}
		else if(role.equalsIgnoreCase("customer"))
		{
			String ch=sc.nextLine();
			if(ch.equalsIgnoreCase("candy"))
			{
				System.out.println("You have ordered "+ch);
				c1.getCost();
			}
			else if(ch.equalsIgnoreCase("cookie"))
			{
				System.out.println("You have ordered "+ch);
				c2.getCost();
			}	
			else if(ch.equalsIgnoreCase("icecream"))
			{
				System.out.println("You have ordered "+ch);
				I.getCost();
			}
		}
	}

}
