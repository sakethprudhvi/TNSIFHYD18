//Java program to demonstrate how the instance and static members are accessed
class SampleClass{
	int a=10; //instance variable
	static int b=20; //static variable
	void printA() //instance method
	{ 
		System.out.println("The value of the instance variable is "+a);
	}
	static int display() //static method
	{
		return b;
	}
}
public class Accessing {
	public static void main(String[] args) {
		SampleClass sc = new SampleClass();
		
		//object is used along with dot operator to access the instance variable
		System.out.println(sc.a);
		
		//Class name is used along with dot operator to access the static variable
		System.out.println(SampleClass.b);
		
		//object is used along with dot operator to access the instance method
		sc.printA();
		
		//Class name is used along with dot operator to access the static method
		System.out.println("The value of the static variable is "+SampleClass.display());
		
	}
	

}
