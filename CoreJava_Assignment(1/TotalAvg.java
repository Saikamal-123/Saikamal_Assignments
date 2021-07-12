import java.util.*;
public class TotalAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int[] a=new int[3];
		int[] b=new int[3];
		int[] c=new int[3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		for(int i=0;i<c.length;i++)
		{
			c[i]=s.nextInt();
		}
		int totala=0,totalb=0,totalc=0,avga=0,avgb=0,avgc=0;
		for(int j=0;j<a.length;j++)
		{
			totala=totala+a[j];
		}
		for(int j=0;j<b.length;j++)
		{
			totalb=totalb+b[j];
		}
		for(int j=0;j<c.length;j++)
		{
			totalc=totalc+c[j];
		}
		avga=totala/a.length;
		avgb=totalb/b.length;
		avgc=totalc/c.length;
		System.out.println("Result of Student 1: Total="+totala+" Average="+avga);
		System.out.println("Result of Student 2: Total="+totalb+" Average="+avgb);
		System.out.println("Result of Student 3: Total="+totalc+" Average="+avgc);
	    int count=0;
		for(int i=0;i<a.length;i++)
		{
			int res=0;
			 res=(a[i]+b[i]+c[i])/3;
			 System.out.println("Average of students in subject "+ ++count+" is "+res);
		}
	    
	    
	    

	}

}
