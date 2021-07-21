package Assignment3;
import java.util.*;
public class ArraylistA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(list);
		Iterator<Integer> it=list.iterator();
		while(it.hasNext())
		{
			list.add(60);
			System.out.println(it.next());
		}
	}

}
