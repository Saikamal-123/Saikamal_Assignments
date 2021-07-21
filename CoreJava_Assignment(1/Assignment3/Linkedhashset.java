package Assignment3;
import java.util.*;
public class Linkedhashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Set<Integer> list=new LinkedHashSet<>();
          list.add(50);
          list.add(26);
          list.add(10);
          list.add(35);
          list.add(65);
          Iterator<Integer> it=list.iterator();
          while(it.hasNext())
          {
         	 System.out.println(it.next());
          }
	}

}
