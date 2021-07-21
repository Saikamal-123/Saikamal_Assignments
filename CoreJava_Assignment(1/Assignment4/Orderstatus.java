package Assignment4;

import java.util.Arrays;
import java.util.List;


public class Orderstatus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           List<Orders> list=Arrays.asList(
        		   new Orders(15000,"Accepted"),
        		   new Orders(25000,"Completed"),
        		   new Orders(5000,"Completed"),
        		   new Orders(15000,"Accepted"));
           
           list.stream()
           .filter(i->i.getPrice()>10000 &&(i.getStatus().equalsIgnoreCase("Accepted")||i.getStatus().equalsIgnoreCase("Completed")))
           .forEach(System.out::println);
	}
 
}
