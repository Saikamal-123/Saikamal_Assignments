package Assignment4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import Assignment3.Date;

public class Hahmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		Map<Integer,String> hash=new HashMap<>();
		hash.put(21, "hello");
		hash.put(23, "sillo");
		hash.put(22, "kello");
		hash.put(25, "mello");
		System.out.println(hash);
		Set<Map.Entry<Integer,String>> entry=hash.entrySet();
		entry.forEach(a->sb.append(a));
		System.out.println(sb);
		

	}

}
