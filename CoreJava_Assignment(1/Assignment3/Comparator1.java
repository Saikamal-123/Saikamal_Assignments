package Assignment3;
import java.util.*;
public class Comparator1 implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		// TODO Auto-generated method stub
		if(o1.weight>o2.weight) {
			return 1;
			
		}
		else {
		return 0;
	}
	}
	

}
