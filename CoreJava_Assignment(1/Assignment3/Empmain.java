package Assignment3;
import java.util.*;
public class Empmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Employee5,String> hash=new Hashtable<Employee5,String>();
		Employee5 e1=new Employee5("kamal",50000);
		Employee5 e2=new Employee5("sai",45000);
		Employee5 e3=new Employee5("john",40000);
		Employee5 e4=new Employee5("kate",20000);
	   
		
		hash.put(e1,"Hii");
		System.out.println(hash.get(e1));
		System.out.println(e1.hashCode());
		System.out.println(e2.equals(e3));
		hash.put(e2,"Hello");
		System.out.println(hash.get(e2));
		System.out.println(e2.hashCode());
		System.out.println(e3.equals(e1));
		hash.put(e3,"Good");
		System.out.println(hash.get(e3));
		System.out.println(e3.hashCode());
		System.out.println(e1.equals(e2));
		hash.put(e4,"Morning");
		System.out.println(hash.get(e4));
		System.out.println(e4.hashCode());
		System.out.println(e4.equals(e1));
		
		
		

	}

}
