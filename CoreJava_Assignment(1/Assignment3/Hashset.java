package Assignment3;
import java.util.*;
public class Hashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> hash=new HashSet<>();
		hash.add(5);
		hash.add(2);
		hash.add(3);
		hash.add(1);
		hash.add(4);
         Iterator<Integer> it=hash.iterator();
         while(it.hasNext())
         {
        	 
        	 System.out.println(it.next());
         }
	}

}
