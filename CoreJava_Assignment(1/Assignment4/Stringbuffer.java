package Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list1=new ArrayList<>();
		list1.add("sai");
		list1.add("kamal");
		list1.add("john");
		list1.add("patrick");
		Object sb=new StringBuffer("");
		
		//Consumer<String> cons=c->list1.forEach(i->i.charAt(0));
		//cons.accept("hello");
		//Consumer<String> cons=i->li;
		//cons.accept("hi");
		//cons.accept("hi");
		sb = first(list1,i->list1.stream().map(s->s.substring(0,1)).forEach(System.out::println));
		//list1.stream()
		//.map(i->i.substring(0,1))
		//.forEach(i->System.out.println(i));
		//System.out.println(list1);
		
	}
	public static Object first(List<String> list1,Consumer<String> cons)
	{
		for(String s:list1)
		{
			
			cons.accept(s);
			
		}
		return cons;
		
		
		
	}
}
