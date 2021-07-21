package Assignment3;
import java.security.KeyStore.Entry;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
public class Concurrenthashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new ConcurrentHashMap<Integer,String>();
		map.put(100,"kamal");
		map.put(200,"sai");
		map.put(300,"jrew");
		map.put(400,"collins");
		map.put(500,"john");
		System.out.println(map);
		Set<java.util.Map.Entry<Integer, String>> entry=map.entrySet();
		Iterator<java.util.Map.Entry<Integer, String>> it=entry.iterator();
		while(it.hasNext())
		{
			map.put(600,"klay");
			System.out.println(it.next());
		}
		

	}

}
