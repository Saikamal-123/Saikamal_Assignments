package Assignment4;

public class BasicArithmetic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=10,j=5;
		Operations operations=(a,b)-> a+b;
		Operations operations1=(a,b)-> a-b;
		Operations operations2=(a,b)-> a/b;
		Operations operations3=(a,b)-> a*b;
		System.out.println("Addition");
		System.out.println(operations.perform(10, 5));
		System.out.println("Subtraction");
		System.out.println(operations1.perform(10, 5));
		System.out.println("Division");
		System.out.println(operations2.perform(10, 5));
		System.out.println("Multiplication");
		System.out.println(operations3.perform(10, 5));
	}
	
	interface Operations
	{
		int perform(int a,int b);
	}

}
