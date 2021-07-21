package Assignment3;
import java.util.*;
public class HashsetA3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> hash=new HashSet<>();
		hash.add(100);
		hash.add(200);
		hash.add(300);
		hash.add(400);
		hash.add(500);
		System.out.println(hash);
		Iterator<Integer> it=hash.iterator();
		while(it.hasNext())
		{
			hash.add(600);
			System.out.println(it.next());
		}

	}

}
