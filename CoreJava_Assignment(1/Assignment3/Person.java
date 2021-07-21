package Assignment3;
import java.util.*;


public class Person implements Comparable<Person> {
	String name;
	int height;
	int weight;
	Person(String name,int height,int weight)
	{
		this.name=name;
		this.height=height;
		this.weight=weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	@Override
	public int compareTo(Person p) {
		// TODO Auto-generated method stub
		return this.weight -p.getWeight();
	}
	
	}


