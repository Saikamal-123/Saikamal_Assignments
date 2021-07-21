package Assignment3;

import java.util.*;
import java.util.TreeSet;

public class Main{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Person> tree=new TreeSet<Person>();
		Person p1=new Person("kamal",175,21);
		Person p2=new Person("purna",170,22);
		Person p3=new Person("sai",165,20);
		tree.add(p1);
		tree.add(p2);
		tree.add(p3);
		//Iterator<Person> it=tree.iterator();
		for(Person p:tree)
		{
			System.out.println(p.getWeight());
		}
	}
        
	}

	
	
	

