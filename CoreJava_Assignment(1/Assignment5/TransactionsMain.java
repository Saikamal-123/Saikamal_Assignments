package Assignment5;

import java.util.*;

public class TransactionsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Transactions> list=new LinkedList<Transactions>();
		
		list.add(new Transactions(new Traders("sai", "Hyderabad"), 2009, 200));
		list.add(new Transactions(new Traders("kate", "Chennai"), 2017, 900));
		list.add(new Transactions(new Traders("kamal", "Mumbai"), 2010, 300));
		list.add(new Transactions(new Traders("bron", "Bangalore"), 2014, 700));
		list.add(new Transactions(new Traders("chris", "Pune"), 2016, 600));
		list.add(new Transactions(new Traders("pat", "Kolkata"), 2011, 500));
		list.add(new Transactions(new Traders("matt", "Delhi"), 2006, 300));
		list.add(new Transactions(new Traders("sean", "Kolkata"), 2011, 490));
		System.out.println("Transactions  in  the  year  2011  and  sort  them  by  value  (small  to high)\n");

		list.stream()
		.filter(a->a.getYear()==2011)
		.sorted((a1,a2)->a1.getValue()-a2.getValue())
		.forEach(o->System.out.println(o.getValue()));
		System.out.println();
		System.out.println("Print all transactions’ values from the traders living in Delhi\n");
		list.stream()
		.filter(a->a.getTrader().getCity().equalsIgnoreCase("delhi"))
		.forEach(a->System.out.println(a.getValue()));
		System.out.println();
          System.out.println("Highest value of all transactions\n");
		
		         Transactions highest = list.stream()
				.max((a1,a2)->a1.getValue()-a2.getValue())
				.get();
		         System.out.println(highest.getValue());
		         System.out.println();
		         System.out.println("Minimum value of all transactions\n");
		 		
		 		Transactions minimum = list.stream()
		 				.min((a1,a2)->a1.getValue()-a2.getValue())
		 				.get();
		 				
		 		System.out.println(minimum.getValue());

	}

}
