package Assignment3;
import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;
public class Copyonwritearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CopyOnWriteArrayList<Integer> arr=new CopyOnWriteArrayList<Integer>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.add(50);
		Iterator<Integer> it=arr.iterator();
		while(it.hasNext())
		{
			arr.remove(2);
			System.out.println(it.next());
		}

	}

}
