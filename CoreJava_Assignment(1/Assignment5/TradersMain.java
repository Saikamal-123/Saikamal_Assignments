package Assignment5;

import java.util.LinkedList;
import java.util.List;

public class TradersMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Traders> list=new LinkedList<Traders>();
		
		list.add(new Traders("sai", "Hyderabad"));
		list.add(new Traders("kamal", "Delhi"));
		list.add(new Traders("John", "pune"));
		list.add(new Traders("kiran", "Bangalore"));
		list.add(new Traders("kate", "pune"));
		list.add(new Traders("stanley", "indore"));
         System.out.println("Traders from Pune sorted by name alphabetically \n");
		
		list.stream()
		.filter(a->a.getCity().equalsIgnoreCase("pune"))
		.sorted((a1,a2)->a1.getName().compareTo(a2.getName()))
		.forEach(o->System.out.println(o.getName()));
		System.out.println();
        System.out.println("Traders from Indore\n");
		
		list.stream()
		.filter(a->a.getCity().equalsIgnoreCase("Indore"))
		.forEach(o->System.out.println(o.getName()));
		System.out.println();
		System.out.println("Unique cities where traders work\n");
		list.stream()
		.distinct()
		.forEach(a->System.out.println(a.getCity()));
		System.out.println();
		System.out.println("String of all traders name sorted alphabetically \n");
		list.stream()
		.sorted((o1,o2)->o1.getName().compareTo(o2.getName()))
		.forEach(o->System.out.println(o.getName()));
	}

}
