package Assignment1;
import java.util.*;
public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int temp=a;
		int arm=0;
		int rem;
		while(a>0)
		{
			rem=a%10;
			arm=arm+(rem*rem*rem);
			a=a/10;
		}
		if(temp==arm)
		{
			System.out.println(temp+" "+"is an armstrong number");
		}
		else
		{
			System.out.println(temp+" "+"is not an armstrong number");
		}

	}

}
