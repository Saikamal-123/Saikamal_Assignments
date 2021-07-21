package Assignment3;
import java.util.*;
import java.lang.*;
public class Employee5{
	String name;
	int salary;
	Employee5(String name,int salary)
	{
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
     public boolean equals(Object o)
	 {
		 return true;
	 }
	 @Override
	 public int hashCode()
	 {
		 return 10;
	 }
}
