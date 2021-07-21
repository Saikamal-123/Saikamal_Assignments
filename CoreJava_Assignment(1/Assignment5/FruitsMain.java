package Assignment5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FruitsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Fruits> list=Arrays.asList(new Fruits("mango",200,100,"yellow"),
				new Fruits("apple",150,250,"red"),
				new Fruits("grapes",80,50,"green"),
				new Fruits("banana",300,40,"yellow"),
				new Fruits("black grapes",60,90,"black"));
		//Collections.sort(list,Collections.reverseOrder());
		list.stream()
		.filter(a->a.getCalories()<100)
		.sorted((a1,a2)->a2.getCalories()-a1.getCalories())
		.forEach(a->System.out.println(a.getName()));
		
		System.out.println();
		
		System.out.println("Print color wise list of fruit names\n");
		
		list.stream()
		.sorted((a1,a2)->a1.getColour().compareTo(a2.getColour()))
		.forEach(a->System.out.println(a.getName()+"\t"+a.getColour()));
		
		System.out.println();
		
		System.out.println("Red color fruits sorted by ascending order of price");
		
		list.stream()
		.filter(a->a.getColour().equalsIgnoreCase("red"))
		.sorted((a1,a2)->a1.getPrice()-a2.getPrice())
		.forEach(System.out::println);

	}

}
