//Java program to Demonstrate overloading of static and instance members

class Addition{
	int add(int a,int b) {
		System.out.println("Add method with 2 parameters is called");
		return a+b;
	}
	int add(int a,int b,int c) {
		System.out.println("Add method with 3 parameters is called");
		return a+b+c;
		
	}
	
}

public class overloading {
	public static void main(String[] args) {
		Addition a1 = new Addition();

		int a=10;
		int b=20;
		int c=30;
		System.out.println("a + b = "+a1.add(a, b));
		System.out.println("a + b + c = "+a1.add(a, b, c));

	}

}
