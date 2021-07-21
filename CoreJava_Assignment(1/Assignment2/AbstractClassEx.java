package Assignment2;

public class AbstractClassEx extends AbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClassEx ac=new AbstractClassEx();
		ac.method1();
		ac.method2();
	}

	@Override
	void method1() {
		// TODO Auto-generated method stub
		System.out.println("Implementation is done here for method 1!!");
		
	}
	void method2() 
	{
		System.out.println("Implementation is done here for method 2!!");
	}

}
