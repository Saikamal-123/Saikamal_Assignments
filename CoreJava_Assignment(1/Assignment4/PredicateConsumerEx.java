package Assignment4;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateConsumerEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
        List<Orders> list1=Arrays.asList(
     		   new Orders(15000,"Accepted"),
     		   new Orders(25000,"Completed"),
     		   new Orders(5000,"Completed"),
     		   new Orders(15000,"Accepted"));
           supplierEx(list1,o->o.getStatus().startsWith("A"),System.out::println);
           
	}
	public static void supplierEx(List<Orders> list1,Predicate<Orders> pre,Consumer<Orders> cons)
	{
		for(Orders o:list1)
		{
			if(pre.test(o))
			{
				cons.accept(o);
				
			}
		}
	}

}
