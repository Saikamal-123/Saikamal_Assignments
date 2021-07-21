package Assignment3;
import java.util.*;
public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		Vector<Integer> vec=new Vector<>(n);
		for(int i=0;i<=n;i++)
		{
			vec.add(i);
		}
		System.out.println(vec);
		Iterator<Integer> it=vec.iterator();
		while(it.hasNext()) {
			vec.add(12);
			System.out.println(it.next());
		}
	}
	
	

}
