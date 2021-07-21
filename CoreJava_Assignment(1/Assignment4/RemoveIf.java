package Assignment4;
import java.util.ArrayList;
import java.util.List;

public class RemoveIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("hello");
		list.add("good");
		list.add("morning");
		list.add("dinner");
		list.removeIf(i->i.length()%2!=0);
		System.out.println(list);

	}

}
