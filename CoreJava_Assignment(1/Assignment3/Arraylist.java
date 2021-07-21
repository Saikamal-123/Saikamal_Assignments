package Assignment3;
import java.util.*;
public class Arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(2);
		list.add(9);
		list.add(5);
		list.add(1);
		list.add(10);
		ListIterator<Integer> it=list.listIterator(list.size());
		while(it.hasPrevious())
		{
			System.out.println(it.previous());
		}
		

	}

}
