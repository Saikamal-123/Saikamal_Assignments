package Assignment4;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ThreadEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(24);
		list.add(10);
		list.add(29);
		list.add(15);
		list.add(10);
		Thread thread=new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				Consumer<Integer> cons=i->list.add(i);
				cons.accept(20);
				System.out.println(list);
			}
			
		});
		thread.run();
         
	}

}
