//Java program to Demonstrate overloading of static and instance members

class Addition{
	int add(int a,int b) //add method with 2 parameters
	{
		System.out.println("add method with 2 parameters is called:");
		return a+b;
	}
	int add(int a,int b,int c) //add method with 3 parameters
	{
		System.out.println("add method with 3 parameters is called:");
		return a+b+c;	
	}
}
class Multiplication{
	static int mul(int a,int b) //static method mul with 2 parameters
	{
		System.out.println("mul method with 2 parameters is called:");
		return b*a;
	}
	static int mul(int a,int b,int c) //static method mul with 3 parameters
	{
		System.out.println("mul method with 3 parameters is called:");
		return c*b*a;
		
	}
}

public class overloading {
	public static void main(String[] args) {
		Addition a1 = new Addition();
		Multiplication m1 = new Multiplication();

		int a=10;
		int b=20;
		int c=30;
		System.out.println("a + b = "+a1.add(a, b));
		System.out.println("a + b + c = "+a1.add(a, b, c));
		System.out.println("a * b = "+m1.mul(a, b));
		System.out.println("a * b * c = "+m1.mul(a, b, c));
	}
}
