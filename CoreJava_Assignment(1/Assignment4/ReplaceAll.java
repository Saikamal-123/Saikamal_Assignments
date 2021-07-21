package Assignment4;

import java.util.ArrayList;
import java.util.List;

public class ReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<>();
		list.add("sai");
		list.add("kamal");
		list.add("john");
		list.add("patrick");
          list.replaceAll(i->i.toUpperCase());
          System.out.println(list);
	}

}
